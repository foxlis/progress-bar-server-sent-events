package pkozak.websocketjava;

import java.time.Duration;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import reactor.core.publisher.Flux;

@RestController
public class AppController {

  @CrossOrigin("http://localhost:4200")
  @GetMapping(value = "/upload")
  public Flux<ServerSentEvent<Progress>> upload() {
    return Flux.range(1, 100)
        .delayElements(Duration.ofMillis(100))
        .map(integer -> ServerSentEvent.<Progress>builder()
            .id(integer.toString())
            .event("uploadEvent")
            .data(
                Progress.builder()
                    .percentage(integer)
                    .build()
            )
            .build()
        );
  }
}
