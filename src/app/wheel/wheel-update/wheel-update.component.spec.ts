import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WheelUpdateComponent } from './wheel-update.component';

describe('WheelUpdateComponent', () => {
  let component: WheelUpdateComponent;
  let fixture: ComponentFixture<WheelUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WheelUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WheelUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
