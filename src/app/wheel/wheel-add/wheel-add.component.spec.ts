import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WheelAddComponent } from './wheel-add.component';

describe('WheelAddComponent', () => {
  let component: WheelAddComponent;
  let fixture: ComponentFixture<WheelAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WheelAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WheelAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
