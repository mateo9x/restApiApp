import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {Wheel} from '../wheel';
import {WheelService} from '../wheel.service';

@Component({
  selector: 'app-wheel-details',
  templateUrl: './wheel-details.component.html',
  styleUrls: ['./wheel-details.component.css']
})
export class WheelDetailsComponent implements OnInit {


  id: number;
  wheel: Wheel;

  constructor(private route: ActivatedRoute,private router: Router,
              private wheelService: WheelService) { }

  ngOnInit() {
    this.wheel = new Wheel();

    this.id = this.route.snapshot.params['id'];

    this.wheelService.getWheel(this.id)
      .subscribe(data => {
        console.log(data)
        this.wheel = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['wheels']);
  }
}
