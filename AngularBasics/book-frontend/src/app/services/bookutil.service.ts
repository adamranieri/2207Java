import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Book } from '../models/book';

@Injectable({
  providedIn: 'root'
})
export class BookutilService {

  constructor(private http: HttpClient) {};

  async getAllBooks():Promise<Book[]>{
    const observable = this.http.get<Book[]>("http://0a36-2603-301f-1625-c000-154b-e727-2d64-210f.ngrok.io/books");
    const books = await firstValueFrom(observable);
    return books;
  }

  async registerBook(book:Book):Promise<Book>{
    const observable = this.http.post<Book>("http://0a36-2603-301f-1625-c000-154b-e727-2d64-210f.ngrok.io/books",book);
    const savedBook = await firstValueFrom(observable);
    return savedBook; 
  }

  
}
