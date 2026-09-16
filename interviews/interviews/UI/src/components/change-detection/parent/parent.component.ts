import { Component } from '@angular/core';
import { ChildDefaultComponent } from '../child-default/child-default.component';
import { ChildOnpushComponent } from '../child-onpush/child-onpush.component';

@Component({
  selector: 'app-parent',
  standalone: true,
  imports: [
    ChildDefaultComponent,
    ChildOnpushComponent
  ],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {

  count = 0;

  constructor(){
    setInterval(
      () => {
        this.count++;
      },1000
    )
  }

}
