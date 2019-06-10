/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.AdminRoles;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.AdminMainJPanel;
import javax.swing.JPanel;

/**
 *
 * @author josep
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        return new AdminMainJPanel(userProcessContainer, EcoSystem.getInstance());
    }
    
}
