# Progress Bar using Server Sent Events

## Spring 5, Reactive
```
cd progress-bar-server-sent-events
mvn clean install
```
## Angular 6, EventSource
```
cd progress-bar-server-sent-events/angular-app
npm install && ng serve
```

Presented technique and project allows to send real-time data from Spring Reactive endpoints (Project Reactor -> Flux Rest Endpoitns)
to the Angular 6 client that uses EventSource to consume incoming data.
