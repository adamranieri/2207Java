import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { ViewerpageComponent } from './components/viewerpage/viewerpage.component';
import { RegistrationpageComponent } from './components/registrationpage/registrationpage.component';
import { IntroComponent } from './components/intro/intro.component';
import { ContactinfoComponent } from './components/contactinfo/contactinfo.component';
import { BooktableComponent } from './components/booktable/booktable.component';

import { HttpClientModule } from  '@angular/common/http';
import { RegistrationformComponent } from './components/registrationform/registrationform.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomepageComponent,
    ViewerpageComponent,
    RegistrationpageComponent,
    IntroComponent,
    ContactinfoComponent,
    BooktableComponent,
    RegistrationformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
