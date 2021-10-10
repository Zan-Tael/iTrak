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
    static final String PASS = "pdbtip12345"; //Your Account Password
    static final String DATABASE = "cdb"; //Database Name
    static final String SERVER_IP = "192.168.56.1"; //Your Database Server IP (run ipconfig in cmd)
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
             
            String sql = "SELECT * FROM residents_db WHERE ID like '%" + txtID.getText() + "%'";
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

            String sql = "SELECT * FROM residents_db ORDER BY id ASC";
            ResultSet rs = st.executeQuery(sql);

            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.setRowCount(0);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("ID"));
                String lastname = rs.getString("LASTNAME");
                String firstname = rs.getString("FIRSTNAME");
                String middlename = rs.getString("MIDDLENAME");
                String suffix  = rs.getString("SUFFIXNAME");
                String sex = rs.getString("SEX");
                String gender = rs.getString("GENDER");
                String birthdate = rs.getString("BIRTHDATE");
               // String telly = rs.getString("TELEPHONENUMBER");
                //String mobile = rs.getString("MOBILENUMBER");
                //String email = rs.getString("EMAILADDRESS");
                //String status = rs.getString("STATUS");

                String tbData[] = {id, lastname, firstname, middlename, suffix, sex, gender, birthdate};

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
        jPanel4 = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        HomePage = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        database = new javax.swing.JPanel();
        DatabasePage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        documents = new javax.swing.JPanel();
        DocumentPage = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        ReportPage = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        officials = new javax.swing.JPanel();
        OfficialPage = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aboutus = new javax.swing.JPanel();
        AboutPage = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        LogoutPage = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DataOutput = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        tellyField = new javax.swing.JTextField();
        lblID1 = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        sexField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        lblID2 = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        statusField = new javax.swing.JTextField();
        lblID4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setMinimumSize(new java.awt.Dimension(1000, 680));
        main.setPreferredSize(new java.awt.Dimension(1000, 680));
        main.setRequestFocusEnabled(false);
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsert.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        main.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 80, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        main.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 81, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        main.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorderPainted(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        main.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 81, -1));

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
        main.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 80, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Last Name", "First Name", "Middle Name", "Suffix", "Sex", "Gender", "Birthdate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(61, 178, 255));
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 660, 410));

        jPanel4.setBackground(new java.awt.Color(61, 178, 255));
        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1220, 50));

        SideBar.setBackground(new java.awt.Color(51, 51, 51));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage.setBackground(new java.awt.Color(204, 204, 204));
        HomePage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        HomePage.setForeground(new java.awt.Color(255, 255, 255));
        HomePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomePage.setText("Home");
        HomePage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        home.add(HomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/32_home.png"))); // NOI18N
        home.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        SideBar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 60));

        database.setBackground(new java.awt.Color(51, 51, 51));
        database.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatabasePage.setBackground(new java.awt.Color(204, 204, 204));
        DatabasePage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DatabasePage.setForeground(new java.awt.Color(255, 255, 255));
        DatabasePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatabasePage.setText("Database");
        DatabasePage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        database.add(DatabasePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/32_folder.png"))); // NOI18N
        database.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        SideBar.add(database, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 60));

        documents.setBackground(new java.awt.Color(51, 51, 51));
        documents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocumentPage.setBackground(new java.awt.Color(204, 204, 204));
        DocumentPage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DocumentPage.setForeground(new java.awt.Color(255, 255, 255));
        DocumentPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DocumentPage.setText("Documents");
        DocumentPage.setToolTipText("");
        DocumentPage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        documents.add(DocumentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/32_copy.png"))); // NOI18N
        documents.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        SideBar.add(documents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 80, 60));

        reports.setBackground(new java.awt.Color(51, 51, 51));
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReportPage.setBackground(new java.awt.Color(204, 204, 204));
        ReportPage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ReportPage.setForeground(new java.awt.Color(255, 255, 255));
        ReportPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReportPage.setText("Reports");
        ReportPage.setToolTipText("");
        ReportPage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        reports.add(ReportPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/32_chart.png"))); // NOI18N
        reports.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        SideBar.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 80, 60));

        officials.setBackground(new java.awt.Color(51, 51, 51));
        officials.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OfficialPage.setBackground(new java.awt.Color(204, 204, 204));
        OfficialPage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        OfficialPage.setForeground(new java.awt.Color(255, 255, 255));
        OfficialPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OfficialPage.setText("Officials");
        OfficialPage.setToolTipText("");
        OfficialPage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        officials.add(OfficialPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/32_user.png"))); // NOI18N
        officials.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        SideBar.add(officials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 80, 60));

        aboutus.setBackground(new java.awt.Color(51, 51, 51));
        aboutus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AboutPage.setBackground(new java.awt.Color(204, 204, 204));
        AboutPage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        AboutPage.setForeground(new java.awt.Color(255, 255, 255));
        AboutPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutPage.setText("About Us");
        AboutPage.setToolTipText("");
        AboutPage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        aboutus.add(AboutPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/32_user.png"))); // NOI18N
        aboutus.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        SideBar.add(aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 80, 60));

        logout.setBackground(new java.awt.Color(51, 51, 51));
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoutPage.setBackground(new java.awt.Color(204, 204, 204));
        LogoutPage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LogoutPage.setForeground(new java.awt.Color(255, 255, 255));
        LogoutPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoutPage.setText("Log Out");
        LogoutPage.setToolTipText("");
        LogoutPage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        logout.add(LogoutPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/32_logout.png"))); // NOI18N
        logout.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        SideBar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 80, 60));

        main.add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 700));

        DataOutput.setBackground(new java.awt.Color(255, 255, 255));
        DataOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DataOutput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DataOutput.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nameField.setBorder(null);
        nameField.setOpaque(false);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        DataOutput.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 350, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        DataOutput.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, -1));

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID.setText("Contant Information");
        DataOutput.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 230, -1));

        addressField.setEditable(false);
        addressField.setBackground(new java.awt.Color(255, 255, 255));
        addressField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressField.setBorder(null);
        DataOutput.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 300, -1));

        mobileField.setEditable(false);
        mobileField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mobileField.setBorder(null);
        mobileField.setOpaque(false);
        DataOutput.add(mobileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 140, -1));

        tellyField.setEditable(false);
        tellyField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tellyField.setBorder(null);
        tellyField.setOpaque(false);
        DataOutput.add(tellyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, -1));

        lblID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID1.setText("Gender");
        DataOutput.add(lblID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 50, -1));

        genderField.setEditable(false);
        genderField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderField.setBorder(null);
        genderField.setOpaque(false);
        DataOutput.add(genderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 50, -1));

        sexField.setEditable(false);
        sexField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sexField.setBorder(null);
        sexField.setOpaque(false);
        DataOutput.add(sexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 50, -1));

        emailField.setEditable(false);
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailField.setBorder(null);
        emailField.setOpaque(false);
        DataOutput.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 140, -1));

        lblID2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID2.setText("ID");
        DataOutput.add(lblID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 20, -1));

        lblID3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID3.setText("Sex");
        DataOutput.add(lblID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 20, -1));

        statusField.setEditable(false);
        statusField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusField.setBorder(null);
        statusField.setOpaque(false);
        DataOutput.add(statusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 110, -1));

        lblID4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID4.setText("Status");
        DataOutput.add(lblID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 50, -1));

        main.add(DataOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 660, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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

            String query = "DELETE FROM residents_db WHERE id = ?";
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
        Refresh();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement stmnt = conn.prepareStatement("SELECT * FROM residents_db WHERE ID like '%" + txtID.getText() + "%'");
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

                else if (middle == null && suffix == null){
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
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(125);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(40);
        columnModel.getColumn(5).setPreferredWidth(40);
        columnModel.getColumn(6).setPreferredWidth(59);
        columnModel.getColumn(7).setPreferredWidth(129);
       // columnModel.getColumn(8).setPreferredWidth(130);
       // columnModel.getColumn(9).setPreferredWidth(130);
       // columnModel.getColumn(10).setPreferredWidth(270);
       // columnModel.getColumn(11).setPreferredWidth(80);

    }//GEN-LAST:event_jTable1ComponentResized

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
        new Resident_DataManager().setVisible(true);
        this.dispose();
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

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

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
    private javax.swing.JPanel DataOutput;
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
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField genderField;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblID4;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel main;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel officials;
    private javax.swing.JPanel reports;
    private javax.swing.JTextField sexField;
    private javax.swing.JTextField statusField;
    private javax.swing.JTextField tellyField;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
