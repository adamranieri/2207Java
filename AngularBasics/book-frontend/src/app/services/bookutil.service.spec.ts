import { TestBed } from '@angular/core/testing';

import { BookutilService } from './bookutil.service';

describe('BookutilService', () => {
  let service: BookutilService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BookutilService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
