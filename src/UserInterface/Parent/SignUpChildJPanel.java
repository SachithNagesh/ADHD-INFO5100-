/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Parent;

import Business.EcoSystem;
import Business.Child.Child;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.People.People;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Calendar;

/**
 *
 * @author josep
 */
public class SignUpChildJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientsJPanel
     */
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    EcoSystem business;
    private UserAccount userAccount;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public SignUpChildJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.business = business;
        this.userAccount = userAccount;

        buttonGroup.add(maleRadio);
        buttonGroup.add(femaleRadio);

        initialize();
    }

    private void initialize() {
        if (userAccount.getChild().getName() != null) {
            childNameTxt.setText(userAccount.getChild().getName());
            ageTxt.setText(String.valueOf(userAccount.getChild().getAge()));
            symptomsTxt.setText(userAccount.getChild().getSymptoms());
            addressBox.setText(userAccount.getChild().getAddress());
            emergencyNumberTxt.setText(String.valueOf(userAccount.getChild().getEmergencyNumber()));
            noteTxt.setText(userAccount.getChild().getNote());
            datePicker.setDate(userAccount.getChild().getDate());
        }
    }

    private void disableRadio() {
        childNameTxt.setEnabled(false);
        ageTxt.setEnabled(false);
        addressBox.setEnabled(false);
        symptomsTxt.setEnabled(false);
        emergencyNumberTxt.setEnabled(false);
        noteTxt.setEnabled(false);
        maleRadio.setEnabled(false);
        femaleRadio.setEnabled(false);
        datePicker.setEnabled(false);
    }

    private boolean childNameRegex(String key) {
        Pattern userName = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
        Matcher m = userName.matcher(key);
        boolean matches = m.matches();
        return matches;
    }

    private boolean ageRegex(String key) {
        Pattern age = Pattern.compile("^(1[0-4])?$");
        Matcher m = age.matcher(key);
        boolean matches = m.matches();
        return matches;
    }

    private boolean phoneRegex(String key) {
        Pattern phone = Pattern.compile("^[2-9]*\\d{3}-\\d{3}-\\d{4}$");
        Matcher m = phone.matcher(key);
        boolean matches = m.matches();
        return matches;
    }

    private boolean validations() {

        if (childNameTxt.getText().isEmpty() || ageTxt.getText().isEmpty() || buttonGroup.isSelected(null) || addressBox.getText().isEmpty() || symptomsTxt.getText().isEmpty() || emergencyNumberTxt.getText().isEmpty() || noteTxt.getText().isEmpty() || (datePicker.getDate() == null)) {
            JOptionPane.showMessageDialog(this, "Please enter the deatils for all the fields");
            return false;

        } else if (!(childNameRegex(childNameTxt.getText()))) {
            JOptionPane.showMessageDialog(this, "Enter valid name");
            childNameTxt.setBackground(Color.decode("#FF9999"));
            return false;

        } else if (!(ageRegex(ageTxt.getText()))) {
            JOptionPane.showMessageDialog(this, "This is only for children of Age group between 10-14");
            ageTxt.setBackground(Color.decode("#FF9999"));
            return false;
        } else if (!(phoneRegex(emergencyNumberTxt.getText()))) {
            JOptionPane.showMessageDialog(this, "Enter valid Phone number or in xxx-xxx-xxxx format");
            emergencyNumberTxt.setBackground(Color.decode("#FF9999"));
            return false;
        } else if (!(datePicker.getDate().before(Calendar.getInstance().getTime()))) {
            JOptionPane.showMessageDialog(this, "Enter present date");
            return false;

        } else {

            return true;

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

        buttonGroup = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        symptomsTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        childNameTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressBox = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        emergencyNumberTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        noteTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Symptoms:");

        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Age:");

        jLabel1.setText("Child Name:");

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Resources/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(255, 255, 255));
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Resources/create.png"))); // NOI18N
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Sign-Up your Child");

        jLabel5.setText("Gender:");

        maleRadio.setBackground(new java.awt.Color(255, 255, 255));
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadio.setText("Female");

        jLabel6.setText("Address:");

        addressBox.setColumns(20);
        addressBox.setRows(5);
        jScrollPane1.setViewportView(addressBox);

        jLabel7.setText("Emergency Number:");

        jLabel8.setText("Note:");

        jLabel15.setText("Date:");

        datePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBtn)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(noteTxt)
                                        .addComponent(ageTxt)
                                        .addComponent(childNameTxt)
                                        .addComponent(symptomsTxt)
                                        .addComponent(emergencyNumberTxt)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(maleRadio)
                                            .addGap(18, 18, 18)
                                            .addComponent(femaleRadio))
                                        .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(childNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(symptomsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emergencyNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(noteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(21, 21, 21)
                .addComponent(createBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed

        if (validations()) {

            String name = (String) childNameTxt.getText();
            String symptoms = (String) symptomsTxt.getText();
            int age = Integer.parseInt(ageTxt.getText());
            String emergencyNumber = (String) emergencyNumberTxt.getText();
            String address = (String) addressBox.getText();
            String note = (String) noteTxt.getText();
            Date date = (Date) datePicker.getDate();

            Child child = (Child) business.getChildDirectory().createChild(name, age, address, symptoms, emergencyNumber, note, date);

            userAccount.assignChild(child);

            JOptionPane.showMessageDialog(createBtn, "Sign-Up Successful");
            disableRadio();
        }


    }//GEN-LAST:event_createBtnActionPerformed

    private void datePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datePickerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressBox;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField childNameTxt;
    private javax.swing.JButton createBtn;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JTextField emergencyNumberTxt;
    private javax.swing.JRadioButton femaleRadio;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField noteTxt;
    private javax.swing.JTextField symptomsTxt;
    // End of variables declaration//GEN-END:variables
}
