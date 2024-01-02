package hypesofts.hexatpl.domain.question;

import hypesofts.hexatpl.domain.question.event.QuestionCreatedEvent;
import hypesofts.hexatpl.domain.technical.event.StubOwlEventPublisher;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AnswerUT {

    StubOwlEventPublisher stubPublisher = new StubOwlEventPublisher();
    QuestionFactory questionFactory = new QuestionFactory(stubPublisher);

    @BeforeEach
    public void clear() {
        stubPublisher.clear();
    }

    @Test
    void should_create_question() {
        // Given
        String question = "What is love ?";
        // When
        Question result = questionFactory.create(question);
        // Then
        Assertions.assertThat(result.getUUID()).isNotNull();
        Assertions.assertThat(result.getContent()).isEqualTo(question);
        Assertions.assertThat(stubPublisher.getEvents().size()).isEqualTo(1);
        Assertions.assertThat(stubPublisher.getEvents().get(0)).isInstanceOf(QuestionCreatedEvent.class);
    }
}
