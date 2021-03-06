/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StudentManagement;

import com.google.gson.Gson;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jayes
 */
public class ChangeGrades extends javax.swing.JFrame {

    /**
     * Creates new form ChangeGrades
     */
    public static String user;
    Teacher t1;
    
    Connection conn;
    PreparedStatement pst;
    PreparedStatement pst1;
    ResultSet rs;
    ResultSet rs1;
    
    
    public ChangeGrades(String user) {
        initComponents();
        myInitComponents();
        this.user = user;
        Gson gson = new Gson();
        
        t1 = gson.fromJson(user, Teacher.class);
        
        System.out.println("From Grades");
        System.out.println(t1.getid());
        
        if(!(t1.getEnglish() == 1)){
            englishBtn.setEnabled(false);
        }
        if(!(t1.getMaths() == 1)){
            mathsBtn.setEnabled(false);
        }
        if(!(t1.getScience() == 1)){
            scienceBtn.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        englishBtn = new javax.swing.JButton();
        mathsBtn = new javax.swing.JButton();
        scienceBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        marksTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        uidField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        marksField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View and Change Grades");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        englishBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        englishBtn.setText("English");
        englishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishBtnActionPerformed(evt);
            }
        });

        mathsBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mathsBtn.setText("Maths");
        mathsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathsBtnActionPerformed(evt);
            }
        });

        scienceBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scienceBtn.setText("Science");
        scienceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scienceBtnActionPerformed(evt);
            }
        });

        marksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UID", "First Name", "Last Name", "Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(marksTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter UID:");

        uidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter New Marks:");

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        comboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject", "English", "Maths", "Science" }));
        comboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxItemStateChanged(evt);
            }
        });
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(englishBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mathsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scienceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(uidField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(marksField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(englishBtn)
                        .addGap(35, 35, 35)
                        .addComponent(mathsBtn)
                        .addGap(35, 35, 35)
                        .addComponent(scienceBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(marksField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn))
                .addGap(128, 128, 128)
                .addComponent(backBtn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void myInitComponents(){
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String result = comboBox.getSelectedItem().toString();
                System.out.println(result);
                
                if(result.equals("English") && t1.getEnglish() == 0){
                    JOptionPane.showMessageDialog(null, "Access Denied");
                    comboBox.setSelectedIndex(0);
                }
                else if(result.equals("Maths") && t1.getMaths() == 0){
                    JOptionPane.showMessageDialog(null, "Access Denied");
                    comboBox.setSelectedIndex(0);
                }
                else if(result.equals("Science") && t1.getScience() == 0){
                    JOptionPane.showMessageDialog(null, "Access Denied");
                    comboBox.setSelectedIndex(0);
                }
                
            }
        });
    }
    
    
    private void englishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishBtnActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studenttest", "root", "test");
            
            pst = conn.prepareStatement("select uid, firstname, lastname, englishmarks from student1 where english = 1  order by uid");
            
            rs = pst.executeQuery();
            
            String[] columnNames = {"UID", "First Name", "Last Name", "Marks"};
            DefaultTableModel tableModel = new DefaultTableModel(columnNames,0);
            
            while(rs.next()){
                
                String uid = String.valueOf(rs.getInt("UID"));
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String marks = String.valueOf(rs.getInt("englishmarks"));
                
                String[] data = {uid, firstName, lastName, marks};
                tableModel.addRow(data);
            
            }
            
            marksTable.setModel(tableModel);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_englishBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        TeacherHomepage th;
        try {
            th = new TeacherHomepage(user);
            th.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_backBtnActionPerformed
        
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
        if(comboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Please Select a Subject");
        }
        else if(uidField.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter UID");
        }
        else if(marksField.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Marks");
        } else {
            try {
                int _uid = Integer.parseInt( uidField.getText());
                int newMarks = Integer.parseInt(marksField.getText());
                if(newMarks > 100 || newMarks < 0){
                    JOptionPane.showMessageDialog(this, "Marks should be between 0-100");
                    return;
                }
                String subject = comboBox.getSelectedItem().toString();
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studenttest", "root", "test");
                
                if(subject.equals("English")){
                    pst1 = conn.prepareStatement("select english, englishmarks from student1 where uid = ?");
                    pst1.setInt(1,_uid);
                    
                    rs1 = pst1.executeQuery();
                    
                    if(rs1.next()){
                        
                        if(rs1.getInt(1) == 1){
                            pst = conn.prepareStatement("update student1 set englishmarks = ? where uid = ?");
                            pst.setInt(1, newMarks);
                            pst.setInt(2, _uid);
                            
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Marks Updated");
                            uidField.setText("");
                            marksField.setText("");
                            comboBox.setSelectedIndex(0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Found");
                    }
                }
                else if(subject.equals("Maths")){
                    pst1 = conn.prepareStatement("select maths, mathsmarks from student1 where uid = ?");
                    pst1.setInt(1,_uid);
                    
                    rs1 = pst1.executeQuery();
                    
                    if(rs1.next()){
                        
                        if(rs1.getInt(1) == 1){
                            pst = conn.prepareStatement("update student1 set mathsmarks = ? where uid = ?");
                            pst.setInt(1, newMarks);
                            pst.setInt(2, _uid);
                            
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Marks Updated");
                            uidField.setText("");
                            marksField.setText("");
                            comboBox.setSelectedIndex(0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Found");
                    }
                }
                else if(subject.equals("Science")){
                    pst1 = conn.prepareStatement("select science, sciencemarks from student1 where uid = ?");
                    pst1.setInt(1,_uid);
                    
                    rs1 = pst1.executeQuery();
                    
                    if(rs1.next()){
                        
                        if(rs1.getInt(1) == 1){
                            pst = conn.prepareStatement("update student1 set sciencemarks = ? where uid = ?");
                            pst.setInt(1, newMarks);
                            pst.setInt(2, _uid);
                            
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(this, "Marks Updated");
                            uidField.setText("");
                            marksField.setText("");
                            comboBox.setSelectedIndex(0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Found");
                    }
                }
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void comboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxItemStateChanged

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

    private void uidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidFieldActionPerformed

    private void mathsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathsBtnActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studenttest", "root", "test");
            
            pst = conn.prepareStatement("select uid, firstname, lastname, mathsmarks from student1 where maths = 1 order by uid");
            
            rs = pst.executeQuery();
            
            String[] columnNames = {"UID", "First Name", "Last Name", "Marks"};
            DefaultTableModel tableModel = new DefaultTableModel(columnNames,0);
            
            while(rs.next()){
                
                String uid = String.valueOf(rs.getInt("UID"));
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String marks = String.valueOf(rs.getInt("mathsmarks"));
                
                String[] data = {uid, firstName, lastName, marks};
                tableModel.addRow(data);
            
            }
            
            marksTable.setModel(tableModel);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_mathsBtnActionPerformed

    private void scienceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scienceBtnActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studenttest", "root", "test");
            
            pst = conn.prepareStatement("select uid, firstname, lastname, sciencemarks from student1 where science = 1 order by uid");
            
            rs = pst.executeQuery();
            
            String[] columnNames = {"UID", "First Name", "Last Name", "Marks"};
            DefaultTableModel tableModel = new DefaultTableModel(columnNames,0);
            
            while(rs.next()){
                
                String uid = String.valueOf(rs.getInt("UID"));
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String marks = String.valueOf(rs.getInt("sciencemarks"));
                
                String[] data = {uid, firstName, lastName, marks};
                tableModel.addRow(data);
            
            }
            
            marksTable.setModel(tableModel);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChangeGrades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_scienceBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeGrades(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton englishBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marksField;
    private javax.swing.JTable marksTable;
    private javax.swing.JButton mathsBtn;
    private javax.swing.JButton scienceBtn;
    private javax.swing.JTextField uidField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
