/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author josep
 */
public class ChildDirectory {
    
    private ArrayList<Child> childList;

    public ChildDirectory() {
        childList = new ArrayList<>();
    }

    public ArrayList<Child> getChildList() {
        return childList;
    }
    
    public Child createChild(String name, int age, String address, String Symptoms, String emergencyNumber, String note, Date date){
        Child child = new Child();
        child.setName(name);
        child.setAge(age);
        child.setSymptoms(Symptoms);
        child.setAddress(address);
        child.setEmergencyNumber(emergencyNumber);
        child.setDate(date);
        child.setNote(note);
        childList.add(child);
        return child;
    }
}
