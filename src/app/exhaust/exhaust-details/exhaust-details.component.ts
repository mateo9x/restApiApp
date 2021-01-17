import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {Exhaust} from '../exhaust';
import {ExhaustService} from '../exhaust.service';

@Component({
  selector: 'app-exhaust-details',
  templateUrl: './exhaust-details.component.html',
  styleUrls: ['./exhaust-details.component.css']
})
export class ExhaustDetailsComponent implements OnInit {

  id: number;
  exhaust: Exhaust;

  constructor(private route: ActivatedRoute,private router: Router,
              private exhaustService: ExhaustService) { }

  ngOnInit() {
    this.exhaust = new Exhaust();

    this.id = this.route.snapshot.params['id'];

    this.exhaustService.getExhaust(this.id)
      .subscribe(data => {
        console.log(data)
        this.exhaust = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['exhausts']);
  }
}
