import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuspensionDetailsComponent } from './suspension-details.component';

describe('SuspensionDetailsComponent', () => {
  let component: SuspensionDetailsComponent;
  let fixture: ComponentFixture<SuspensionDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SuspensionDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SuspensionDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
