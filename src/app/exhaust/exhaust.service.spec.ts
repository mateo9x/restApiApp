import { TestBed } from '@angular/core/testing';

import { ExhaustService } from './exhaust.service';

describe('ExhaustService', () => {
  let service: ExhaustService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExhaustService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
