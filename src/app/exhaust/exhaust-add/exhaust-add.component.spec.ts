import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExhaustAddComponent } from './exhaust-add.component';

describe('ExhaustAddComponent', () => {
  let component: ExhaustAddComponent;
  let fixture: ComponentFixture<ExhaustAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExhaustAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExhaustAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
