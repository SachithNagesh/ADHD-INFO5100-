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
import UserInterface.SchoolAdmin.ManageTeachersJPanel;
import javax.swing.JPanel;

/**
 *
 * @author josep
 */
public class SchoolAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        return new ManageTeachersJPanel(userProcessContainer, organization, EcoSystem.getInstance());
    }
    
}
