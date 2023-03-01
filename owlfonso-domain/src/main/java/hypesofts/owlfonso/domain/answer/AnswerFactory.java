package hypesofts.owlfonso.domain.answer;

import hypesofts.owlfonso.domain.question.Question;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class AnswerFactory {

    public static Answer create(Question question) {
        return new Answer(AnswerId.of(UUID.randomUUID()), question.getId());
    }
}
