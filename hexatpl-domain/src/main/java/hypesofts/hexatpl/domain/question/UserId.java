package hypesofts.hexatpl.domain.question;

import hypesofts.hexatpl.domain.technical.baseclass.FetchableDomainId;
import lombok.NonNull;

import java.util.UUID;

public class UserId extends FetchableDomainId<Question> {
    static UserId of(@NonNull UUID id) { return new UserId(id);}

    UserId(UUID id) {
        super(id);
    }
}
