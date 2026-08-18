import { Component, OnInit, inject } from '@angular/core';
import { DecimalPipe } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterLink } from '@angular/router';

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

  employees: Employee[] = [];

  filteredEmployees: Employee[] = [];

  searchText = '';

  selectedDepartment = 'All';

  salarySort: 'default' | 'asc' | 'desc' = 'default';

  departments: string[] = [];

  showForm = false;

  employeeToEdit: Employee | null = null;

  isLoading = false;

  errorMessage = '';

  private readonly employeeService = inject(EmployeeService);

  ngOnInit(): void {
    this.loadEmployees();
  }

  loadEmployees(): void {

  this.isLoading = true;
  this.errorMessage = '';

  this.employeeService.getAllEmployees().subscribe({

    next: (data) => {

      this.employees = data;

      this.departments = [
        ...new Set(
          data.map(employee => employee.empDepartment)
        )
      ].sort();

      this.applyFilters();

      this.isLoading = false;
    },

    error: (error) => {

      console.error('Error loading employees:', error);

      this.isLoading = false;

      this.errorMessage =
        'Unable to load employees. Please try again.';
    }

  });
}

  applyFilters(): void {

    const search = this.searchText
      .trim()
      .toLowerCase();

    let result = [...this.employees];

    // Search
    if (search) {

      result = result.filter(employee =>

        employee.empName
          .toLowerCase()
          .includes(search)

        ||

        employee.empEmail
          .toLowerCase()
          .includes(search)

        ||

        employee.empDepartment
          .toLowerCase()
          .includes(search)

      );

    }

    // Department filter
    if (this.selectedDepartment !== 'All') {

      result = result.filter(
        employee =>
          employee.empDepartment === this.selectedDepartment
      );

    }

    // Salary sorting
    if (this.salarySort === 'asc') {

      result.sort(
        (a, b) => a.empSalary - b.empSalary
      );

    } else if (this.salarySort === 'desc') {

      result.sort(
        (a, b) => b.empSalary - a.empSalary
      );

    }

    this.filteredEmployees = result;
  }

  searchEmployees(): void {
    this.applyFilters();
  }

  filterByDepartment(): void {
    this.applyFilters();
  }

  retryLoadEmployees(): void{
    this.loadEmployees();
  }

  sortBySalary(): void {

    if (this.salarySort === 'default') {

      this.salarySort = 'asc';

    } else if (this.salarySort === 'asc') {

      this.salarySort = 'desc';

    } else {

      this.salarySort = 'default';

    }

    this.applyFilters();
  }

  openAddEmployee(): void {

    this.employeeToEdit = null;

    this.showForm = true;

  }

  openEditEmployee(employee: Employee): void {

    this.employeeToEdit = { ...employee };

    this.showForm = true;

  }

  closeForm(): void {

    this.showForm = false;

    this.employeeToEdit = null;

  }

  onEmployeeCreated(employee: Employee): void {

    this.employees.push(employee);

    this.departments = [
      ...new Set(
        this.employees.map(e => e.empDepartment)
      )
    ].sort();

    this.applyFilters();

    this.closeForm();

  }

  onEmployeeUpdated(updatedEmployee: Employee): void {

    const index = this.employees.findIndex(
      employee =>
        employee.empId === updatedEmployee.empId
    );

    if (index !== -1) {

      this.employees[index] = updatedEmployee;

    }

    this.departments = [
      ...new Set(
        this.employees.map(e => e.empDepartment)
      )
    ].sort();

    this.applyFilters();

    this.closeForm();

  }

  deleteEmployee(employee: Employee): void {

    const confirmed = window.confirm(
      `Are you sure you want to delete ${employee.empName}?`
    );

    if (!confirmed) {
      return;
    }

    if (employee.empId === undefined) {
      return;
    }

    this.employeeService
      .deleteEmployee(employee.empId)
      .subscribe({

        next: () => {

          this.employees = this.employees.filter(
            e => e.empId !== employee.empId
          );

          this.departments = [
            ...new Set(
              this.employees.map(e => e.empDepartment)
            )
          ].sort();

          this.applyFilters();

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