/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.AdminRoles.SchoolAdminRole;
import Business.Role.AdminRoles.SystemAdminRole;
import Business.Role.PeopleRoles.TeacherRole;
import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class SchoolOrganization extends Organization{
    
     public SchoolOrganization() {
        super(Organization.Type.School.getValue());
    }
    
    @Override
    public ArrayList<Role> getAdminRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SchoolAdminRole());
        return roles;
    }
    
    @Override
    public ArrayList<Role> getPeopleRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TeacherRole());
        return roles;
    }   
}
