/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userpages;


import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import myapp.*;



/**
 *
 * @author edgar
 */
public class settingpage extends javax.swing.JInternalFrame {

    /**
     * Creates new form settingpage
     */
    public settingpage() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    Color navcolor = new Color(255,204,255);
   Color headcolor = new Color(255,102,102);
   Color bodycolor = new Color(255,153,153);


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        manageuser = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(160, 160));
        jPanel3.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("USERNAME HERE");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpages/icons8-user-100 (1).png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 140, 140));

        jLabel2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel2.setText("USER ADDRESS: HERE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, -1));

        jLabel10.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel10.setText("POSITION: ADMINISTRATOR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/c10fb808680f861f4d8402bc76b25c64.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 420));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(255, 204, 204));
        logout.setPreferredSize(new java.awt.Dimension(160, 160));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOGOUT");
        logout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpages/icons8-logout-100.png"))); // NOI18N
        logout.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, -1));

        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 140, 130));

        manageuser.setBackground(new java.awt.Color(255, 204, 204));
        manageuser.setPreferredSize(new java.awt.Dimension(160, 160));
        manageuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageuserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageuserMouseExited(evt);
            }
        });
        manageuser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MANAGE USER");
        manageuser.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpages/icons8-user-100.png"))); // NOI18N
        manageuser.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        jPanel2.add(manageuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, 130));

        reports.setBackground(new java.awt.Color(255, 204, 204));
        reports.setMinimumSize(new java.awt.Dimension(160, 160));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REPORTS");
        reports.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpages/icons8-graph-report-100.png"))); // NOI18N
        reports.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 140, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userpages/pinkn (1).jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 340));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 840, 360));

        setBounds(0, 0, 854, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(bodycolor);
    }//GEN-LAST:event_reportsMouseExited

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        reports.setBackground(navcolor);
    }//GEN-LAST:event_reportsMouseEntered

    private void manageuserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseExited
        manageuser.setBackground(bodycolor);
    }//GEN-LAST:event_manageuserMouseExited

    private void manageuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageuserMouseEntered
        manageuser.setBackground(navcolor);
    }//GEN-LAST:event_manageuserMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(bodycolor);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(navcolor);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        JFrame mainFrame =(JFrame)SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        Login up = new Login();
        up.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel manageuser;
    private javax.swing.JPanel reports;
    // End of variables declaration//GEN-END:variables
}
