# owlfonso-back

### Workflow : Ask a Question 
* Look for a similar question  
  * None found
    * Show link to input answer
    * (later) Suggest people to contact
  * One found with an attached answer
    * In any case, show link to edit question + answer
    * Show Question/Answer and link to edit
    * Provide option to mark as non relevant
  * One found with no answer
    * Ask if relevant
      * if relevant, bind question to existing answer id
      * if not relevant, create new answer
      * in any case, show link to edit answer


### Domain model
Question  
* QuestionId  
* text
* AnswerId


Answer
* AnswerId
* text
* List<QuestionId> questions

Result
* Optional<Question> relevant_question
* Optional<Answer> relevant_answer
* QuestionId questionId