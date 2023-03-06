package hypesofts.owlfonso.domain.technical.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OwlEvent<E> {

    private final E payload;
}
