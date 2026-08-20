import {
  Component,
  OnInit,
  ChangeDetectorRef,
  inject
} from '@angular/core';

import { DecimalPipe } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

import { Employee } from '../../models/employee';
import { EmployeeService } from '../../services/employee.service';


@Component({
  selector: 'app-employee-list',
  standalone: true,

  imports: [
    DecimalPipe,
    FormsModule,
    RouterLink
  ],

  templateUrl: './employee-list.html',

  styleUrl: './employee-list.css'
})
export class EmployeeList implements OnInit {


  // =========================================================
  // DATA
  // =========================================================

  employees: Employee[] = [];

  filteredEmployees: Employee[] = [];


  // =========================================================
  // SEARCH
  // =========================================================

  searchText = '';


  // =========================================================
  // DEPARTMENT
  // =========================================================

  selectedDepartment = 'All';

  departments: string[] = [];


  // =========================================================
  // SALARY SORT
  // =========================================================

  salarySort: 'default' | 'asc' | 'desc' = 'default';


  // =========================================================
  // UI STATE
  // =========================================================

  isLoading = false;

  errorMessage = '';


  // =========================================================
  // SERVICES
  // =========================================================

  private readonly employeeService =
    inject(EmployeeService);

  private readonly router =
    inject(Router);

  private readonly cdr =
    inject(ChangeDetectorRef);


  // =========================================================
  // INIT
  // =========================================================

  ngOnInit(): void {

    this.loadEmployees();

  }


  // =========================================================
  // LOAD EMPLOYEES
  // =========================================================

  loadEmployees(): void {

    console.log('Loading employees...');

    this.isLoading = true;

    this.errorMessage = '';

    this.cdr.detectChanges();


    this.employeeService
      .getAllEmployees()
      .subscribe({

        next: (data: Employee[]) => {

          console.log(
            'Employees received from API:',
            data
          );


          // Store employees

          this.employees = data ?? [];


          // Create departments

          this.departments = [
            ...new Set(
              this.employees
                .map(
                  employee =>
                    employee.empDepartment
                )
            )
          ].sort();


          // Apply search/filter/sort

          this.applyFilters();


          // IMPORTANT
          // Stop loading AFTER data is ready

          this.isLoading = false;


          console.log(
            'isLoading:',
            this.isLoading
          );

          console.log(
            'filteredEmployees:',
            this.filteredEmployees
          );


          // Force Angular UI update

          this.cdr.detectChanges();

        },


        error: (error) => {

          console.error(
            'Error loading employees:',
            error
          );


          this.isLoading = false;

          this.errorMessage =
            'Unable to load employees. Please try again.';


          // Force UI update

          this.cdr.detectChanges();

        }

      });

  }


  // =========================================================
  // ADD EMPLOYEE
  // =========================================================

  openAddEmployee(): void {

    this.router.navigate([
      '/employees/add'
    ]);

  }


  // =========================================================
  // SEARCH EMPLOYEES
  // =========================================================

  searchEmployees(): void {

    this.applyFilters();

  }


  // =========================================================
  // DEPARTMENT FILTER
  // =========================================================

  filterByDepartment(): void {

    this.applyFilters();

  }


  // =========================================================
  // SALARY SORT
  // =========================================================

  sortBySalary(): void {

    if (
      this.salarySort === 'default'
    ) {

      this.salarySort = 'asc';

    }

    else if (
      this.salarySort === 'asc'
    ) {

      this.salarySort = 'desc';

    }

    else {

      this.salarySort = 'default';

    }


    this.applyFilters();

  }


  // =========================================================
  // APPLY FILTERS
  // =========================================================

  applyFilters(): void {

    const search =
      this.searchText
        .trim()
        .toLowerCase();


    let result: Employee[] = [
      ...this.employees
    ];


    // -------------------------------------------------------
    // SEARCH
    // -------------------------------------------------------

    if (search) {

      result = result.filter(
        employee => {

          const name =
            employee.empName
              ?.toLowerCase() ?? '';

          const email =
            employee.empEmail
              ?.toLowerCase() ?? '';

          const department =
            employee.empDepartment
              ?.toLowerCase() ?? '';


          return (

            name.includes(search) ||

            email.includes(search) ||

            department.includes(search)

          );

        }
      );

    }


    // -------------------------------------------------------
    // DEPARTMENT
    // -------------------------------------------------------

    if (
      this.selectedDepartment !== 'All'
    ) {

      result = result.filter(
        employee =>
          employee.empDepartment ===
          this.selectedDepartment
      );

    }


    // -------------------------------------------------------
    // SALARY SORT
    // -------------------------------------------------------

    if (
      this.salarySort === 'asc'
    ) {

      result.sort(
        (a, b) =>
          Number(a.empSalary) -
          Number(b.empSalary)
      );

    }

    else if (
      this.salarySort === 'desc'
    ) {

      result.sort(
        (a, b) =>
          Number(b.empSalary) -
          Number(a.empSalary)
      );

    }


    // -------------------------------------------------------
    // FINAL RESULT
    // -------------------------------------------------------

    this.filteredEmployees = result;


    console.log(
      'Filtered employees:',
      this.filteredEmployees
    );

  }


  // =========================================================
  // RETRY
  // =========================================================

  retryLoadEmployees(): void {

    this.loadEmployees();

  }


  // =========================================================
  // DELETE EMPLOYEE
  // =========================================================

  deleteEmployee(
    employee: Employee
  ): void {


    const confirmed =
      window.confirm(
        `Are you sure you want to delete ${employee.empName}?`
      );


    if (!confirmed) {

      return;

    }


    if (
      employee.empId === undefined
    ) {

      return;

    }


    this.employeeService
      .deleteEmployee(employee.empId)
      .subscribe({

        next: () => {

          console.log(
            'Employee deleted:',
            employee
          );


          // Remove employee

          this.employees =
            this.employees.filter(
              e =>
                e.empId !==
                employee.empId
            );


          // Rebuild departments

          this.departments = [
            ...new Set(
              this.employees
                .map(
                  e =>
                    e.empDepartment
                )
            )
          ].sort();


          // Reapply filters

          this.applyFilters();


          // Refresh UI

          this.cdr.detectChanges();

        },


        error: (error) => {

          console.error(
            'Error deleting employee:',
            error
          );


          alert(
            'Unable to delete employee. Please try again.'
          );

        }

      });

  }

}