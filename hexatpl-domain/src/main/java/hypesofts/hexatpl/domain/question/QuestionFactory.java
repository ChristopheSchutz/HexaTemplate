package hypesofts.hexatpl.domain.question;

import hypesofts.hexatpl.domain.question.event.QuestionCreatedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class QuestionFactory {

    private final ApplicationEventPublisher publisher;

    public QuestionFactory(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public Question create(String input) {
        Question user = new Question(UserId.of(UUID.randomUUID()), input);
        publisher.publishEvent(new QuestionCreatedEvent(user));
        return user;
    }
}
