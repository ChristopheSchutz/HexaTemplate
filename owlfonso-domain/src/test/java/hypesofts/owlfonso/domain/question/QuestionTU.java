package hypesofts.owlfonso.domain.question;

import hypesofts.owlfonso.domain.answer.Answer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QuestionTU {

    @BeforeAll
    public void setUp() {
    }

    @Test
    void should_create_question() {
        // Given
        String question = "What is love ?";
        // When
        Question result = QuestionFactory.create(question);
        // Then
        Assertions.assertThat(result.getUUID()).isNotNull();
        Assertions.assertThat(result.getText()).isEqualTo(question);
    }

    @Test
    void should_ask_question() {
        // Given
        Question question = QuestionFactory.create("What is love ?");
        // When
        Answer result = question.ask();
        // Then
        Assertions.assertThat(result.getUUID()).isNotNull();
        Assertions.assertThat(result.getQuestionId()).isEqualTo(question.getId());
    }
}
