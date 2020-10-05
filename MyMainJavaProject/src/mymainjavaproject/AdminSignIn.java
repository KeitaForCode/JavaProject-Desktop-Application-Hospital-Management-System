/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymainjavaproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class AdminSignIn extends javax.swing.JFrame {

    /**
     * Creates new form AdminSignIn
     */
    public AdminSignIn() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Admin Sign");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        admin_user = new javax.swing.JTextField();
        admin_password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        admin_enter = new javax.swing.JButton();
        admin_forgotpassword = new javax.swing.JButton();
        admin_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymainjavaproject/images/Administrator Male_75px_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 90, 160));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        admin_user.setBackground(new java.awt.Color(51, 51, 51));
        admin_user.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        admin_user.setForeground(new java.awt.Color(255, 255, 255));
        admin_user.setBorder(null);
        jPanel1.add(admin_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 79, 163, 22));

        admin_password.setBackground(new java.awt.Color(51, 51, 51));
        admin_password.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        admin_password.setForeground(new java.awt.Color(255, 255, 255));
        admin_password.setBorder(null);
        jPanel1.add(admin_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 168, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 163, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 170, 10));

        admin_enter.setBackground(new java.awt.Color(153, 0, 0));
        admin_enter.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        admin_enter.setForeground(new java.awt.Color(255, 255, 255));
        admin_enter.setText("Enter");
        admin_enter.setContentAreaFilled(false);
        admin_enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_enterActionPerformed(evt);
            }
        });
        jPanel1.add(admin_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        admin_forgotpassword.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        admin_forgotpassword.setForeground(new java.awt.Color(255, 255, 255));
        admin_forgotpassword.setText("Forgot password");
        admin_forgotpassword.setBorder(null);
        admin_forgotpassword.setContentAreaFilled(false);
        admin_forgotpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_forgotpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_forgotpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(admin_forgotpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        admin_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mymainjavaproject/images/Reply All Arrow_20px_1.png"))); // NOI18N
        admin_back.setBorder(null);
        admin_back.setContentAreaFilled(false);
        admin_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_backActionPerformed(evt);
            }
        });
        jPanel1.add(admin_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMINISTRATOR SIGN IN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_enterActionPerformed
        // TODO add your handling code here:
        String username = admin_user.getText();
        String password = String.valueOf(admin_password.getPassword());
        if(username.equals("admin") && password.equals("admin"))
        {
        AdminDashBoard ad = new AdminDashBoard();
        this.dispose();
        }
        else if(username.equals("") && password.equals(""))
        {
        JOptionPane.showMessageDialog(this, "username and password must not be empty");
        }
        else if (username.equals("") && password.equals("admin"))
        {
        JOptionPane.showMessageDialog(this, "Username must not be empty");
        admin_password.setText("");
        }
        else if(username.equals("admin") && password.equals(""))
        {
        JOptionPane.showMessageDialog(this, "Password must not be empty");
         admin_user.setText("");
        }
        else if(username.equals("ADMIN") && password.equals("ADMIN"))
        {
        JOptionPane.showMessageDialog(this, "Username and password must be in lowercase");
         admin_user.setText("");
        admin_password.setText("");
        }
        else if(username.equals("Admin") && password.equals("Admin"))
        {
        JOptionPane.showMessageDialog(this,"Username and password must not start with uppercase");
         admin_user.setText("");
        admin_password.setText("");
        }
        else
        {
        JOptionPane.showMessageDialog(this, "You have enter the wrong username and password");
         admin_user.setText("");
        admin_password.setText("");
        }
    }//GEN-LAST:event_admin_enterActionPerformed
       
    private void admin_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_backActionPerformed
        // TODO add your handling code here:
        DashBoard db = new DashBoard();
        this.dispose();
    }//GEN-LAST:event_admin_backActionPerformed

    private void admin_forgotpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_forgotpasswordActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Your username and password remain (admin)");
    }//GEN-LAST:event_admin_forgotpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_back;
    private javax.swing.JButton admin_enter;
    private javax.swing.JButton admin_forgotpassword;
    private javax.swing.JPasswordField admin_password;
    private javax.swing.JTextField admin_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}