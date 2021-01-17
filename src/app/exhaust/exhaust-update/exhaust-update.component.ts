import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {Exhaust} from '../exhaust';
import {ExhaustService} from '../exhaust.service';

@Component({
  selector: 'app-exhaust-update',
  templateUrl: './exhaust-update.component.html',
  styleUrls: ['./exhaust-update.component.css']
})
export class ExhaustUpdateComponent implements OnInit {

  id:number;
  exhaust: Exhaust;

  constructor(private route:ActivatedRoute, private router: Router,
              private exhaustService:ExhaustService) { }

  ngOnInit(): void {
    this.exhaust = new Exhaust();

    this.id = this.route.snapshot.params['id'];

    this.exhaustService.getExhaust(this.id)
      .subscribe(data => {
        console.log(data)
        this.exhaust = data;
      }, error => console.log(error));
  }

  updateExhaust() {
    this.exhaustService.updateExhaust(this.id, this.exhaust)
      .subscribe(data => console.log(data), error => console.log(error));
    this.exhaust = new Exhaust();
    this.gotoList();
  }

  onSubmit() {
    this.updateExhaust();
  }

  gotoList() {
    this.router.navigate(['/exhausts']);
  }

}
