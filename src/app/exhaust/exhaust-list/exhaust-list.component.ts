import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {Router} from '@angular/router';
import {Exhaust} from '../exhaust';
import {ExhaustService} from '../exhaust.service';

@Component({
  selector: 'app-exhaust-list',
  templateUrl: './exhaust-list.component.html',
  styleUrls: ['./exhaust-list.component.css']
})
export class ExhaustListComponent implements OnInit {

  exhausts: Observable<Exhaust[]>;

  constructor(private exhaustService: ExhaustService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.exhausts = this.exhaustService.getExhaustList();
  }

  deleteExhaust(id: number) {
    this.exhaustService.deleteExhaust(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  exhaustDetails(id: number){
    this.router.navigate(['exhaustDetails', id]);
  }

  exhaustUpdate(id: number){
    this.router.navigate(['exhaustUpdate', id]);
  }
}
