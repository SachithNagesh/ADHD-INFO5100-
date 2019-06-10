/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Quiz.TeacherQuiz;

import Business.Quiz.MommyQuiz.MommyQuestion;
import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class TeacherQuestionDirectory {
    
    private ArrayList<TeacherQuestion> questions;    
    
    public TeacherQuestionDirectory( ) {
        this.questions = new ArrayList<>();
    }

    public ArrayList<TeacherQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<TeacherQuestion> questions) {
        this.questions = questions;
    }
    
    public TeacherQuestion createQuestion(String question, String Response)
    {
     TeacherQuestion mq = new TeacherQuestion();
     mq.setQuestion(question);
     mq.setResponse(Response);
     questions.add(mq);
     return mq;
    }
}
