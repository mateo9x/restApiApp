import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { CarListComponent } from './car/car-list/car-list.component';
import { CarAddComponent } from './car/car-add/car-add.component';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {DataTablesModule} from 'angular-datatables';
import { CarUpdateComponent } from './car/car-update/car-update.component';
import { CarDetailsComponent } from './car/car-details/car-details.component';
import { ExhaustUpdateComponent } from './exhaust/exhaust-update/exhaust-update.component';
import { ExhaustDetailsComponent } from './exhaust/exhaust-details/exhaust-details.component';
import { ExhaustAddComponent } from './exhaust/exhaust-add/exhaust-add.component';
import {ExhaustListComponent} from './exhaust/exhaust-list/exhaust-list.component';
import { SuspensionAddComponent } from './suspension/suspension-add/suspension-add.component';
import { SuspensionDetailsComponent } from './suspension/suspension-details/suspension-details.component';
import { SuspensionListComponent } from './suspension/suspension-list/suspension-list.component';
import { SuspensionUpdateComponent } from './suspension/suspension-update/suspension-update.component';
import { WheelAddComponent } from './wheel/wheel-add/wheel-add.component';
import { WheelDetailsComponent } from './wheel/wheel-details/wheel-details.component';
import { WheelListComponent } from './wheel/wheel-list/wheel-list.component';
import { WheelUpdateComponent } from './wheel/wheel-update/wheel-update.component';

@NgModule({
  declarations: [
    AppComponent,
    CarListComponent,
    CarAddComponent,
    CarUpdateComponent,
    CarDetailsComponent,
    ExhaustListComponent,
    ExhaustUpdateComponent,
    ExhaustDetailsComponent,
    ExhaustAddComponent,
    SuspensionAddComponent,
    SuspensionDetailsComponent,
    SuspensionListComponent,
    SuspensionUpdateComponent,
    WheelAddComponent,
    WheelDetailsComponent,
    WheelListComponent,
    WheelUpdateComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    DataTablesModule,
    ReactiveFormsModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
