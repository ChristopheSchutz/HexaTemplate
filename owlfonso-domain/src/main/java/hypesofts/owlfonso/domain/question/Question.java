package hypesofts.owlfonso.domain.question;

import hypesofts.owlfonso.domain.technical.baseclass.AggregateRoot;
import hypesofts.owlfonso.domain.technical.baseclass.DomainEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class Question implements AggregateRoot, DomainEntity {

    private final String text;
    private final QuestionId questionId;

    @Override
    public UUID getUUID() {
        return questionId.getId();
    }
}
