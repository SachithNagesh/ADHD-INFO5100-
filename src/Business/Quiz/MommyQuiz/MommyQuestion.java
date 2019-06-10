/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Quiz.MommyQuiz;

/**
 *
 * @author josep
 */
public class MommyQuestion {
    
    String task;
    String response;
    
    public MommyQuestion() {
        
    }

    public String gettask() {
        return task;
    }

    public void setTask(String question) {
        this.task = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
