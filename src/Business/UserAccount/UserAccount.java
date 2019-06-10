/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Admin.Admin;
import Business.Child.Child;
import Business.People.People;
import Business.Role.Role;

/**
 *
 * @author josep
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Admin admin;
    private People people;
    private Child child;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
    private Role role;

    public UserAccount() {
//        workQueue = new WorkQueue();
        child = new Child();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }  

    public void setRole(Role role) {
        this.role = role;
    }

    public Admin getAdmin() {
        return admin;
    }
    
    public void assignChild(Child child)
    {
        this.child = child;
    }
    
    public Child getChild()
    {
        return child;
    }
    
    @Override
    public String toString() {
        return username;
    } 
    
}
