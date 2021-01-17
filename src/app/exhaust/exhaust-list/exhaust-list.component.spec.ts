import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExhaustListComponent } from './exhaust-list.component';

describe('ExhaustListComponent', () => {
  let component: ExhaustListComponent;
  let fixture: ComponentFixture<ExhaustListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExhaustListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExhaustListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
