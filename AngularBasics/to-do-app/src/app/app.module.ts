import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutComponent } from './components/about';
import { CompletedTaskListComponent } from './components/completed-tasks';
import { TodoFormComponent } from './components/create-todo-form';
import { PendingTodoListComponent } from './components/pending-list';
import { PokedexComponent } from './components/pokedex';
import { TodoHomeComponent } from './components/todo-home';
import { ToDoService } from './services/todo-service';
import { HttpClient, HttpClientModule } from  '@angular/common/http';
import { HeightPipe } from './pipes/height-pipe';


@NgModule({
  declarations: [
    AppComponent,
    TodoHomeComponent,
    AboutComponent,
    TodoFormComponent,
    PendingTodoListComponent,
    CompletedTaskListComponent,
    PokedexComponent,
    HeightPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ToDoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
