import { Component, OnInit } from '@angular/core';
import { laptopService } from './laptopService';
@Component({
  selector: 'app-root',
   templateUrl: './laptop.html',
   styleUrls: ['./laptop.css']
})

export class laptopComponent implements OnInit {
  laptops: any = [];
  yRating : any = '';
  yourRating: any ='' ;
  invalidNumer:boolean =false;
  constructor(private _laptopService: laptopService) {}
  ngOnInit() {

    this._laptopService.getAllLaptop().subscribe(
      data => { this.laptops = data },
      err => console.error(err),
      () => console.log('done loading laptop')
    );
  }
  onRating(laptop,yRating) {
    this.invalidNumer = false;
    //console.log(yRating);
    this.yourRating=yRating;
    if (yRating >= 0 && yRating <= 10 && yRating!='') {
      this._laptopService.addRating(laptop,yRating).subscribe(
        data => { this.laptops = data },
        err => console.error(err),
        () => console.log('done saving rating :'+ this.yourRating)
      );
    }
    else
      this.invalidNumer = true;
  }
  }

