package hypesofts.hexatpl.domain.technical.exception;

import lombok.Getter;

@Getter
public class HexaException extends RuntimeException {

     private final HexaError error;

     public static HexaException of(HexaError error) {
          return new HexaException(error);
     }

     public HexaException(HexaError error) {
          super(error.getValue());
          this.error = error;
     }

     public String getReadableErrors() {
          return error.getValue();
     }
}
