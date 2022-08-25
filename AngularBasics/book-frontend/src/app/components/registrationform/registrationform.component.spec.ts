import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrationformComponent } from './registrationform.component';

describe('RegistrationformComponent', () => {
  let component: RegistrationformComponent;
  let fixture: ComponentFixture<RegistrationformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrationformComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrationformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
