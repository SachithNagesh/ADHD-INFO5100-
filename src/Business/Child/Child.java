/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;

import Business.Quiz.BehavioralQuiz.BehavioralQuestionDirectory;
import Business.Quiz.MommyQuiz.MommyQuestionDirectory;
import Business.Quiz.TeacherQuiz.TeacherQuestionDirectory;
import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author josep
 */
public class Child {
    
    private String name;
    private String doctorComments;
    private String TeacherComments;
    private String Symptoms;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Child.count = count;
    }
    private String emergencyNumber;
    private String note;
    private Date date;
    
    private UserAccount doctor;
    private UserAccount teacher;    
    private UserAccount parent;
    
    private BehavioralQuestionDirectory bqd;
    private MommyQuestionDirectory mqd;
    private TeacherQuestionDirectory tqd;

    public TeacherQuestionDirectory getTqd() {
        return tqd;
    }

    public void setTqd(TeacherQuestionDirectory tqd) {
        this.tqd = tqd;
    }

    public MommyQuestionDirectory getMqd() {
        return mqd;
    }

    public void setMqd(MommyQuestionDirectory mqd) {
        this.mqd = mqd;
    }

    public BehavioralQuestionDirectory getBqd() {
        return bqd;
    }

    public void setBqd(BehavioralQuestionDirectory bqd) {
        this.bqd = bqd;
    }

    private int id;
    private int age;
    private static int count = 1;
//    int randomNum;
    
    public Child() {
        id = count;
//        randomNum = ThreadLocalRandom.current().nextInt(1000, 9999 + 1);
//        id = randomNum;
        count++;
        bqd = new BehavioralQuestionDirectory();
        mqd = new MommyQuestionDirectory();
        tqd = new TeacherQuestionDirectory();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDoctorComments() {
        return doctorComments;
    }

    public void setDoctorComments(String doctorComments) {
        this.doctorComments = doctorComments;
    }

    public String getTeacherComments() {
        return TeacherComments;
    }

    public void setTeacherComments(String TeacherComments) {
        this.TeacherComments = TeacherComments;
    }

    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String Symptoms) {
        this.Symptoms = Symptoms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public UserAccount getDoctor() {
        return doctor;
    }

    public void assignDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public UserAccount getTeacher() {
        return teacher;
    }

    public void assignTeacher(UserAccount teacher) {
        this.teacher = teacher;
    }
    
    public UserAccount getParent() {
        return parent;
    }

    public void assignParent(UserAccount parent) {
        this.parent = parent;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
