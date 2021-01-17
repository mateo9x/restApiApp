import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarListComponent} from './car/car-list/car-list.component';
import { CarAddComponent} from './car/car-add/car-add.component';
import {CarUpdateComponent} from './car/car-update/car-update.component';
import {CarDetailsComponent} from './car/car-details/car-details.component';
import {ExhaustListComponent} from './exhaust/exhaust-list/exhaust-list.component';
import {ExhaustAddComponent} from './exhaust/exhaust-add/exhaust-add.component';
import {ExhaustUpdateComponent} from './exhaust/exhaust-update/exhaust-update.component';
import {ExhaustDetailsComponent} from './exhaust/exhaust-details/exhaust-details.component';
import {SuspensionListComponent} from './suspension/suspension-list/suspension-list.component';
import {SuspensionAddComponent} from './suspension/suspension-add/suspension-add.component';
import {SuspensionUpdateComponent} from './suspension/suspension-update/suspension-update.component';
import {SuspensionDetailsComponent} from './suspension/suspension-details/suspension-details.component';
import {WheelListComponent} from './wheel/wheel-list/wheel-list.component';
import {WheelAddComponent} from './wheel/wheel-add/wheel-add.component';
import {WheelUpdateComponent} from './wheel/wheel-update/wheel-update.component';
import {WheelDetailsComponent} from './wheel/wheel-details/wheel-details.component';

const routes: Routes = [
  { path: '', redirectTo: 'car', pathMatch: 'full' },
  { path: 'cars', component: CarListComponent },
  { path: 'addCar', component: CarAddComponent },
  { path: 'update/:id', component: CarUpdateComponent },
  { path: 'details/:id', component: CarDetailsComponent },
  { path: 'exhausts', component: ExhaustListComponent },
  { path: 'addExhaust', component: ExhaustAddComponent },
  { path: 'exhaustUpdate/:id', component: ExhaustUpdateComponent },
  { path: 'exhaustDetails/:id', component: ExhaustDetailsComponent },
  { path: 'suspensions', component: SuspensionListComponent },
  { path: 'addSuspension', component: SuspensionAddComponent },
  { path: 'suspensionUpdate/:id', component: SuspensionUpdateComponent },
  { path: 'suspensionDetails/:id', component: SuspensionDetailsComponent },
  { path: 'wheels', component: WheelListComponent },
  { path: 'addWheel', component: WheelAddComponent },
  { path: 'wheelUpdate/:id', component: WheelUpdateComponent },
  { path: 'wheelDetails/:id', component: WheelDetailsComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
