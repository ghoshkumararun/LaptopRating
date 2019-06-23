import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class laptopService {
  private  server: string;
  private  baseUrl: string;
  constructor(private http: HttpClient) {
    this.server = "NODESERVER";
    if (this.server = "NODESERVER") {
      this.baseUrl = "http://localhost:8080/";
    }
    else{
      this.baseUrl = "http://localhost:8080/";
    }
  }
  // Uses http.get() to load data from a single API endpoint
  /*getAllLaptop() {      
    return this.http.get(this.baseUrl + 'listlaptops');
  }
  addRating(laptop) {
    return this.http.post(this.baseUrl+ 'addrating', laptop);
  }*/
  getAllLaptop() { 
    console.log('inside getlaptop')     
    //return this.http.get(this.baseUrl + 'listlaptops');
    return this.http.get(this.baseUrl + 'all');
  }
  addRating(laptop,yRating) {
    console.log('inside add rating')
    //return this.http.get(this.baseUrl+ 'addrating',laptop);
    return this.http.get(this.baseUrl+ 'update/'+laptop.lapid+'/'+yRating);
  }

}
