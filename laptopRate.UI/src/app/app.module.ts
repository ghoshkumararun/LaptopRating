import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { laptopComponent } from '../laptop/laptopComponent';
import { laptopService } from '../laptop/laptopService';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,
    laptopComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path: 'laptop',
        component: laptopComponent
      }
    ])
  ],
  providers: [laptopService],
  bootstrap: [AppComponent]
})
export class AppModule { }
