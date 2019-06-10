/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Admin.Admin;
import Business.Organization.AdminOrganization;
import Business.Role.AdminRoles.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author josep
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem business = EcoSystem.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        Admin admin = new Admin();
        admin.setName("Jack Daniel");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());
        account.setAdmin(admin);
        
        adminOrganization.getAdminDirectory().getAdminList().add(admin);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        return business;
    }
    
}
