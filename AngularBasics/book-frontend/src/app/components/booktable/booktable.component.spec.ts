import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BooktableComponent } from './booktable.component';

describe('BooktableComponent', () => {
  let component: BooktableComponent;
  let fixture: ComponentFixture<BooktableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BooktableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BooktableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
