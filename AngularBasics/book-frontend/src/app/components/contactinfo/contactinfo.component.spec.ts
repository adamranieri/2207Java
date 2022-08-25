import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContactinfoComponent } from './contactinfo.component';

describe('ContactinfoComponent', () => {
  let component: ContactinfoComponent;
  let fixture: ComponentFixture<ContactinfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContactinfoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContactinfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
