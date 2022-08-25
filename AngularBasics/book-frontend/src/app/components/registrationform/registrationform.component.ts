import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from 'src/app/models/book';
import { BookutilService } from 'src/app/services/bookutil.service';

@Component({
  selector: 'app-registrationform',
  templateUrl: './registrationform.component.html',
  styleUrls: ['./registrationform.component.css']
})
export class RegistrationformComponent implements OnInit {

  constructor(private bookService:BookutilService, private router:Router) { }

  title:string = "";
  author:string = "";
  savedId: number = 0;



  ngOnInit(): void {
  }

  async register(){
    const book: Book = {id:0, title:this.title, author:this.author, returnDate:0};
    const savedBook: Book = await this.bookService.registerBook(book);
    this.savedId = savedBook.id;
    this.router.navigateByUrl("/home")
    
  }

}
