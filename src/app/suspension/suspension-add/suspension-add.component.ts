import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {Suspension} from '../suspension';
import {SuspensionService} from '../suspension.service';

@Component({
  selector: 'app-suspension-add',
  templateUrl: './suspension-add.component.html',
  styleUrls: ['./suspension-add.component.css']
})
export class SuspensionAddComponent implements OnInit {

  suspension: Suspension = new Suspension();
  submitted = false;

  constructor(private suspensionService: SuspensionService,
              private router: Router) { }

  ngOnInit() {
  }

  newSuspension(): void {
    this.submitted = false;
    this.suspension = new Suspension();
  }

  save() {
    this.suspensionService.createSuspension(this.suspension)
      .subscribe(data => console.log(data), error => console.log(error));
    this.suspension = new Suspension();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/suspensions']);
  }
}
