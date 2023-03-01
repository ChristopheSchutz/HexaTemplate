package hypesofts.owlfonso.domain.question;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class QuestionFactory {

    public static Question create(String question) {
        return new Question(QuestionId.of(UUID.randomUUID()), question);
    }
}
