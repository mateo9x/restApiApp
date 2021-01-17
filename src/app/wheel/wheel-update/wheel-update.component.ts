import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {Wheel} from '../wheel';
import {WheelService} from '../wheel.service';

@Component({
  selector: 'app-wheel-update',
  templateUrl: './wheel-update.component.html',
  styleUrls: ['./wheel-update.component.css']
})
export class WheelUpdateComponent implements OnInit {

  id:number;
  wheel: Wheel;

  constructor(private route:ActivatedRoute, private router: Router,
              private wheelService:WheelService) { }

  ngOnInit(): void {
      this.wheel = new Wheel();

    this.id = this.route.snapshot.params['id'];

    this.wheelService.getWheel(this.id)
      .subscribe(data => {
        console.log(data)
        this.wheel = data;
      }, error => console.log(error));
  }

  updateWheel() {
    this.wheelService.updateWheel(this.id, this.wheel)
      .subscribe(data => console.log(data), error => console.log(error));
    this.wheel = new Wheel();
    this.gotoList();
  }

  onSubmit() {
    this.updateWheel();
  }

  gotoList() {
    this.router.navigate(['/wheels']);
  }


}
