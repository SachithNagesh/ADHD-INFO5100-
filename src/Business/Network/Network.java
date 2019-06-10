/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Organization.Organization;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private Organization homeOrganization;
    private Organization hospitalOrganization;
    private Organization SchoolOrganization;
    
    public Network(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setHomeOrganization(Organization homeOrganization)
    {
        this.homeOrganization = homeOrganization;
    }
    
    public void setHospitalOrganization(Organization hospitalOrganization)
    {
        this.hospitalOrganization = hospitalOrganization;
    }
    
    public void setSchoolOrganization (Organization schoolOrganization)
    {
        this.SchoolOrganization = schoolOrganization;
    }

    @Override
    public String toString(){
        return name;
    }
    
}
