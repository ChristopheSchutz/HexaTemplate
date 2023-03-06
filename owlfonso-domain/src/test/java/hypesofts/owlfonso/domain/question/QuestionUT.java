package hypesofts.owlfonso.domain.question;

import hypesofts.owlfonso.domain.answer.Answer;
import hypesofts.owlfonso.domain.question.event.QuestionCreatedEvent;
import hypesofts.owlfonso.domain.technical.event.StubOwlEventPublisher;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QuestionUT {

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
        Assertions.assertThat(result.getText()).isEqualTo(question);
        Assertions.assertThat(stubPublisher.getEvents().size()).isEqualTo(1);
        Assertions.assertThat(stubPublisher.getEvents().get(0)).isInstanceOf(QuestionCreatedEvent.class);
    }

    @Test
    void should_ask_question() {
        // Given
        Question question = questionFactory.create("What is love ?");
        // When
        Answer result = question.ask();
        // Then
        Assertions.assertThat(result.getUUID()).isNotNull();
        Assertions.assertThat(result.getQuestionId()).isNotNull();
    }
}
