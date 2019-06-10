/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Parent;

import Business.EcoSystem;
import Business.Organization.OrganizationDirectory;
import Business.Quiz.BehavioralQuiz.BehavioralQuestion;
import Business.Quiz.MommyQuiz.MommyQuestion;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josep
 */
public class ParentReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ParentReportJPanel
     */
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    EcoSystem business;
    UserAccount userAccount;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ParentReportJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.business = business;
        this.userAccount = userAccount;
        
        String hello = String.valueOf(this.userAccount.getChild().getDoctorComments());
        System.out.println("Doctor Comments: "+ hello);
        getValues();
    }
    
    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
        model.setRowCount(0);
        
        for(MommyQuestion b : userAccount.getChild().getMqd().getQuestions())
        {
            Object[] row = new Object[2];
            row[0] = b.gettask();
            row[1] = b.getResponse();
            
            model.addRow(row);
        }
    }
    
    
    private void getValues()
    {
        doctorCommentsBox.setEnabled(false);
        teacherCommentsBox.setEnabled(false);
        
        String doctorComments = String.valueOf(userAccount.getChild().getDoctorComments());
        String teacherComments = String.valueOf(userAccount.getChild().getTeacherComments());
        
        if(doctorComments == "null")
        {
            doctorCommentsBox.setText("No Comments from Doctor yet.");
        }
        else
            doctorCommentsBox.setText(doctorComments);
        
        if(teacherComments == "null")
        {
            teacherCommentsBox.setText("No Comments from Teacher yet.");
        }
        else
            teacherCommentsBox.setText(teacherComments);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorCommentsBox = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        teacherCommentsBox = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Reports");

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Resources/back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Doctor Comments:");

        jLabel4.setText("Teacher Comments:");

        doctorCommentsBox.setColumns(20);
        doctorCommentsBox.setRows(5);
        jScrollPane1.setViewportView(doctorCommentsBox);

        teacherCommentsBox.setColumns(20);
        teacherCommentsBox.setRows(5);
        jScrollPane2.setViewportView(teacherCommentsBox);

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ", "Completed?"
            }
        ));
        jScrollPane4.setViewportView(reportTable);

        jLabel5.setText("Tasks:");

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Resources/refresh.png"))); // NOI18N
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backBtn)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(32, 32, 32)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(103, 103, 103)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)))))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(refreshBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_backBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea doctorCommentsBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable reportTable;
    private javax.swing.JTextArea teacherCommentsBox;
    // End of variables declaration//GEN-END:variables
}