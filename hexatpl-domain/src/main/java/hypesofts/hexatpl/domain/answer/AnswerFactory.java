package hypesofts.hexatpl.domain.answer;

import hypesofts.hexatpl.domain.question.UserId;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class AnswerFactory {

    public static Answer create(UserId userId, String content) {
        return new Answer(AnswerId.of(UUID.randomUUID()), userId, content);
    }
}
