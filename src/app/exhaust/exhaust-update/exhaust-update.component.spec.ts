import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExhaustUpdateComponent } from './exhaust-update.component';

describe('ExhaustUpdateComponent', () => {
  let component: ExhaustUpdateComponent;
  let fixture: ComponentFixture<ExhaustUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExhaustUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExhaustUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
