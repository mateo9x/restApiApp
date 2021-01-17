import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {Suspension} from '../suspension';
import {SuspensionService} from '../suspension.service';

@Component({
  selector: 'app-suspension-update',
  templateUrl: './suspension-update.component.html',
  styleUrls: ['./suspension-update.component.css']
})
export class SuspensionUpdateComponent implements OnInit {

  id:number;
  suspension: Suspension;

  constructor(private route:ActivatedRoute, private router: Router,
              private suspensionService:SuspensionService) { }

  ngOnInit(): void {
    this.suspension = new Suspension();

    this.id = this.route.snapshot.params['id'];

    this.suspensionService.getSuspension(this.id)
      .subscribe(data => {
        console.log(data)
        this.suspension = data;
      }, error => console.log(error));
  }

  updateSuspension() {
    this.suspensionService.updateSuspension(this.id, this.suspension)
      .subscribe(data => console.log(data), error => console.log(error));
    this.suspension = new Suspension();
    this.gotoList();
  }

  onSubmit() {
    this.updateSuspension();
  }

  gotoList() {
    this.router.navigate(['/suspensions']);
  }


}
