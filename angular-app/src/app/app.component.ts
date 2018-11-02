import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  progress = 0;

  upload() {
    const eventSource = new EventSource('http://localhost:8080/upload');
    eventSource.addEventListener('uploadEvent', message => {
      this.setProgress(JSON.parse((<any>message).data));
      if(this.progress === 100) {
        eventSource.close();
      }
    });
  }

  setProgress(data) {
    this.progress = data.percentage;
  }

}
