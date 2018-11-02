package pkozak.websocketjava;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Progress {

  private float percentage;

}
