import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {Exhaust} from '../../exhaust/exhaust';
import {ExhaustService} from '../../exhaust/exhaust.service';
import {Router} from '@angular/router';
import {Suspension} from '../suspension';
import {SuspensionService} from '../suspension.service';

@Component({
  selector: 'app-suspension-list',
  templateUrl: './suspension-list.component.html',
  styleUrls: ['./suspension-list.component.css']
})
export class SuspensionListComponent implements OnInit {

  suspensions: Observable<Suspension[]>;

  constructor(private suspensionService: SuspensionService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.suspensions = this.suspensionService.getSuspensionList();
  }

  deleteSuspension(id: number) {
    this.suspensionService.deleteSuspension(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  suspensionDetails(id: number){
    this.router.navigate(['suspensionDetails', id]);
  }

  suspensionUpdate(id: number){
    this.router.navigate(['suspensionUpdate', id]);
  }

}
