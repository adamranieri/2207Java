import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CounterComponent } from './components/counter-component';
import { GreeterComponent } from './components/greeter-component';
import { GroceryListComponent } from './components/grocery-list-component';
import { HelloComponent } from './components/hello-component';

@NgModule({
  declarations: [ // all componenets are registered under declarations
    AppComponent,
    HelloComponent,
    CounterComponent,
    GreeterComponent,
    GroceryListComponent
  ],
  imports: [ // any additional angular modules will get added here as you need them
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [], // any services you create will go here
  bootstrap: [AppComponent] // intial compoment to load in the index.html
})
export class AppModule { }
