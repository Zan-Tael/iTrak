/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itrak;

/**
 *
 * @author ZAEL
 */
public class Officials_Insert extends javax.swing.JFrame {

    /**
     * Creates new form Officials_Insert
     */
    public Officials_Insert() {
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

        main = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        homePage = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        databasePage = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        documentPage = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        documentLabel = new javax.swing.JLabel();
        reportsPage = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        reportLabel = new javax.swing.JLabel();
        officialsPage = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        officialLabel = new javax.swing.JLabel();
        aboutUs = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        aboutUsLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBar.setBackground(new java.awt.Color(51, 51, 51));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Menu");
        SideBar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        homePage.setBackground(new java.awt.Color(51, 51, 51));
        homePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        homePage.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        homeLabel.setBackground(new java.awt.Color(204, 204, 204));
        homeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(153, 153, 153));
        homeLabel.setText("Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
        });
        homePage.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        SideBar.add(homePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 50));

        databasePage.setBackground(new java.awt.Color(102, 102, 102));
        databasePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        databasePage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Database");
        databasePage.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        SideBar.add(databasePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 50));

        documentPage.setBackground(new java.awt.Color(51, 51, 51));
        documentPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        documentPage.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        documentLabel.setBackground(new java.awt.Color(204, 204, 204));
        documentLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        documentLabel.setForeground(new java.awt.Color(153, 153, 153));
        documentLabel.setText("Documents");
        documentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                documentLabelMouseClicked(evt);
            }
        });
        documentPage.add(documentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        SideBar.add(documentPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 50));

        reportsPage.setBackground(new java.awt.Color(51, 51, 51));
        reportsPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        reportsPage.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        reportLabel.setBackground(new java.awt.Color(204, 204, 204));
        reportLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(153, 153, 153));
        reportLabel.setText("Reports");
        reportLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportLabelMouseClicked(evt);
            }
        });
        reportsPage.add(reportLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        SideBar.add(reportsPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 50));

        officialsPage.setBackground(new java.awt.Color(51, 51, 51));
        officialsPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        officialsPage.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        officialLabel.setBackground(new java.awt.Color(204, 204, 204));
        officialLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        officialLabel.setForeground(new java.awt.Color(153, 153, 153));
        officialLabel.setText("Officials");
        officialLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                officialLabelMouseClicked(evt);
            }
        });
        officialsPage.add(officialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        SideBar.add(officialsPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        aboutUs.setBackground(new java.awt.Color(51, 51, 51));
        aboutUs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/database_100.png"))); // NOI18N
        aboutUs.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        aboutUsLabel.setBackground(new java.awt.Color(204, 204, 204));
        aboutUsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aboutUsLabel.setForeground(new java.awt.Color(153, 153, 153));
        aboutUsLabel.setText("About Us");
        aboutUsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUsLabelMouseClicked(evt);
            }
        });
        aboutUs.add(aboutUsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        SideBar.add(aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 210, 50));

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
    }// </editor-fold>//GEN-END:initComponents

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        new Main_Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeLabelMouseClicked

    private void documentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documentLabelMouseClicked
        new Main_IDGenerator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_documentLabelMouseClicked

    private void reportLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportLabelMouseClicked
        new Main_Reports().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportLabelMouseClicked

    private void officialLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_officialLabelMouseClicked
        new Officials_DataManager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_officialLabelMouseClicked

    private void aboutUsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutUsLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Officials_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Officials_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Officials_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Officials_Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Officials_Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel aboutUs;
    private javax.swing.JLabel aboutUsLabel;
    private javax.swing.JPanel databasePage;
    private javax.swing.JLabel documentLabel;
    private javax.swing.JPanel documentPage;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel main;
    private javax.swing.JLabel officialLabel;
    private javax.swing.JPanel officialsPage;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JPanel reportsPage;
    // End of variables declaration//GEN-END:variables
}
