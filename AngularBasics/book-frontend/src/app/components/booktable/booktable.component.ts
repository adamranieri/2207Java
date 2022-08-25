import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/models/book';
import { BookutilService } from 'src/app/services/bookutil.service';

@Component({
  selector: 'app-booktable',
  templateUrl: './booktable.component.html',
  styleUrls: ['./booktable.component.css']
})
export class BooktableComponent implements OnInit {

  constructor(private bookService:BookutilService) { };

  //a method that is called when the component is first rendered
  // really helpful for getting information when the component first loads like making an http request to ge tthe latest data
  books:Book[] = [];
  
  ngOnInit(): void {
    (async () => {
      this.books = await this.bookService.getAllBooks();
    })();   
    
  }

}
