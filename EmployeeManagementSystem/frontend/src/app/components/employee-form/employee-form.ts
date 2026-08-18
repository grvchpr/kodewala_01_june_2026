import {
  Component,
  EventEmitter,
  Input,
  Output,
  OnChanges,
  SimpleChanges,
  inject
} from '@angular/core';

import { FormsModule } from '@angular/forms';

import { Employee } from '../../models/employee';
import { EmployeeService } from '../../services/employee.service';


@Component({
  selector: 'app-employee-form',

  standalone: true,

  imports: [
    FormsModule
  ],

  templateUrl: './employee-form.html',

  styleUrl: './employee-form.css'
})
export class EmployeeForm implements OnChanges {

  // ==========================================
  // INPUT
  // ==========================================

  @Input()
  employeeToEdit: Employee | null = null;


  // ==========================================
  // OUTPUTS
  // ==========================================

  @Output()
  employeeCreated =
    new EventEmitter<Employee>();


  @Output()
  employeeUpdated =
    new EventEmitter<Employee>();


  @Output()
  cancel =
    new EventEmitter<void>();


  // ==========================================
  // SERVICE
  // ==========================================

  private readonly employeeService =
    inject(EmployeeService);


  // ==========================================
  // EMPLOYEE FORM DATA
  // ==========================================

  employee: Employee =
    this.createEmptyEmployee();


  // ==========================================
  // STATE
  // ==========================================

  isSaving = false;

  errorMessage = '';

  nameTouched = false;

  emailTouched = false;

  departmentTouched = false;

  salaryTouched = false;


  // ==========================================
  // EDIT MODE
  // ==========================================

  get isEditMode(): boolean {

    return this.employeeToEdit !== null;

  }


  // ==========================================
  // INPUT CHANGE
  // ==========================================

  ngOnChanges(
    changes: SimpleChanges
  ): void {

    console.log(
      'ngOnChanges:',
      changes
    );


    if (
      changes['employeeToEdit']
    ) {

      console.log(
        'employeeToEdit changed:',
        this.employeeToEdit
      );


      if (this.employeeToEdit) {

        // ======================================
        // EDIT MODE
        // ======================================

        this.employee = {
          empId: this.employeeToEdit.empId,

          empName:
            this.employeeToEdit.empName,

          empEmail:
            this.employeeToEdit.empEmail,

          empDepartment:
            this.employeeToEdit.empDepartment,

          empSalary:
            this.employeeToEdit.empSalary
        };


        console.log(
          'FORM DATA SET:',
          this.employee
        );

      } else {

        // ======================================
        // ADD MODE
        // ======================================

        this.employee =
          this.createEmptyEmployee();

      }


      // Reset validation

      this.errorMessage = '';

      this.nameTouched = false;

      this.emailTouched = false;

      this.departmentTouched = false;

      this.salaryTouched = false;

    }

  }


  // ==========================================
  // SAVE EMPLOYEE
  // ==========================================

  saveEmployee(): void {

    this.nameTouched = true;

    this.emailTouched = true;

    this.departmentTouched = true;

    this.salaryTouched = true;


    this.errorMessage = '';


    // ========================================
    // VALIDATION
    // ========================================

    if (

      !this.employee.empName.trim() ||

      !/^[^\s@]+@[^\s@]+\.[^\s@]+$/
        .test(
          this.employee.empEmail.trim()
        ) ||

      !this.employee.empDepartment.trim() ||

      this.employee.empSalary <= 0

    ) {

      this.errorMessage =
        'Please correct the highlighted fields.';

      return;

    }


    this.isSaving = true;


    // ========================================
    // UPDATE
    // ========================================

    if (

      this.isEditMode &&

      this.employee.empId !== undefined

    ) {

      console.log(
        'Updating employee:',
        this.employee
      );


      this.employeeService

        .updateEmployee(
          this.employee.empId,
          this.employee
        )

        .subscribe({

          next: (
            updatedEmployee
          ) => {

            console.log(
              'Employee updated:',
              updatedEmployee
            );


            this.isSaving = false;


            this.employeeUpdated.emit(
              updatedEmployee
            );

          },


          error: (error) => {

            console.error(
              'Error updating employee:',
              error
            );


            this.isSaving = false;


            this.errorMessage =
              'Unable to update employee. Please try again.';

          }

        });


      return;

    }


    // ========================================
    // CREATE
    // ========================================

    console.log(
      'Creating employee:',
      this.employee
    );


    this.employeeService

      .createEmployee(
        this.employee
      )

      .subscribe({

        next: (
          createdEmployee
        ) => {

          console.log(
            'Employee created:',
            createdEmployee
          );


          this.isSaving = false;


          this.employeeCreated.emit(
            createdEmployee
          );

        },


        error: (error) => {

          console.error(
            'Error creating employee:',
            error
          );


          this.isSaving = false;


          this.errorMessage =
            'Unable to create employee. Please try again.';

        }

      });

  }


  // ==========================================
  // CANCEL
  // ==========================================

  cancelForm(): void {

    this.cancel.emit();

  }


  // ==========================================
  // NAME VALIDATION
  // ==========================================

  isNameInvalid(): boolean {

    return (

      this.nameTouched &&

      !this.employee.empName.trim()

    );

  }


  // ==========================================
  // EMAIL VALIDATION
  // ==========================================

  isEmailInvalid(): boolean {

    if (!this.emailTouched) {

      return false;

    }


    const email =
      this.employee.empEmail.trim();


    return !/^[^\s@]+@[^\s@]+\.[^\s@]+$/
      .test(email);

  }


  // ==========================================
  // DEPARTMENT VALIDATION
  // ==========================================

  isDepartmentInvalid(): boolean {

    return (

      this.departmentTouched &&

      !this.employee.empDepartment.trim()

    );

  }


  // ==========================================
  // SALARY VALIDATION
  // ==========================================

  isSalaryInvalid(): boolean {

    return (

      this.salaryTouched &&

      (

        this.employee.empSalary <= 0 ||

        !this.employee.empSalary

      )

    );

  }


  // ==========================================
  // EMPTY EMPLOYEE
  // ==========================================

  private createEmptyEmployee():
    Employee {

    return {

      empName: '',

      empEmail: '',

      empDepartment: '',

      empSalary: 0

    };

  }

}