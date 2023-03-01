package hypesofts.owlfonso.domain.answer;


import hypesofts.owlfonso.domain.technical.baseclass.FetchableDomainId;
import lombok.NonNull;

import java.util.UUID;

public class AnswerId extends FetchableDomainId<Answer> {
    static AnswerId of(@NonNull UUID id) { return new AnswerId(id);}
    static AnswerId create() { return new AnswerId(UUID.randomUUID());}

    AnswerId(UUID id) {
        super(id);
    }
}
