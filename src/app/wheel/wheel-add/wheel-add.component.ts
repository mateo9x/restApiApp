import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {Wheel} from '../wheel';
import {WheelService} from '../wheel.service';

@Component({
  selector: 'app-wheel-add',
  templateUrl: './wheel-add.component.html',
  styleUrls: ['./wheel-add.component.css']
})
export class WheelAddComponent implements OnInit {

  wheel: Wheel = new Wheel();
  submitted = false;

  constructor(private wheelService: WheelService,
              private router: Router) { }

  ngOnInit() {
  }

  newWheel(): void {
    this.submitted = false;
    this.wheel = new Wheel();
  }

  save() {
    this.wheelService.createWheel(this.wheel)
      .subscribe(data => console.log(data), error => console.log(error));
    this.wheel = new Wheel();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/wheels']);
  }
}
