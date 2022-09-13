/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Kyrab
 */
public class EntryScreen extends javax.swing.JFrame {

    /**
     * Creates new form EntryScreen
     */
    public EntryScreen() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cloudLbl3 = new javax.swing.JLabel();
        cloudLbl1 = new javax.swing.JLabel();
        cloudLbl2 = new javax.swing.JLabel();
        cloudLbl = new javax.swing.JLabel();
        userProfileLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setText("Username");
        jPanel2.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, 30));

        passwordField.setText("passwrod");
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 180, 30));

        jButton1.setText("Sign Up");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 150, 30));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log In");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 150, 30));

        cloudLbl3.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2022\\src\\main\\resources\\clouds.png")); // NOI18N
        jPanel2.add(cloudLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, 210));

        cloudLbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2022\\src\\main\\resources\\clouds.png")); // NOI18N
        jPanel2.add(cloudLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 270, 230));

        cloudLbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clouds.png"))); // NOI18N
        jPanel2.add(cloudLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 260, 180));

        cloudLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clouds.png"))); // NOI18N
        jPanel2.add(cloudLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 260, 180));

        userProfileLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2022\\src\\main\\resources\\user (2).png")); // NOI18N
        jPanel2.add(userProfileLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 170, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EntryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cloudLbl;
    private javax.swing.JLabel cloudLbl1;
    private javax.swing.JLabel cloudLbl2;
    private javax.swing.JLabel cloudLbl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel userProfileLbl;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}