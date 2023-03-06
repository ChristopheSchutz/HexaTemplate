package hypesofts.owlfonso.domain.question.event;

import hypesofts.owlfonso.domain.question.Question;
import hypesofts.owlfonso.domain.technical.event.OwlEvent;

public class QuestionCreatedEvent extends OwlEvent<Question> {

    public QuestionCreatedEvent(Question payload) {
        super(payload);
    }
}
