/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_version_1;

import java.text.NumberFormat;
import javax.swing.*;

/**
 *
 * @author Null
 */
public class JFrameProject extends javax.swing.JFrame {

    /**
     * Creates new form JFrameProject
     *
     * @param bricksNeeded
     * @param cementNeeded
     * @param brickCost
     * @param cementCost
     */

    public JFrameProject(int bricksNeeded, int cementNeeded, float brickCost, float cementCost) 
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel11 = new JLabel();
        jLabel10 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel19 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel24 = new JLabel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(fmt.format(cementCost));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 330, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DEC 12, 2019");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 130, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DEC 15, 2019");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 200, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("arch cost");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 350, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("STATE TAX (0.7%)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 470, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Amount Of Bricks: " + Integer.toString(bricksNeeded) + " Bricks");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 310, 510, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Amount Of Mortar: " + Integer.toString(cementNeeded) + " Cubic Feet");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 330, 500, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Time & Labor");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 370, 510, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Arch Design Cost");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 350, 520, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText(fmt.format(brickCost));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(780, 310, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("BRICKS");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 310, 90, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("MORTAR");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 330, 90, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("ARCH DESIGN");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 350, 90, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("LABOR");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 370, 90, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText(fmt.format(3084));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(780, 370, 90, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("state tax");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(780, 470, 90, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Total Cost");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(780, 560, 90, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("subtotal");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(780, 440, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mr. Teter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 200, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Null\\Desktop\\JavaSchoolBuilderInvoice.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 710);

        pack();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mortar cost");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 330, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DEC 12, 2019");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 130, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DEC 15, 2019");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 200, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("arch cost");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 350, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("STATE TAX (0.7%)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 470, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Amount Of Bricks");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 310, 510, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Amount Of Mortar");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 330, 500, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Time & Labor");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 370, 510, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Arch Design Cost");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 350, 520, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText(Double.toString(3));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(780, 310, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("BRICKS");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 310, 90, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("MORTAR");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 330, 90, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("ARCH DESIGN");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 350, 90, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("LABOR");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 370, 90, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("labor cost");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(780, 370, 90, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("state tax");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(780, 470, 90, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Total Cost");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(780, 560, 90, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("subtotal");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(780, 440, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mr. Teter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 200, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Null\\Desktop\\JavaSchoolBuilderInvoice.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param bricksNeeded
     * @param cementNeeded
     * @param brickCost
     * @param cementCost
     * @return 
     */
    public static JFrame main(int bricksNeeded, int cementNeeded, float brickCost, float cementCost) {
        JFrameProject jFrameProject = new JFrameProject(bricksNeeded, cementNeeded, brickCost, cementCost);
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
            java.util.logging.Logger.getLogger(JFrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                JFrameProject jFrameProject1 = new JFrameProject(bricksNeeded, cementNeeded, brickCost, cementCost);
            }
        });
        return jFrameProject;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
