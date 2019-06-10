/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Quiz.MommyQuiz;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class MommyQuestionDirectory {
    
    private ArrayList<MommyQuestion> questions;    
    
    public MommyQuestionDirectory( ) {
        this.questions = new ArrayList<>();
    }

    public ArrayList<MommyQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<MommyQuestion> questions) {
        this.questions = questions;
    }
    
    public MommyQuestion createQuestion(String question, String Response)
    {
     MommyQuestion bq = new MommyQuestion();
     bq.setTask(question);
     bq.setResponse(Response);
     questions.add(bq);
     return bq;
    }
}
