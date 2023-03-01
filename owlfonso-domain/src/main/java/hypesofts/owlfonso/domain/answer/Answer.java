package hypesofts.owlfonso.domain.answer;

import hypesofts.owlfonso.domain.question.QuestionId;
import hypesofts.owlfonso.domain.technical.baseclass.AggregateRoot;
import hypesofts.owlfonso.domain.technical.baseclass.DomainEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public class Answer implements AggregateRoot, DomainEntity {

    private final AnswerId id;
    private final QuestionId questionId;

    @Override
    public UUID getUUID() {
        return id.getId();
    }
}
