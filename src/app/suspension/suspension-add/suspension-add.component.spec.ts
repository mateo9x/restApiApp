import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SuspensionAddComponent } from './suspension-add.component';

describe('SuspensionAddComponent', () => {
  let component: SuspensionAddComponent;
  let fixture: ComponentFixture<SuspensionAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SuspensionAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SuspensionAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
