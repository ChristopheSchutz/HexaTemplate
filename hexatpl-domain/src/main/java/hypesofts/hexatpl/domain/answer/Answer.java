package hypesofts.hexatpl.domain.answer;

import hypesofts.hexatpl.domain.question.UserId;
import hypesofts.hexatpl.domain.technical.baseclass.AggregateRoot;
import hypesofts.hexatpl.domain.technical.baseclass.DomainEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public class Answer implements AggregateRoot, DomainEntity {

    private final AnswerId id;
    private final UserId questionId;
    private final String content;

    @Override
    public UUID getUUID() {
        return id.getId();
    }
}
