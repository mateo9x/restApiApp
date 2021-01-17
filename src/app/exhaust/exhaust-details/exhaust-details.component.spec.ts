import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExhaustDetailsComponent } from './exhaust-details.component';

describe('ExhaustDetailsComponent', () => {
  let component: ExhaustDetailsComponent;
  let fixture: ComponentFixture<ExhaustDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExhaustDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExhaustDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
