import {
    Component,
    EventEmitter,
    Input,
    Output,
    inject,
} from '@angular/core';

import { FormsModule } from '@angular/forms';

import { Employee } from '../../models/employee';
import { EmployeeService } from '../../services/employee.service';

@Component({
    selector: 'app-employee-form',
    standalone: true,
    imports: [FormsModule],
    templateUrl: './employee-form.html',
    styleUrl: './employee-form.css'
})
export class EmployeeForm {

    private readonly employeeService = inject(EmployeeService);

    private _employeeToEdit: Employee | null = null;

    @Input()
    set employeeToEdit(value: Employee | null) {

        this._employeeToEdit = value;

        if (value) {

            this.employee = {
                empId: value.empId,
                empName: value.empName,
                empEmail: value.empEmail,
                empDepartment: value.empDepartment,
                empSalary: value.empSalary
            };

            console.log('EmployeeForm received:', value);
            console.log('Form populated:', this.employee);

        } else {

            this.employee = this.createEmptyEmployee();

        }

        this.errorMessage = '';
        this.resetTouched();
    }

    get employeeToEdit(): Employee | null {
        return this._employeeToEdit;
    }

    @Output() employeeCreated =
        new EventEmitter<Employee>();

    @Output() employeeUpdated =
        new EventEmitter<Employee>();

    @Output() cancel =
        new EventEmitter<void>();

    employee: Employee = this.createEmptyEmployee();

    isSaving = false;

    errorMessage = '';

    nameTouched = false;
    emailTouched = false;
    departmentTouched = false;
    salaryTouched = false;


    get isEditMode(): boolean {

        return this._employeeToEdit !== null;

    }


    saveEmployee(): void {

        this.nameTouched = true;
        this.emailTouched = true;
        this.departmentTouched = true;
        this.salaryTouched = true;

        this.errorMessage = '';


        if (
            !this.employee.empName.trim() ||
            !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(
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


        // UPDATE
        if (
            this.isEditMode &&
            this.employee.empId !== undefined
        ) {

            this.employeeService
                .updateEmployee(
                    this.employee.empId,
                    this.employee
                )
                .subscribe({

                    next: (updatedEmployee) => {

                        this.isSaving = false;

                        this.employeeUpdated.emit(
                            updatedEmployee
                        );

                    },

                    error: (error) => {

                        this.isSaving = false;

                        console.error(
                            'Error updating employee:',
                            error
                        );

                        this.errorMessage =
                            'Unable to update employee. Please try again.';

                    }

                });

            return;
        }


        // CREATE
        this.employeeService
            .createEmployee(this.employee)
            .subscribe({

                next: (createdEmployee) => {

                    this.isSaving = false;

                    this.employeeCreated.emit(
                        createdEmployee
                    );

                },

                error: (error) => {

                    this.isSaving = false;

                    console.error(
                        'Error creating employee:',
                        error
                    );

                    this.errorMessage =
                        'Unable to create employee. Please try again.';

                }

            });

    }


    cancelForm(): void {

        this.cancel.emit();

    }


    isNameInvalid(): boolean {

        return (
            this.nameTouched &&
            !this.employee.empName.trim()
        );

    }


    isEmailInvalid(): boolean {

        if (!this.emailTouched) {
            return false;
        }

        const email =
            this.employee.empEmail.trim();

        return !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(
            email
        );

    }


    isDepartmentInvalid(): boolean {

        return (
            this.departmentTouched &&
            !this.employee.empDepartment.trim()
        );

    }


    isSalaryInvalid(): boolean {

        return (
            this.salaryTouched &&
            (
                this.employee.empSalary <= 0 ||
                !this.employee.empSalary
            )
        );

    }


    private resetTouched(): void {

        this.nameTouched = false;
        this.emailTouched = false;
        this.departmentTouched = false;
        this.salaryTouched = false;

    }


    private createEmptyEmployee(): Employee {

        return {

            empName: '',
            empEmail: '',
            empDepartment: '',
            empSalary: 0

        };

    }

}