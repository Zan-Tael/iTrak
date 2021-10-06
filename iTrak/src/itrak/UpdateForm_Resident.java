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
import static javaapplication2.DBManager.DB_URL;
import static javaapplication2.DBManager.PASS;
import static javaapplication2.DBManager.USER;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;



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
    System.out.print(id);
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
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        middleNameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        suffixTxt = new javax.swing.JTextField();
        date = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexBox = new javax.swing.JComboBox<>();
        genderTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lotNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        streetTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        civilStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        religionTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        occupation = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        sssTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        philHealth = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tinTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        mobileTxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        heightTxt = new javax.swing.JTextField();
        weightTxt = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 110, -1));
        getContentPane().add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 58, 110, -1));

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
        getContentPane().add(middleNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 58, 110, -1));

        jLabel6.setText("Suffix");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 38, -1, -1));

        suffixTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffixTxtActionPerformed(evt);
            }
        });
        getContentPane().add(suffixTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 58, 48, -1));

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

        genderTxt.setName(""); // NOI18N
        getContentPane().add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 58, 73, -1));

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
        getContentPane().add(streetTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 122, 101, -1));

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
        getContentPane().add(religionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 122, 88, -1));

        jLabel12.setText("Religion*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 102, 51, -1));
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 122, 94, -1));

        jLabel13.setText("Nationality");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 102, 66, -1));
        getContentPane().add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 168, 99, -1));

        jLabel14.setText("Occupation");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 148, 131, -1));
        getContentPane().add(sssTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 167, 145, -1));

        jLabel15.setText("SSS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 148, -1, -1));
        getContentPane().add(philHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 167, 145, -1));

        jLabel16.setText("PhilHealth");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 148, -1, -1));
        getContentPane().add(tinTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 167, 145, -1));

        jLabel17.setText("TIN");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 148, -1, -1));
        getContentPane().add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, -1));

        jLabel18.setText("Telephone #");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));
        getContentPane().add(mobileTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 230, 120, -1));

        jLabel19.setText("Mobile #");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 205, -1, -1));
        getContentPane().add(heightTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 230, 80, -1));
        getContentPane().add(weightTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 230, 86, -1));
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DBManager DBManagerClass = new DBManager();
    int id;
    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
       this.dispose();
       
    }//GEN-LAST:event_backButtonActionPerformed

    private void suffixTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suffixTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suffixTxtActionPerformed

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

            Statement statement = conn.createStatement();

            String sql = "SELECT * FROM MOCKDATABASEFORITRAK WHERE ID like '%%'";
            ResultSet result = statement.executeQuery(sql);

            JOptionPane.showMessageDialog(this,"Update Successful!");

        }

        catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Awit may mali nanaman");
            System.err.println(ex);
        }
        
        
         try{
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

               System.out.println("Connected ka na Oracle database pre");
            
            PreparedStatement stmnt = conn.prepareStatement("INSERT INTO residents_db "
                    + "(FIRSTNAME, MIDDLENAME, LASTNAME, SUFFIX, BIRTHDATE, GENDER, SEX, HOUSENUMBER, STREET, CIVILSTATUS, RELIGION, "
                    + "STATUS, NATIONALITY, OCCUPATION, SSS, PHILHEALTH, TIN, TELEPHONENUMBER, MOBILENUMBER, HEIGHT, WEIGHT, EMAILADDRESS, IMAGE1, IMAGE2) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            stmnt.setString(1, firstNameTxt.getText());
            stmnt.setString(2, middleNameTxt.getText());
            stmnt.setString(3, lastNameTxt.getText());
            stmnt.setString(4, suffixTxt.getText());
            stmnt.setString(5, date.getText());
            stmnt.setString(6, genderTxt.getText());
            stmnt.setString(7, (String) sexBox.getSelectedItem());
            stmnt.setString(8, lotNum.getText());
            stmnt.setString(9, streetTxt.getText());
            stmnt.setString(10, (String) civilStatus.getSelectedItem());
            stmnt.setString(11, religionTxt.getText());
            stmnt.setString(12, (String) status.getSelectedItem());
            stmnt.setString(13, nationality.getText());
            stmnt.setString(14, occupation.getText());
            stmnt.setString(15, sssTxt.getText());
            stmnt.setString(16, philHealth.getText());
            stmnt.setString(17, tinTxt.getText());
            stmnt.setString(18, telephone.getText());
            stmnt.setString(19, mobileTxt.getText());
            stmnt.setString(20, heightTxt.getText());
            stmnt.setString(21, weightTxt.getText());
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
           
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);  
            PreparedStatement stmnt = conn.prepareStatement("SELECT * FROM residents_db WHERE ID = " + id + "");
            
            
            ResultSet rs = stmnt.executeQuery();

            while(rs.next()){
                String lastname = rs.getString("LASTNAME");
                String firstname = rs.getString("FIRSTNAME");
                String middlename = rs.getString("MIDDLENAME");
                String suffix  = rs.getString("SUFFIX");
                String birthdate = rs.getString("BIRTHDATE");
                String sex = rs.getString("SEX");
                String gender = rs.getString("GENDER");
                String lot = rs.getString("HOUSENUMBER");
                String street = rs.getString("STREET");
                String civstat = rs.getString("CIVILSTATUS");
                String religon = rs.getString("RELIGION");
                String nation = rs.getString("NATIONALITY");
                String stat = rs.getString("STATUS");
                String occ = rs.getString("OCCUPATION");
                String sss = rs.getString("SSS");
                String phealth = rs.getString("PHILHEALTH");
                String tin = rs.getString("TIN");
                String telly = rs.getString("TELEPHONENUMBER");
                String mobile = rs.getString("MOBILENUMBER");
                String height = rs.getString("HEIGHT");
                String weight = rs.getString("WEIGHT");
                String email = rs.getString("EMAILADDRESS");
                
                 firstNameTxt.setText(firstname);
                    if(middlename == null){
                 middleNameTxt.setText(" ");
                 }
                    else{
                 middleNameTxt.setText(middlename);
                 }
                 
                 lastNameTxt.setText(lastname);
                 
                    if(suffix == null){
                 suffixTxt.setText(" ");
                 }
                    else{
                 suffixTxt.setText(suffix);
                 }
                 
                 date.setText(birthdate);
                 sexBox.setSelectedItem(sex);
                 genderTxt.setText(gender);
                 lotNum.setText(lot);
                 streetTxt.setText(street);
                 civilStatus.setSelectedItem(civstat);
                 religionTxt.setText(religon);
                 nationality.setText(nation);
                 status.setSelectedItem(stat);
                 occupation.setText(occ);
                    if(sss == null){
                 sssTxt.setText(" ");
                 }
                    else{
                 sssTxt.setText(sss);
                 }
                    if(phealth == null){
                 philHealth.setText(" ");
                 }
                    else{
                 philHealth.setText(phealth);
                 }
                     if(tin == null){
                 tinTxt.setText(" ");
                 }
                     else{   
                 tinTxt.setText(tin);
                 }
                 
                 telephone.setText(telly);
                 mobileTxt.setText(mobile);
                 emailAddress.setText(email);
                 heightTxt.setText(height);
                 weightTxt.setText(weight);
                 
                  byte[] image1x1 = rs.getBytes("Image1");
                     BufferedImage Img1x1 = ImageIO.read(new ByteArrayInputStream(image1x1));
                     ImageIcon iconimage1x1 = new ImageIcon(Img1x1);
                     img1x1.setIcon(iconimage1x1);  
                     
                 byte[] imageSig = rs.getBytes("Image2");
                     BufferedImage Imgsgn = ImageIO.read(new ByteArrayInputStream(imageSig));
                     ImageIcon iconimageSig = new ImageIcon(Imgsgn);
                     imgSig.setIcon(iconimageSig);
                    
            }
            conn.close();
        }

        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("not a number" + e);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void sexBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexBoxActionPerformed

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
    private javax.swing.JFormattedTextField date;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField fileName1x1;
    private javax.swing.JTextField fileNameSignature;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JLabel img1x1;
    private javax.swing.JLabel imgSig;
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
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField lotNum;
    private javax.swing.JTextField middleNameTxt;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField philHealth;
    private javax.swing.JTextField religionTxt;
    public static javax.swing.JComboBox<String> sexBox;
    private javax.swing.JTextField sssTxt;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField streetTxt;
    private javax.swing.JTextField suffixTxt;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField tinTxt;
    private javax.swing.JButton update;
    private javax.swing.JButton uploadPicture;
    private javax.swing.JButton uploadSignature;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
