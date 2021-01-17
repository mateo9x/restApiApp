import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuspensionUpdateComponent } from './suspension-update.component';

describe('SuspensionUpdateComponent', () => {
  let component: SuspensionUpdateComponent;
  let fixture: ComponentFixture<SuspensionUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SuspensionUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SuspensionUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
