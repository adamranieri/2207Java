import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewerpageComponent } from './viewerpage.component';

describe('ViewerpageComponent', () => {
  let component: ViewerpageComponent;
  let fixture: ComponentFixture<ViewerpageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewerpageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewerpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
