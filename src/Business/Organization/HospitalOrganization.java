/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization;
import Business.Role.AdminRoles.HospitalAdminRole;
import Business.Role.AdminRoles.ParentAdminRole;
import Business.Role.PeopleRoles.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class HospitalOrganization extends Organization{
    
     public HospitalOrganization() {
        super(Organization.Type.Hospital.getValue());
    }
    
    @Override
    public ArrayList<Role> getAdminRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalAdminRole());
        return roles;
    }
    
    @Override
    public ArrayList<Role> getPeopleRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
}
