package itrak;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.Color;

public class Resident_DataManager extends javax.swing.JFrame {

    static final String USER = "system"; //Database Username
    static final String PASS = "Admin123"; //Your Account Password
    static final String DATABASE = "ztt"; //Database Name
    static final String SERVER_IP = "localhost"; //Your Database Server IP (run ipconfig in cmd)
    static final String PORT = "1521";
    static final String DB_URL = "jdbc:oracle:thin:@" + SERVER_IP + ":" + PORT + ":" +DATABASE;   
    
    public Resident_DataManager() {
        initComponents();
        Refresh();
    }
    
    public void Update(){
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             
            Statement statement = conn.createStatement();
             
            String sql = "SELECT * FROM MOCKDATABASEFORITRAK WHERE ID like '%" + txtID.getText() + "%'";
            ResultSet result = statement.executeQuery(sql);
                while(result.next()){
                    //code here
                }
            conn.close();
       }
       catch(Exception e){
            System.out.println(e.getMessage());
       }
        
    } 
    
    public void Refresh(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement st = con.createStatement();

            String sql = "SELECT * FROM mockdatabaseforitrak ORDER BY id ASC";
            ResultSet rs = st.executeQuery(sql);

            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.setRowCount(0);

            while(rs.next()){
                String id = String.valueOf(rs.getInt("ID"));
                String lastname = rs.getString("LASTNAME");
                String firstname = rs.getString("FIRSTNAME");
                String middlename = rs.getString("MIDDLENAME");
                String suffix  = rs.getString("SUFFIX");
                String sex = rs.getString("SEX");
                String gender = rs.getString("GENDER");
                String birthdate = rs.getString("BIRTHDATE");
                String telly = rs.getString("TELEPHONENUMBER");
                String mobile = rs.getString("MOBILENUMBER");
                String email = rs.getString("EMAILADDRESS");
                String status = rs.getString("STATUS");

                String tbData[] = {id, lastname, firstname, middlename, suffix, sex, gender, birthdate, telly, mobile, email, status };

                tblModel.addRow(tbData);
            }
            con.close();
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblIcon = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mobileField = new javax.swing.JTextField();
        tellyField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        HomePage = new javax.swing.JLabel();
        database = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        DatabasePage = new javax.swing.JLabel();
        documents = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        DocumentPage = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ReportPage = new javax.swing.JLabel();
        officials = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        OfficialPage = new javax.swing.JLabel();
        aboutus = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        AboutPage = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        LogoutPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsert.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        main.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 81, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        main.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 81, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        main.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorderPainted(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        main.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 81, -1));

        btnRefresh.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(null);
        btnRefresh.setBorderPainted(false);
        btnRefresh.setPreferredSize(new java.awt.Dimension(62, 27));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        main.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 81, 30));

        jTable1.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Last Name", "First Name", "Middle Name", "Suffix", "Sex", "Gender", "Birthdate", "Telephone Number", "Mobile Number", "Email Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jTable1ComponentResized(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 930, 390));

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID.setText("ID");
        main.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 100, -1));

        txtID.setEditable(false);
        txtID.setAutoscrolls(false);
        txtID.setBorder(null);
        txtID.setFocusable(false);
        txtID.setOpaque(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        main.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 27, -1));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        main.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 180, 180));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        main.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 179, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Full Name");
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 100, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Home Address");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 100, 20));
        main.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 300, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mobile Number");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telephone Number");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 100, -1));
        main.add(mobileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 140, -1));
        main.add(tellyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 140, -1));

        jPanel4.setBackground(new java.awt.Color(61, 178, 255));
        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        SideBar.setBackground(new java.awt.Color(51, 51, 51));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Menu");
        SideBar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        home.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        HomePage.setBackground(new java.awt.Color(204, 204, 204));
        HomePage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HomePage.setForeground(new java.awt.Color(255, 255, 255));
        HomePage.setText("Home");
        HomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomePageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomePageMouseExited(evt);
            }
        });
        home.add(HomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 50));

        database.setBackground(new java.awt.Color(51, 51, 51));
        database.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        database.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        DatabasePage.setBackground(new java.awt.Color(204, 204, 204));
        DatabasePage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DatabasePage.setForeground(new java.awt.Color(255, 255, 255));
        DatabasePage.setText("Database");
        DatabasePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatabasePageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DatabasePageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DatabasePageMouseExited(evt);
            }
        });
        database.add(DatabasePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(database, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 50));

        documents.setBackground(new java.awt.Color(51, 51, 51));
        documents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        documents.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        DocumentPage.setBackground(new java.awt.Color(204, 204, 204));
        DocumentPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DocumentPage.setForeground(new java.awt.Color(255, 255, 255));
        DocumentPage.setText("Documents");
        DocumentPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocumentPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DocumentPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DocumentPageMouseExited(evt);
            }
        });
        documents.add(DocumentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(documents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 50));

        reports.setBackground(new java.awt.Color(51, 51, 51));
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        reports.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        ReportPage.setBackground(new java.awt.Color(204, 204, 204));
        ReportPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReportPage.setForeground(new java.awt.Color(255, 255, 255));
        ReportPage.setText("Reports");
        ReportPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportPageMouseExited(evt);
            }
        });
        reports.add(ReportPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 50));

        officials.setBackground(new java.awt.Color(51, 51, 51));
        officials.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        officials.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        OfficialPage.setBackground(new java.awt.Color(204, 204, 204));
        OfficialPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OfficialPage.setForeground(new java.awt.Color(255, 255, 255));
        OfficialPage.setText("Officials");
        OfficialPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OfficialPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OfficialPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OfficialPageMouseExited(evt);
            }
        });
        officials.add(OfficialPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(officials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        aboutus.setBackground(new java.awt.Color(51, 51, 51));
        aboutus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        aboutus.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        AboutPage.setBackground(new java.awt.Color(204, 204, 204));
        AboutPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AboutPage.setForeground(new java.awt.Color(255, 255, 255));
        AboutPage.setText("About Us");
        AboutPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutPageMouseExited(evt);
            }
        });
        aboutus.add(AboutPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 210, 50));

        logout.setBackground(new java.awt.Color(51, 51, 51));
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        logout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        LogoutPage.setBackground(new java.awt.Color(204, 204, 204));
        LogoutPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LogoutPage.setForeground(new java.awt.Color(255, 255, 255));
        LogoutPage.setText("Log Out");
        LogoutPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutPageMouseExited(evt);
            }
        });
        logout.add(LogoutPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 210, 50));

        main.add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:

        this.dispose();
        new Resident_Insert().setVisible(true);

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        try {
            int selectedRow = jTable1.getSelectedRow();
            String modelRow = (String) jTable1.getValueAt(selectedRow, 0);
            tblModel.removeRow((int) selectedRow);

            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

            String query = "DELETE FROM mockdatabaseforitrak WHERE id = ?";
            java.sql.PreparedStatement prepstmt = con.prepareStatement(query);

            prepstmt.setString(1, modelRow);

            prepstmt.executeUpdate();

            con.close();
        }

        catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Update();
        this.dispose();
        new Resident_Update().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        tblModel.setRowCount(0);

        txtID.setText("");
        nameField.setText("");
        addressField.setText("");
        mobileField.setText("");
        tellyField.setText("");
        lblIcon.setIcon(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmnt = conn.prepareStatement("SELECT * FROM MOCKDATABASEFORITRAK WHERE ID like '%" + txtID.getText() + "%'");
            ResultSet result = stmnt.executeQuery();

            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

            int selectRow = jTable1.getSelectedRow();
            Object middle = tblModel.getValueAt(selectRow,4);
            Object suffix = tblModel.getValueAt(selectRow,5);

            while(result.next()){

                txtID.setText(tblModel.getValueAt(selectRow,0).toString());
                /* conditions if yung middle name or suffic is empty */
                if (middle == null){
                    nameField.setText(tblModel.getValueAt(selectRow,2) + " " + tblModel.getValueAt(selectRow,3) +" " + tblModel.getValueAt(selectRow,1).toString());
                }

                else if(suffix == null){
                    nameField.setText(tblModel.getValueAt(selectRow,2) + " " + tblModel.getValueAt(selectRow,1).toString() + " " + tblModel.getValueAt(selectRow,5).toString());
                }

                else if (middle == null & suffix == null){
                    nameField.setText(tblModel.getValueAt(selectRow,2) + " " + tblModel.getValueAt(selectRow,1).toString());
                }
                else{
                    nameField.setText(tblModel.getValueAt(selectRow,2) + " " + tblModel.getValueAt(selectRow,3) +" " + tblModel.getValueAt(selectRow,1).toString() + " " + tblModel.getValueAt(selectRow,4));
                }

                addressField.setText(result.getString("HouseNumber") + ", " + result.getString("Street") + " St, Brgy. Liwanag, Mexico City");
                mobileField.setText(result.getString("MobileNumber"));
                tellyField.setText(result.getString("TelephoneNumber"));

                byte[] image1x1 = result.getBytes("Image1");
                BufferedImage Img1x1 = ImageIO.read(new ByteArrayInputStream(image1x1));
                ImageIcon iconimage = new ImageIcon(Img1x1);
                lblIcon.setIcon(iconimage);

            }
            conn.close();

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error ka nanaman pards");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentResized
        // TODO add your handling code here:
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(50);
        columnModel.getColumn(5).setPreferredWidth(50);
        columnModel.getColumn(6).setPreferredWidth(80);
        columnModel.getColumn(7).setPreferredWidth(130);
        columnModel.getColumn(8).setPreferredWidth(130);
        columnModel.getColumn(9).setPreferredWidth(130);
        columnModel.getColumn(10).setPreferredWidth(270);
        columnModel.getColumn(11).setPreferredWidth(80);

    }//GEN-LAST:event_jTable1ComponentResized

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void AboutPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutPageMouseClicked

    private void OfficialPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialPageMouseClicked
        new Officials_DataManager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OfficialPageMouseClicked

    private void ReportPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPageMouseClicked
        new Main_Reports().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReportPageMouseClicked

    private void DocumentPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseClicked
        new Main_IDGenerator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DocumentPageMouseClicked

    private void HomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageMouseClicked
        new Main_Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomePageMouseClicked

    private void HomePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageMouseEntered
        home.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_HomePageMouseEntered

    private void HomePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageMouseExited
        home.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_HomePageMouseExited

    private void DatabasePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseEntered
        database.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_DatabasePageMouseEntered

    private void DatabasePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseExited
        database.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_DatabasePageMouseExited

    private void DatabasePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DatabasePageMouseClicked

    private void DocumentPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseEntered
        documents.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_DocumentPageMouseEntered

    private void DocumentPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseExited
        documents.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_DocumentPageMouseExited

    private void ReportPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPageMouseEntered
        reports.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_ReportPageMouseEntered

    private void ReportPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPageMouseExited
        reports.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_ReportPageMouseExited

    private void OfficialPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialPageMouseEntered
        officials.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_OfficialPageMouseEntered

    private void OfficialPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialPageMouseExited
        officials.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_OfficialPageMouseExited

    private void AboutPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPageMouseEntered
        aboutus.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_AboutPageMouseEntered

    private void AboutPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPageMouseExited
        aboutus.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_AboutPageMouseExited

    private void LogoutPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutPageMouseClicked

    private void LogoutPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPageMouseEntered
        logout.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_LogoutPageMouseEntered

    private void LogoutPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPageMouseExited
        logout.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_LogoutPageMouseExited

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
            java.util.logging.Logger.getLogger(Resident_DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resident_DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resident_DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resident_DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resident_DataManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutPage;
    private javax.swing.JLabel DatabasePage;
    private javax.swing.JLabel DocumentPage;
    private javax.swing.JLabel HomePage;
    private javax.swing.JLabel LogoutPage;
    private javax.swing.JLabel OfficialPage;
    private javax.swing.JLabel ReportPage;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel aboutus;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel database;
    private javax.swing.JPanel documents;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel main;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel officials;
    private javax.swing.JPanel reports;
    private javax.swing.JTextField tellyField;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
