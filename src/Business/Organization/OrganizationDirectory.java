/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Home.getValue())){
            organization = new HomeOrganization();
//            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization();
//            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.School.getValue())){
            organization = new SchoolOrganization();
//            organization.setName(name);
            organizationList.add(organization);
        }
        return organization;
    }
}
