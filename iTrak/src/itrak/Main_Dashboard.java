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
        jLabel5 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        HomePage = new javax.swing.JLabel();
        database = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        DatabasePage = new javax.swing.JLabel();
        documents = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        DocumentPage = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ReportsPage = new javax.swing.JLabel();
        officials = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        OfficialsPage = new javax.swing.JLabel();
        aboutus = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        AboutPage = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        LogoutPage = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        HomePage.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        documents.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        reports.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        ReportsPage.setBackground(new java.awt.Color(204, 204, 204));
        ReportsPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReportsPage.setForeground(new java.awt.Color(255, 255, 255));
        ReportsPage.setText("Reports");
        ReportsPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportsPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsPageMouseExited(evt);
            }
        });
        reports.add(ReportsPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 50));

        officials.setBackground(new java.awt.Color(51, 51, 51));
        officials.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        officials.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        OfficialsPage.setBackground(new java.awt.Color(204, 204, 204));
        OfficialsPage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OfficialsPage.setForeground(new java.awt.Color(255, 255, 255));
        OfficialsPage.setText("Officials");
        OfficialsPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OfficialsPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OfficialsPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OfficialsPageMouseExited(evt);
            }
        });
        officials.add(OfficialsPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        SideBar.add(officials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        aboutus.setBackground(new java.awt.Color(51, 51, 51));
        aboutus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        aboutus.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        logout.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

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

        jPanel4.setBackground(new java.awt.Color(61, 178, 255));
        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

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

    private void DatabasePageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseEntered
        database.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_DatabasePageMouseEntered

    private void DatabasePageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseExited
        database.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_DatabasePageMouseExited

    private void DatabasePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DatabasePageMouseClicked

    private void DocumentPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentPageMouseClicked

    private void DocumentPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseEntered
        documents.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_DocumentPageMouseEntered

    private void DocumentPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocumentPageMouseExited
        documents.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_DocumentPageMouseExited

    private void ReportsPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsPageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportsPageMouseClicked

    private void ReportsPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsPageMouseEntered
        reports.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_ReportsPageMouseEntered

    private void ReportsPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsPageMouseExited
        reports.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_ReportsPageMouseExited

    private void AboutPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutPageMouseClicked

    private void AboutPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPageMouseEntered
        aboutus.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_AboutPageMouseEntered

    private void AboutPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutPageMouseExited
        aboutus.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_AboutPageMouseExited

    private void OfficialsPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialsPageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OfficialsPageMouseClicked

    private void OfficialsPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialsPageMouseEntered
        officials.setBackground(new Color(61,178,255));
    }//GEN-LAST:event_OfficialsPageMouseEntered

    private void OfficialsPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficialsPageMouseExited
        officials.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_OfficialsPageMouseExited

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
    private javax.swing.JLabel OfficialsPage;
    private javax.swing.JLabel ReportsPage;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel aboutus;
    private javax.swing.JPanel database;
    private javax.swing.JPanel documents;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel main;
    private javax.swing.JPanel officials;
    private javax.swing.JPanel reports;
    // End of variables declaration//GEN-END:variables
}
