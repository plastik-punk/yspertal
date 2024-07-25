import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TnOverviewComponent } from './tn-overview.component';

describe('TnOverviewComponent', () => {
  let component: TnOverviewComponent;
  let fixture: ComponentFixture<TnOverviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TnOverviewComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TnOverviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
