/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itrak;

/**
 *
 * @author user
 */

import static itrak.Resident_Update.DB_URL;
import static itrak.Resident_Update.PASS;
import static itrak.Resident_Update.USER;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import java.io.InputStream;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.imgscalr.Scalr;



public class UpdateForm_Resident extends javax.swing.JFrame {

    /**
     * Creates new form JFrameForm
     */
   
   static final String USER = "SYSTEM"; //Database Username
    static final String PASS = "HelloWorld1"; //Your Account Password
    static final String DATABASE = "orcl"; //Database Name
    static final String SERVER_IP = "dacsy"; //Your Database Server IP (run ipconfig in cmd)
    static final String PORT = "1521";
    static final String DB_URL = "jdbc:oracle:thin:@" + SERVER_IP + ":" + PORT + ":" +DATABASE; 
    
    public UpdateForm_Resident() {
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
        date = new javax.swing.JFormattedTextField();
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
        update = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        uploadPicture = new javax.swing.JButton();
        fileName1x1 = new javax.swing.JTextField();
        img1x1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fileNameSignature = new javax.swing.JTextField();
        uploadSignature = new javax.swing.JButton();
        imgSig = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 110, -1));
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 58, 110, -1));

        jLabel1.setText("First Name*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 62, -1));

        jLabel2.setText("Last name*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 38, -1, -1));

        backButton.setText("RETURN");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 351, 80, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("UPLOAD 1X1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 421, 92, -1));

        jLabel5.setText("Middle Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 38, -1, -1));
        getContentPane().add(middleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 58, 110, -1));

        jLabel6.setText("Suffix");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 38, -1, -1));

        suffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffixActionPerformed(evt);
            }
        });
        getContentPane().add(suffix, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 58, 48, -1));

        date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 58, 71, -1));

        jLabel7.setText("Birth Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 38, -1, -1));

        jLabel8.setText("Sex*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 38, 34, -1));

        sexBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        sexBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexBoxActionPerformed(evt);
            }
        });
        getContentPane().add(sexBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 58, -1, -1));

        gender.setName(""); // NOI18N
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 58, 73, -1));

        jLabel9.setText("Gender*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 38, 50, -1));

        lotNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotNumActionPerformed(evt);
            }
        });
        getContentPane().add(lotNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 46, -1));

        jLabel10.setText("Blk #");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 35, -1));
        getContentPane().add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 122, 101, -1));

        jLabel11.setText("Street*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 102, -1, -1));

        civilStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced" }));
        civilStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                civilStatusActionPerformed(evt);
            }
        });
        getContentPane().add(civilStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 122, 91, -1));

        jLabel3.setText("Civil Status*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 102, 67, -1));
        getContentPane().add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 122, 88, -1));

        jLabel12.setText("Religion*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 102, 51, -1));
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 122, 94, -1));

        jLabel13.setText("Nationality");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 102, 66, -1));
        getContentPane().add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 168, 99, -1));

        jLabel14.setText("Occupation");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 148, 131, -1));
        getContentPane().add(sss, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 167, 145, -1));

        jLabel15.setText("SSS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 148, -1, -1));
        getContentPane().add(philHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 167, 145, -1));

        jLabel16.setText("PhilHealth");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 148, -1, -1));
        getContentPane().add(tin, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 167, 145, -1));

        jLabel17.setText("TIN");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 148, -1, -1));
        getContentPane().add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, -1));

        jLabel18.setText("Telephone #");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 230, 120, -1));

        jLabel19.setText("Mobile #");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 205, -1, -1));
        getContentPane().add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 230, 80, -1));
        getContentPane().add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 230, 86, -1));
        getContentPane().add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 230, 120, -1));

        jLabel20.setText("Email Address");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 205, -1, -1));

        jLabel21.setText("Height");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 205, -1, -1));

        jLabel22.setText("Weight");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 205, -1, -1));

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 317, 80, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alive", "Dead", "Missing", " " }));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 122, 82, -1));

        jLabel24.setText("Status");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 102, -1, -1));

        uploadPicture.setText("UPLOAD");
        uploadPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPictureActionPerformed(evt);
            }
        });
        getContentPane().add(uploadPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 474, -1, -1));

        fileName1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileName1x1ActionPerformed(evt);
            }
        });
        getContentPane().add(fileName1x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 448, 111, -1));

        img1x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1x1.setText("PIRMA HERE");
        img1x1.setToolTipText("");
        getContentPane().add(img1x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 284, 166, 125));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("UPLOAD SIGNATURE");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 415, 121, 27));

        fileNameSignature.setToolTipText("");
        getContentPane().add(fileNameSignature, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 448, 121, -1));

        uploadSignature.setText("UPLOAD");
        uploadSignature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadSignatureActionPerformed(evt);
            }
        });
        getContentPane().add(uploadSignature, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 474, -1, -1));

        imgSig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSig.setText("PIRMA HERE");
        imgSig.setToolTipText("");
        getContentPane().add(imgSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 286, 163, 123));

        idField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idFieldKeyPressed(evt);
            }
        });
        getContentPane().add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 60, -1));

        jButton1.setText("FIND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

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

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void lotNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotNumActionPerformed

    private void civilStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_civilStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_civilStatusActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
               try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Connected ka na Oracle database pre");
            String query = "INSERT INTO MOCKDATABASEFORITRAK "
            + "(FIRSTNAME, MIDDLENAME, LASTNAME, SUFFIX, BIRTHDATE, GENDER, SEX, HOUSENUMBER, STREET, CIVILSTATUS, RELIGION, "
            + "STATUS, NATIONALITY, OCCUPATION, SSS, PHILHEALTH, TIN, TELEPHONENUMBER, MOBILENUMBER, HEIGHT, WEIGHT, EMAILADDRESS, IMAGE1, IMAGE2) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmnt = conn.prepareStatement(query);

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
            conn.close();
            System.out.println("Tama ka na pre");

        }
        catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

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
     imgSig.setIcon(icon);
    }//GEN-LAST:event_uploadSignatureActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void sexBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexBoxActionPerformed

    private void idFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Integer idValue = Integer.parseInt(idField.getText());
            PreparedStatement stmnt = conn.prepareStatement("SELECT * FROM RESIDENTS_DB WHERE ID LIKE '%" + idField.getText() + "%' ");
            ResultSet rs = stmnt.executeQuery();
            
                   while(rs.next()){
                String lastnameVal = rs.getString("LASTNAME");
                String firstnameVal = rs.getString("FIRSTNAME");
                String middlenameVal = rs.getString("MIDDLENAME");
                String suffixVal  = rs.getString("SUFFIXNAME");
                String birthdateVal = rs.getString("BIRTHDATE");
                String sexVal = rs.getString("SEX");
                String genderVal = rs.getString("GENDER");
                String lotVal = rs.getString("HOUSENUMBER");
                String streetVal = rs.getString("STREET");
                String civstatVal = rs.getString("CIVILSTATUS");
                String religonVal = rs.getString("RELIGION");
                String nationVal = rs.getString("NATIONALITY");
                String statVal = rs.getString("STATUS");
                String occVal = rs.getString("OCCUPATION");
                String sssVal = rs.getString("SSS");
                String phealthVal = rs.getString("PHILHEALTH");
                String tinVal = rs.getString("TIN");
                String tellyVal = rs.getString("TELEPHONENUMBER");
                String mobileVal = rs.getString("MOBILENUMBER");
                String heightVal = rs.getString("HEIGHT");
                String weightVal = rs.getString("WEIGHT");
                String emailVal = rs.getString("EMAILADDRESS");
                
                 firstName.setText(firstnameVal);
                    if(middlenameVal == null){
                 middleName.setText(" ");
                 }
                    else{
                 middleName.setText(middlenameVal);
                 }
                 
                 lastName.setText(lastnameVal);
                 
                    if(suffix == null){
                 suffix.setText(" ");
                 }
                    else{
                 suffix.setText(suffixVal);
                 }
                 
                 date.setText(birthdateVal);
                 sexBox.setSelectedItem(sexVal);
                 gender.setText(genderVal);
                 lotNum.setText(lotVal);
                 street.setText(streetVal);
                 civilStatus.setSelectedItem(civstatVal);
                 religion.setText(religonVal);
                 nationality.setText(nationVal);
                 status.setSelectedItem(statVal);
                 occupation.setText(occVal);
                    if(sssVal == null){
                 sss.setText(" ");
                 }
                    else{
                 sss.setText(sssVal);
                 }
                    if(phealthVal == null){
                 philHealth.setText(" ");
                 }
                    else{
                 philHealth.setText(phealthVal);
                 }
                     if(tinVal == null){
                 tin.setText(" ");
                 }
                     else{   
                 tin.setText(tinVal);
                 }
                 
                 telephone.setText(tellyVal);
                 mobile.setText(mobileVal);
                 emailAddress.setText(emailVal);
                 height.setText(heightVal);
                 weight.setText(weightVal);
                 
                  byte[] image1x1 = rs.getBytes("Image1");
                     BufferedImage Img1x1 = ImageIO.read(new ByteArrayInputStream(image1x1));
                     BufferedImage Img1x1Final = Scalr.resize(Img1x1, Scalr.Method.BALANCED, Img1x1.getWidth()/2, Img1x1.getHeight()/2);
                     ImageIcon iconimage1x1 = new ImageIcon(Img1x1Final);
                     img1x1.setIcon(iconimage1x1);  
                     
                 byte[] imageSig = rs.getBytes("Image2");
                     BufferedImage ImgSgn = ImageIO.read(new ByteArrayInputStream(imageSig));
                     BufferedImage ImgSgnFinal = Scalr.resize(ImgSgn, Scalr.Method.BALANCED, ImgSgn.getWidth()/2, ImgSgn.getHeight()/2);
                     ImageIcon iconimageSig = new ImageIcon(ImgSgnFinal);
                     imgSig.setIcon(iconimageSig);
                   }
                
        conn.close();
                
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error ka nanaman pards");
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm_Resident().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> civilStatus;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField fileName1x1;
    private javax.swing.JTextField fileNameSignature;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField height;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel img1x1;
    private javax.swing.JLabel imgSig;
    private javax.swing.JButton jButton1;
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
    public static javax.swing.JComboBox<String> sexBox;
    private javax.swing.JTextField sss;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField street;
    private javax.swing.JTextField suffix;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField tin;
    private javax.swing.JButton update;
    private javax.swing.JButton uploadPicture;
    private javax.swing.JButton uploadSignature;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}