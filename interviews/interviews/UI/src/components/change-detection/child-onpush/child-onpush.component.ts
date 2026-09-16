import { ChangeDetectionStrategy, ChangeDetectorRef, Component, Input } from '@angular/core';
import { Observable, Subscriber } from 'rxjs';
import { AsyncPipe } from '@angular/common';

@Component({
  selector: 'app-child-onpush',
  standalone: true,
  imports: [
    AsyncPipe
  ],
  templateUrl: './child-onpush.component.html',
  styleUrl: './child-onpush.component.css',
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ChildOnpushComponent {

  // works
  // @Input() count = 0;

  // will not work with onpush ChangeDetectionStrategy
  // count = 0;
  // constructor(){
  //   setInterval(() =>{
  //     this,this.count++;
  //   },1000
  //   );
  // }

  // works with (click)
  // count = 0;
  // updateCount(){
  //   this.count++;
  // }

  // will work with onpush ChangeDetectionStrategy
  // count = 0;
  // constructor(
  //   private cdr : ChangeDetectorRef
  // ){
  //   setInterval(() =>{
  //     this,this.count++;
  //     this.cdr.markForCheck();
  //   },1000
  //   );
  // }

  // emitting data/observables using async pipe - works
  count$ !:Observable<number>;

  constructor(){
    this.count$ = new Observable(
      (subscriber) => {
        let value = 0;
        setInterval(
          () => {
            subscriber.next(value++)
          },1000
        );
      }
    );
  }

}
