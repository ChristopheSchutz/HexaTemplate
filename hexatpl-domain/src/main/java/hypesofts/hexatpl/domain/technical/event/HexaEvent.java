package hypesofts.hexatpl.domain.technical.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HexaEvent<E> {

    private final E payload;
}
