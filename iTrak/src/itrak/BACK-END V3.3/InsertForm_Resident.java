/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author user
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;



public class InsertForm_Resident extends javax.swing.JFrame {

    /**
     * Creates new form JFrameForm
     */
    
     
    static final String USER = "SYSTEM"; //Database Username
    static final String PASS = "HelloWorld1"; //Your Account Password
    static final String DATABASE = "orcl"; //Database Name
    static final String SERVER_IP = "dacsy"; //Your Database Server IP (run ipconfig in cmd)
    static final String PORT = "1521";
    static final String DB_URL = "jdbc:oracle:thin:@" + SERVER_IP + ":" + PORT + ":" +DATABASE; 
    
    public InsertForm_Resident() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        middleName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        suffix = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexBox = new javax.swing.JComboBox<>();
        gender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lotNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        street = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        civilStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        religion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        occupation = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        sss = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        philHealth = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tin = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        emailAddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        uploadPicture = new javax.swing.JButton();
        fileName1x1 = new javax.swing.JTextField();
        img1x1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fileNameSignature = new javax.swing.JTextField();
        uploadSignature = new javax.swing.JButton();
        imageSignature = new javax.swing.JLabel();
        date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name*");

        jLabel2.setText("Last name*");

        backButton.setText("RETURN");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UPLOAD 1X1");

        jLabel5.setText("Middle Name");

        jLabel6.setText("Suffix");

        suffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffixActionPerformed(evt);
            }
        });

        jLabel7.setText("Birth Date");

        jLabel8.setText("Sex*");

        sexBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        gender.setName(""); // NOI18N

        jLabel9.setText("Gender*");

        lotNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotNumActionPerformed(evt);
            }
        });

        jLabel10.setText("Blk #");

        jLabel11.setText("Street*");

        civilStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced" }));
        civilStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                civilStatusActionPerformed(evt);
            }
        });

        jLabel3.setText("Civil Status*");

        jLabel12.setText("Religion*");

        jLabel13.setText("Nationality");

        jLabel14.setText("Occupation");

        jLabel15.setText("SSS");

        jLabel16.setText("PhilHealth");

        jLabel17.setText("TIN");

        jLabel18.setText("Telephone #");

        jLabel19.setText("Mobile #");

        jLabel20.setText("Email Address");

        jLabel21.setText("Height");

        jLabel22.setText("Weight");

        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alive", "Dead", "Missing", " " }));

        jLabel24.setText("Status");

        uploadPicture.setText("UPLOAD");
        uploadPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPictureActionPerformed(evt);
            }
        });

        fileName1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileName1x1ActionPerformed(evt);
            }
        });

        img1x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1x1.setText("PIRMA HERE");
        img1x1.setToolTipText("");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("UPLOAD SIGNATURE");

        fileNameSignature.setToolTipText("");

        uploadSignature.setText("UPLOAD");
        uploadSignature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSignatureActionPerformed(evt);
            }
        });

        imageSignature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageSignature.setText("PIRMA HERE");
        imageSignature.setToolTipText("");

        date.setText("MM/DD/YYYY");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(suffix, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel11)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lotNum, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(civilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel16)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(sss, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(philHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel19)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel20)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel21)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(img1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(imageSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(fileName1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(fileNameSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(uploadPicture)
                        .addGap(149, 149, 149)
                        .addComponent(uploadSignature)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel24))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lotNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(civilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(philHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(imageSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(insert)
                        .addGap(11, 11, 11)
                        .addComponent(backButton)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileName1x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileNameSignature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadPicture)
                    .addComponent(uploadSignature)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
       this.dispose();
       
    }//GEN-LAST:event_backButtonActionPerformed

    private void suffixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suffixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suffixActionPerformed

    private void lotNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotNumActionPerformed

    private void civilStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_civilStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_civilStatusActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        
         try{
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

               System.out.println("Connected ka na Oracle database pre");
            
            PreparedStatement stmnt = conn.prepareStatement("INSERT INTO residents_db "
                    + "(FIRSTNAME, MIDDLENAME, LASTNAME, SUFFIXNAME, BIRTHDATE, GENDER, SEX, HOUSENUMBER, STREET, CIVILSTATUS, RELIGION, "
                    + "STATUS, NATIONALITY, OCCUPATION, SSS, PHILHEALTH, TIN, TELEPHONENUMBER, MOBILENUMBER, HEIGHT, WEIGHT, EMAILADDRESS, IMAGE1, IMAGE2) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            stmnt.setString(1, firstName.getText());
            stmnt.setString(2, middleName.getText());
            stmnt.setString(3, lastName.getText());
            stmnt.setString(4, suffix.getText());
            stmnt.setString(5, date.getText());
            stmnt.setString(6, gender.getText());
            stmnt.setString(7, (String) sexBox.getSelectedItem());
            stmnt.setString(8, lotNum.getText());
            stmnt.setString(9, street.getText());
            stmnt.setString(10, (String) civilStatus.getSelectedItem());
            stmnt.setString(11, religion.getText());
            stmnt.setString(12, (String) status.getSelectedItem());
            stmnt.setString(13, nationality.getText());
            stmnt.setString(14, occupation.getText());
            stmnt.setString(15, sss.getText());
            stmnt.setString(16, philHealth.getText());
            stmnt.setString(17, tin.getText());
            stmnt.setString(18, telephone.getText());
            stmnt.setString(19, mobile.getText());
            stmnt.setString(20, height.getText());
            stmnt.setString(21, weight.getText());
            stmnt.setString(22, emailAddress.getText());
            
            InputStream onebyone = new FileInputStream(""+fileName1x1.getText()+"");
            InputStream signature = new FileInputStream(""+fileNameSignature.getText()+"");
           
            if(fileName1x1 == null){
                fileName1x1.setText("C:\\Users\\user\\Documents\\PicturesUsed\\default1x1.jpg");
                stmnt.setBlob(23, onebyone);
            
                }
            
            else{
                stmnt.setBlob(23, onebyone);
                }
            
            if(fileNameSignature == null){
                fileNameSignature.setText("C:\\Users\\user\\Documents\\PicturesUsed\\signatureDefault.png");
                stmnt.setBlob(24, signature);
                }
            
            else{
                stmnt.setBlob(24, signature);
                }
            
            stmnt.execute();
            System.out.println("Tama ka na pre");

            }

            catch(Exception e){
                
                System.err.println(e);
            }
        
        
        
        
    }//GEN-LAST:event_insertActionPerformed

    private void uploadPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPictureActionPerformed
        // TODO add your handling code here:
      JFileChooser chooser = new JFileChooser();
     chooser.showOpenDialog(null);
     File f = chooser.getSelectedFile();
     String filename = f.getAbsolutePath();
     fileName1x1.setText(filename);
     
     Image getAbsolutePath = null;
     ImageIcon icon = new ImageIcon(filename);
     Image image = icon.getImage().getScaledInstance(157, 110,Image.SCALE_SMOOTH);
     img1x1.setIcon(icon);
        
    }//GEN-LAST:event_uploadPictureActionPerformed

    private void fileName1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileName1x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileName1x1ActionPerformed

    private void uploadSignatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadSignatureActionPerformed
        // TODO add your handling code here:
        
     JFileChooser chooser = new JFileChooser();
     chooser.showOpenDialog(null);
     File f = chooser.getSelectedFile();
     String filename = f.getAbsolutePath();
     fileNameSignature.setText(filename);
     
     Image getAbsolutePath = null;
     ImageIcon icon = new ImageIcon(filename);
     Image image = icon.getImage().getScaledInstance(300, 300,Image.SCALE_SMOOTH);
     imageSignature.setIcon(icon);
    }//GEN-LAST:event_uploadSignatureActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

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
            java.util.logging.Logger.getLogger(InsertForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertForm_Resident().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> civilStatus;
    private javax.swing.JTextField date;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField fileName1x1;
    private javax.swing.JTextField fileNameSignature;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField height;
    private javax.swing.JLabel imageSignature;
    private javax.swing.JLabel img1x1;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField lotNum;
    private javax.swing.JTextField middleName;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField philHealth;
    private javax.swing.JTextField religion;
    private javax.swing.JComboBox<String> sexBox;
    private javax.swing.JTextField sss;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField street;
    private javax.swing.JTextField suffix;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField tin;
    private javax.swing.JButton uploadPicture;
    private javax.swing.JButton uploadSignature;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
