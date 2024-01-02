package hypesofts.hexatpl.domain.question;

import hypesofts.hexatpl.domain.technical.baseclass.AggregateRoot;
import hypesofts.hexatpl.domain.technical.baseclass.DomainEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public class Question implements AggregateRoot, DomainEntity {

    private final UserId id;
    private final String content;

    @Override
    public UUID getUUID() {
        return id.getId();
    }
}
