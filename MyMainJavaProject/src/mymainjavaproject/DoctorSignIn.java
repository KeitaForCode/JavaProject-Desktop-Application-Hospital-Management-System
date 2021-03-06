/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymainjavaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class DoctorSignIn extends javax.swing.JFrame {

    /**
     * Creates new form DoctorSignIn
     */
    public DoctorSignIn() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Doctor Sign in");
        setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        docusername = new javax.swing.JTextField();
        docpassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        doctorenter = new javax.swing.JButton();
        docforgotpass = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DOCTOR SIGN IN ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymainjavaproject/images/Administrator Male_75px_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 150));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        docusername.setBackground(new java.awt.Color(51, 51, 51));
        docusername.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        docusername.setForeground(new java.awt.Color(255, 255, 255));
        docusername.setBorder(null);
        jPanel1.add(docusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 20));

        docpassword.setBackground(new java.awt.Color(51, 51, 51));
        docpassword.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        docpassword.setForeground(new java.awt.Color(255, 255, 255));
        docpassword.setBorder(null);
        jPanel1.add(docpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 150, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 150, 10));

        doctorenter.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        doctorenter.setForeground(new java.awt.Color(255, 255, 255));
        doctorenter.setText("Enter");
        doctorenter.setContentAreaFilled(false);
        doctorenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctorenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorenterActionPerformed(evt);
            }
        });
        jPanel1.add(doctorenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        docforgotpass.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        docforgotpass.setForeground(new java.awt.Color(255, 255, 255));
        docforgotpass.setText("Forgot Password");
        docforgotpass.setContentAreaFilled(false);
        docforgotpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docforgotpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docforgotpassActionPerformed(evt);
            }
        });
        jPanel1.add(docforgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymainjavaproject/images/Reply All Arrow_20px_1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorenterActionPerformed
        String username = docusername.getText();
        String pass = docpassword.getText();
        try{
         String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/javaDatabase";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        String qry = "select * from AddDoctor where Email = ? and Password = ?";
        PreparedStatement pst = con.prepareStatement(qry);
        pst.setString(1, username);
        pst.setString(2, pass);
        
          ResultSet rs = pst.executeQuery();
        if (rs.next()){
        DoctorDashBoard db = new DoctorDashBoard();
        this.dispose();
        docusername.setText("");
        docpassword.setText("");
        }
        else{
        JOptionPane.showMessageDialog(null, "Wrong username and password");
        docusername.setText("");
        docpassword.setText("");
        }
      }
      catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_doctorenterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DashBoard db = new DashBoard();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void docforgotpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docforgotpassActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Please contact the admin for your password");
    }//GEN-LAST:event_docforgotpassActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton docforgotpass;
    private javax.swing.JPasswordField docpassword;
    private javax.swing.JButton doctorenter;
    private javax.swing.JTextField docusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
