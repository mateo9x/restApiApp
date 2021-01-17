import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {Router} from '@angular/router';
import {Wheel} from '../wheel';
import {WheelService} from '../wheel.service';

@Component({
  selector: 'app-wheel-list',
  templateUrl: './wheel-list.component.html',
  styleUrls: ['./wheel-list.component.css']
})
export class WheelListComponent implements OnInit {

  wheels: Observable<Wheel[]>;

  constructor(private wheelService: WheelService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.wheels = this.wheelService.getWheelList();
  }

  deleteWheel(id: number) {
    this.wheelService.deleteWheel(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  wheelDetails(id: number){
    this.router.navigate(['wheelDetails', id]);
  }

  wheelUpdate(id: number){
    this.router.navigate(['wheelUpdate', id]);
  }
}
