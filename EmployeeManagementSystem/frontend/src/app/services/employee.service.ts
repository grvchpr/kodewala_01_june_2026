import {
  Injectable,
  inject
} from '@angular/core';

import {
  HttpClient
} from '@angular/common/http';

import {
  Observable
} from 'rxjs';

import {
  Employee
} from '../models/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private readonly apiUrl =
    'http://localhost:8080/api/employees';

  private readonly http =
    inject(HttpClient);

  getAllEmployees(): Observable<Employee[]> {

    return this.http.get<Employee[]>(
      this.apiUrl
    );

  }

  getEmployeeById(
    id: number
  ): Observable<Employee> {

    return this.http.get<Employee>(
      `${this.apiUrl}/${id}`
    );

  }

  createEmployee(
    employee: Employee
  ): Observable<Employee> {

    return this.http.post<Employee>(
      this.apiUrl,
      employee
    );

  }

  updateEmployee(
    id: number,
    employee: Employee
  ): Observable<Employee> {

    return this.http.put<Employee>(
      `${this.apiUrl}/${id}`,
      employee
    );

  }

  deleteEmployee(
    id: number
  ): Observable<string> {

    return this.http.delete(
      `${this.apiUrl}/${id}`,
      {
        responseType: 'text'
      }
    );

  }
}