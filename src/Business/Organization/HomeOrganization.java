/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization;
import Business.Role.AdminRoles.ParentAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class HomeOrganization extends Organization{
    
     public HomeOrganization() {
        super(Organization.Type.Home.getValue());
    }
    
    @Override
    public ArrayList<Role> getAdminRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ParentAdminRole());
        return roles;
    }
    
    @Override
    public ArrayList<Role> getPeopleRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ParentAdminRole());
        return roles;
    }
}
