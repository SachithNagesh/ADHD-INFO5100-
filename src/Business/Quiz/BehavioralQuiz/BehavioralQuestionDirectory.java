/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Quiz.BehavioralQuiz;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class BehavioralQuestionDirectory {
    
    private ArrayList<BehavioralQuestion> questions;    
    
    public BehavioralQuestionDirectory( ) {
        this.questions = new ArrayList<>();
    }

    public ArrayList<BehavioralQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<BehavioralQuestion> questions) {
        this.questions = questions;
    }
    
    public BehavioralQuestion createQuestion(int questionNumber, String question, String Response)
    {
     BehavioralQuestion bq = new BehavioralQuestion();
     bq.setQuestionNumber(questionNumber);
     bq.setQuestion(question);
     bq.setResponse(Response);
     questions.add(bq);
     return bq;
    }
    
}
