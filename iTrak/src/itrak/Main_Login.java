/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itrak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Main_Login extends javax.swing.JFrame {
    
    static final String USER = "SYSTEM"; //Database Username
    static final String PASS = "HelloWorld1"; //Your Account Password
    static final String DATABASE = "orcl"; //Database Name
    static final String SERVER_IP = "dacsy"; //Your Database Server IP (run ipconfig in cmd)
    static final String PORT = "1521";
    static final String DB_URL = "jdbc:oracle:thin:@" + SERVER_IP + ":" + PORT + ":" +DATABASE;  
    
    /*static final String USER = "system"; //Database Username
    static final String PASS = "Admin123"; //Your Account Password
    static final String DATABASE = "ztt"; //Database Name
    static final String SERVER_IP = "localhost"; //Your Database Server IP (run ipconfig in cmd)
    static final String PORT = "1521";
    static final String DB_URL = "jdbc:oracle:thin:@" + SERVER_IP + ":" + PORT + ":" +DATABASE;   */
    
    
    public Main_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        signIn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(61, 178, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setBorder(null);
        usernameField.setOpaque(false);
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 160, 20));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        passwordField.setBorder(null);
        passwordField.setOpaque(false);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 160, 20));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 76, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(61, 178, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 160, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(61, 178, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, 10));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel16.setText("Sign In");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        signIn.setBackground(new java.awt.Color(51, 51, 51));
        signIn.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setText("SIGN IN");
        signIn.setContentAreaFilled(false);
        signIn.setOpaque(true);
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jPanel1.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 430, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
 
        if(usernameField.getText().isEmpty()==true || passwordField.getText().isEmpty()){
            jOptionPane1.showMessageDialog(null, "Please type your username and password!");
        }else{
            try{
                
                Connection conn = null;
                conn=DriverManager.getConnection(DB_URL, USER, PASS);

                //Check if connected
                if (conn != null) {
                    System.out.println("Connected");
                }else{
                    System.out.println("Connection Error");
                }

                String username = usernameField.getText();
                String password = passwordField.getText();
                String sql = "SELECT count(*) from BRGYOFFICIALS_DB where username='" + username + "' AND password='" + password+"' AND admin='T'";

                //'PreparedStatement' - an object that represents a precompiled SQL statement
                PreparedStatement ps = conn.prepareStatement(sql);

                //'ResultSet' - a table of data representing a database result set
                ResultSet rs = ps.executeQuery();

                //rs.next() is a method of the ResultSet interface moves the pointer of the current (ResultSet) object to the next row
                rs.next(); //

                //Check result if more than 0
                int count = rs.getInt(1);
                if(count>0){
                    jOptionPane1.showMessageDialog(null, "Login Success!");
                    new Main_Dashboard().setVisible(true);
                    this.dispose();
                }else{
                    jOptionPane1.showMessageDialog(null, "Invalid account,please try again!");
                }
                //Close the connection
                conn.close();

            }catch(SQLException se){
                System.out.println(se);
            }
        }
    }//GEN-LAST:event_signInActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signIn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private static class jOptionPane1 {

        private static void showMessageDialog(Object object, String please_type_your_username_and_password) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jOptionPane1() {
        }
    }
}
