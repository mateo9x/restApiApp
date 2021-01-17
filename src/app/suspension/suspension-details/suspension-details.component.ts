import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {Suspension} from '../suspension';
import {SuspensionService} from '../suspension.service';

@Component({
  selector: 'app-suspension-details',
  templateUrl: './suspension-details.component.html',
  styleUrls: ['./suspension-details.component.css']
})
export class SuspensionDetailsComponent implements OnInit {

  id: number;
  suspension: Suspension;

  constructor(private route: ActivatedRoute,private router: Router,
              private suspensionService: SuspensionService) { }

  ngOnInit() {
    this.suspension = new Suspension();

    this.id = this.route.snapshot.params['id'];

    this.suspensionService.getSuspension(this.id)
      .subscribe(data => {
        console.log(data)
        this.suspension = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['suspensions']);
  }
}
