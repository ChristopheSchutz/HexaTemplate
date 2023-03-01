package hypesofts.owlfonso.domain.question;

import hypesofts.owlfonso.domain.answer.Answer;
import hypesofts.owlfonso.domain.technical.baseclass.FetchableDomainId;
import lombok.NonNull;

import java.util.UUID;

public class QuestionId extends FetchableDomainId<Answer> {
    static QuestionId of(@NonNull UUID id) { return new QuestionId(id);}

    QuestionId(UUID id) {
        super(id);
    }
}
