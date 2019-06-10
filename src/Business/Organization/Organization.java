/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Admin.AdminDirectory;
import Business.Child.ChildDirectory;
import Business.People.PeopleDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author josep
 */
public abstract class Organization {

    private String name;
    private AdminDirectory adminDirectory;
    private PeopleDirectory peopleDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Home("Home Organization"), 
        Hospital("Hospital Organization"), 
        School("School Organization"),
        Admin("Admin"),;
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        adminDirectory = new AdminDirectory();
        peopleDirectory = new PeopleDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getAdminRole();
    
    public abstract ArrayList<Role> getPeopleRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }
    
    public PeopleDirectory getPeopleDirectory() {
        return peopleDirectory;
    }  
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}