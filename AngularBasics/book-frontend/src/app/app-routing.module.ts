import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './components/homepage/homepage.component';
import { RegistrationpageComponent } from './components/registrationpage/registrationpage.component';
import { ViewerpageComponent } from './components/viewerpage/viewerpage.component';

const routes: Routes = [
  {path:"home", component: HomepageComponent},
  {path:"viewer", component: ViewerpageComponent},
  {path:"registration", component: RegistrationpageComponent},
  {path:"", component: HomepageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
