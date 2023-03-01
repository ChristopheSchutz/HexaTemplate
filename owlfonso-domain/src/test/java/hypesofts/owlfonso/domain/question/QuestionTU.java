package hypesofts.owlfonso.domain.question;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QuestionTU {

    private QuestionFactory questionFactory;

    @BeforeAll
    public void setUp() {
        questionFactory = new QuestionFactory();
    }

    @Test
    void should_create_question() {
        // Given
        String question = "What is the answer to the Ultimate Question of Life, the Universe, and Everything?";
        // When
        var result = QuestionFactory.create(question);
        // Then
        Assertions.assertThat(result.getText()).isEqualTo(question);
        Assertions.assertThat(result.getUUID()).isNotNull();
    }
}
