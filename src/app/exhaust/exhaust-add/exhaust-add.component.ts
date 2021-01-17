import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {Exhaust} from '../exhaust';
import {ExhaustService} from '../exhaust.service';

@Component({
  selector: 'app-exhaust-add',
  templateUrl: './exhaust-add.component.html',
  styleUrls: ['./exhaust-add.component.css']
})
export class ExhaustAddComponent implements OnInit {

  exhaust: Exhaust = new Exhaust();
  submitted = false;

  constructor(private exhaustService: ExhaustService,
              private router: Router) { }

  ngOnInit() {
  }

  newExhaust(): void {
    this.submitted = false;
    this.exhaust = new Exhaust();
  }

  save() {
    this.exhaustService.createExhaust(this.exhaust)
      .subscribe(data => console.log(data), error => console.log(error));
    this.exhaust = new Exhaust();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/exhausts']);
  }
}
