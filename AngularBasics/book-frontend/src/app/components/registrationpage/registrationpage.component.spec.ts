import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrationpageComponent } from './registrationpage.component';

describe('RegistrationpageComponent', () => {
  let component: RegistrationpageComponent;
  let fixture: ComponentFixture<RegistrationpageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrationpageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrationpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
