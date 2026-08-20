import {
  Component,
  OnInit,
  ChangeDetectorRef,
  inject
} from '@angular/core';

import {
  ActivatedRoute,
  Router
} from '@angular/router';

import { Employee } from '../../models/employee';
import { EmployeeService } from '../../services/employee.service';
import { EmployeeForm } from '../../components/employee-form/employee-form';


@Component({
  selector: 'app-employee-form-page',
  standalone: true,
  imports: [EmployeeForm],
  templateUrl: './employee-form-page.html',
  styleUrl: './employee-form-page.css'
})
export class EmployeeFormPage implements OnInit {

  employeeToEdit: Employee | null = null;

  isEditMode = false;

  private readonly route = inject(ActivatedRoute);

  private readonly router = inject(Router);

  private readonly employeeService =
    inject(EmployeeService);

  private readonly cdr =
    inject(ChangeDetectorRef);


  ngOnInit(): void {

    const employeeId =
      this.route.snapshot.paramMap.get('id');


    console.log(
      'URL employee ID:',
      employeeId
    );


    // ==========================================
    // ADD EMPLOYEE
    // ==========================================

    if (!employeeId) {

      console.log(
        'Add employee mode'
      );

      this.isEditMode = false;

      this.employeeToEdit = null;

      this.cdr.detectChanges();

      return;
    }


    // ==========================================
    // EDIT EMPLOYEE
    // ==========================================

    this.isEditMode = true;

    console.log(
      'Edit employee mode'
    );


    this.employeeService
      .getAllEmployees()
      .subscribe({

        next: (employees) => {

          console.log(
            'Employees from API:',
            employees
          );


          const employee =
            employees.find(
              e =>
                Number(e.empId) ===
                Number(employeeId)
            );


          console.log(
            'Employee found:',
            employee
          );


          if (employee) {

            this.employeeToEdit = {
              ...employee
            };


            console.log(
              'employeeToEdit:',
              this.employeeToEdit
            );


            // IMPORTANT:
            // Force Angular to refresh the view
            this.cdr.detectChanges();

          } else {

            console.error(
              'Employee not found:',
              employeeId
            );

            this.router.navigate([
              '/employees'
            ]);

          }

        },


        error: (error) => {

          console.error(
            'Unable to load employee:',
            error
          );

          this.router.navigate([
            '/employees'
          ]);

        }

      });

  }


  onEmployeeCreated(
    employee: Employee
  ): void {

    console.log(
      'Employee created:',
      employee
    );

    this.router.navigate([
      '/employees'
    ]);

  }


  onEmployeeUpdated(
    employee: Employee
  ): void {

    console.log(
      'Employee updated:',
      employee
    );

    this.router.navigate([
      '/employees'
    ]);

  }


  cancel(): void {

    this.router.navigate([
      '/employees'
    ]);

  }

}