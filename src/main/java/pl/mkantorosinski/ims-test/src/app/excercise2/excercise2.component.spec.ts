import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Excercise2Component } from './excercise2.component';

describe('Excercise2Component', () => {
  let component: Excercise2Component;
  let fixture: ComponentFixture<Excercise2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Excercise2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Excercise2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
