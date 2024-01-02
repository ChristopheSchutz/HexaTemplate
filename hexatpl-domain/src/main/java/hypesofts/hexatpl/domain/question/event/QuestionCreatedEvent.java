package hypesofts.hexatpl.domain.question.event;

import hypesofts.hexatpl.domain.question.Question;
import hypesofts.hexatpl.domain.technical.event.HexaEvent;

public class QuestionCreatedEvent extends HexaEvent<Question> {

    public QuestionCreatedEvent(Question payload) {
        super(payload);
    }
}
