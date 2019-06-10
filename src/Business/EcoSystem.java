/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Child.ChildDirectory;
import Business.Network.NetworkDirectory;
import Business.Organization.OrganizationDirectory;
/**
 *
 * @author josep
 */
public class EcoSystem {
    
    private static EcoSystem business;
    private OrganizationDirectory organizationDirectory;
    private ChildDirectory childDirectory;
    private NetworkDirectory networkDirectory;
    
    public static EcoSystem getInstance(){
        if (business == null){
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        organizationDirectory = new OrganizationDirectory();
        childDirectory = new ChildDirectory();
        networkDirectory = new NetworkDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public NetworkDirectory getNetworkDirectory(){
        return networkDirectory;
    }
    
    public ChildDirectory getChildDirectory() {
        return childDirectory;
    }
}
