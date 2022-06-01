import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateLeavesComponent } from './update-leaves.component';

describe('UpdateLeavesComponent', () => {
  let component: UpdateLeavesComponent;
  let fixture: ComponentFixture<UpdateLeavesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateLeavesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateLeavesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
