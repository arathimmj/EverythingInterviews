import { Component } from '@angular/core';
import { ParentComponent } from '../components/change-detection/parent/parent.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    ParentComponent
  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'default';
}
