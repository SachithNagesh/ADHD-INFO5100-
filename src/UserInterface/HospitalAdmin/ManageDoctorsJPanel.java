/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import Business.Admin.Admin;
import Business.People.People;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Role.Role;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josep
 */
public class ManageDoctorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    Organization organization;
    java.util.Date date;
    
    public ManageDoctorsJPanel(JPanel userProcessContainer, Organization organization, EcoSystem business) {
        initComponents();
        date = new java.util.Date();
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        roleComboBox.removeAllItems();
    }
    
    private void populateRoleComboBox()
    {
        roleComboBox.removeAllItems();
        for (Role role : organization.getPeopleRole()){
            roleComboBox.addItem(role);
        }
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();
        
        model.setRowCount(0);
        
        for (People people : organization.getPeopleDirectory().getPeopleList())
        {
            Object[] row = new Object[3];
            row[0] = people.getId();
            row[1] = people.getName();
            row[2] = date;
            model.addRow(row);
        }
    }
    
    private void populateComboBox()
    {
        doctorComboBox.removeAllItems();
        
        for (People people : organization.getPeopleDirectory().getPeopleList()){
            doctorComboBox.addItem(people);
        }     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        doctorComboBox = new javax.swing.JComboBox();
        doctorNameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Doctor Name:");

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Doctor", "Date Added"
            }
        ));
        jScrollPane1.setViewportView(doctorTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Hospital Administrator");

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Resources/add doc.png"))); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("User Name:");

        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Add Psychiatrist:");

        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Resources/create.png"))); // NOI18N
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Select Doctor:");

        doctorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Role: ");

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(doctorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(createBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(47, 47, 47)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(createBtn)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        
        String name = doctorNameTxt.getText();     
        organization.getPeopleDirectory().createPeople(name);
        populateTable();
        populateComboBox();
        populateRoleComboBox();
    }//GEN-LAST:event_addBtnActionPerformed

    private void doctorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorComboBoxActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String userName = userNameTxt.getText();
        String password = passwordTxt.getText();
        
        Role role = (Role) roleComboBox.getSelectedItem();
        People people = (People) doctorComboBox.getSelectedItem();

        organization.getUserAccountDirectory().createUserAccount(userName, password, null, people, role);

        JOptionPane.showMessageDialog(null, "Doctor Account added successfully.");
        userNameTxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JComboBox doctorComboBox;
    private javax.swing.JTextField doctorNameTxt;
    private javax.swing.JTable doctorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
