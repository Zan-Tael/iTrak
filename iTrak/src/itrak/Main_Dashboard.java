package itrak;

import java.awt.Color;

public class Main_Dashboard extends javax.swing.JFrame {

    public Main_Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel4.setBackground(new java.awt.Color(61, 178, 255));
        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1220, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 510, 330));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void DatabasePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseClicked
        // TODO add your handling code here:
        new Resident_DataManager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DatabasePageMouseClicked

    private void DatabasePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseEntered
        database.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_DatabasePageMouseEntered

    private void DatabasePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseExited
        database.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_DatabasePageMouseExited

    private void DocumentPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseClicked
        new Main_IDGenerator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DocumentPageMouseClicked

    private void DocumentPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseEntered
        documents.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_DocumentPageMouseEntered

    private void DocumentPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseExited
        documents.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_DocumentPageMouseExited

    private void ReportPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPageMouseClicked
        new Main_Reports().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReportPageMouseClicked

    private void ReportPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPageMouseEntered
        reports.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_ReportPageMouseEntered

    private void ReportPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportPageMouseExited
        reports.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_ReportPageMouseExited

    private void OfficialPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialPageMouseClicked
        new Officials_DataManager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OfficialPageMouseClicked

    private void OfficialPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialPageMouseEntered
        officials.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_OfficialPageMouseEntered

    private void OfficialPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialPageMouseExited
        officials.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_OfficialPageMouseExited

    private void AboutPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutPageMouseClicked

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
            java.util.logging.Logger.getLogger(Main_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Dashboard().setVisible(true);
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
    private javax.swing.JPanel database;
    private javax.swing.JPanel documents;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel main;
    private javax.swing.JPanel officials;
    private javax.swing.JPanel reports;
    // End of variables declaration//GEN-END:variables
}
