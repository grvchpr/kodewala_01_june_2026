import { Routes } from '@angular/router';

import {
  EmployeeList
} from './components/employee-list/employee-list';

import {
  EmployeeFormPage
} from './pages/employee-form-page/employee-form-page';

export const routes: Routes = [

  {
    path: '',
    redirectTo: 'employees',
    pathMatch: 'full'
  },

  {
    path: 'employees',
    component: EmployeeList
  },

  {
    path: 'employees/add',
    component: EmployeeFormPage
  },

  {
    path: 'employees/edit/:id',
    component: EmployeeFormPage
  },

  {
    path: '**',
    redirectTo: 'employees'
  }

];