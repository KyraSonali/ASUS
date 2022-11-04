/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BACKEND.UserManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class StatScreen extends javax.swing.JFrame {

    private UserManager m;
    private int currentUserId;

    public StatScreen(UserManager inManager) {
        m = inManager;
        currentUserId = m.getCurrentUser();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gebBttn = new javax.swing.JPanel();
        janBttn = new javax.swing.JButton();
        octBttn = new javax.swing.JButton();
        decBttn = new javax.swing.JButton();
        mayBttn = new javax.swing.JButton();
        marchBttn = new javax.swing.JButton();
        aprilBttn = new javax.swing.JButton();
        juneBttn = new javax.swing.JButton();
        julyBttn = new javax.swing.JButton();
        augBttn = new javax.swing.JButton();
        septBttn = new javax.swing.JButton();
        febBttn = new javax.swing.JButton();
        novBttn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        viewExBttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewDietBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DietTxtArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExerciseTxtArea = new javax.swing.JTextArea();
        homeBttn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gebBttn.setBackground(new java.awt.Color(204, 204, 255));
        gebBttn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        janBttn.setText("Jan");
        janBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                janBttnActionPerformed(evt);
            }
        });
        gebBttn.add(janBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 20));

        octBttn.setText("October");
        octBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octBttnActionPerformed(evt);
            }
        });
        gebBttn.add(octBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 20));

        decBttn.setText("December");
        decBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decBttnActionPerformed(evt);
            }
        });
        gebBttn.add(decBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 130, 20));

        mayBttn.setText("May");
        mayBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayBttnActionPerformed(evt);
            }
        });
        gebBttn.add(mayBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 20));

        marchBttn.setText("March");
        marchBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marchBttnActionPerformed(evt);
            }
        });
        gebBttn.add(marchBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 20));

        aprilBttn.setText("April");
        aprilBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprilBttnActionPerformed(evt);
            }
        });
        gebBttn.add(aprilBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 20));

        juneBttn.setText("June");
        juneBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juneBttnActionPerformed(evt);
            }
        });
        gebBttn.add(juneBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 20));

        julyBttn.setText("July'");
        julyBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                julyBttnActionPerformed(evt);
            }
        });
        gebBttn.add(julyBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 20));

        augBttn.setText("August");
        augBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                augBttnActionPerformed(evt);
            }
        });
        gebBttn.add(augBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 20));

        septBttn.setText("September");
        septBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septBttnActionPerformed(evt);
            }
        });
        gebBttn.add(septBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 20));

        febBttn.setText("Feb");
        febBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                febBttnActionPerformed(evt);
            }
        });
        gebBttn.add(febBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 20));

        novBttn.setText("November");
        novBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novBttnActionPerformed(evt);
            }
        });
        gebBttn.add(novBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, 20));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewExBttn.setText("View");
        viewExBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewExBttnActionPerformed(evt);
            }
        });
        jPanel1.add(viewExBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, 20));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stats of Your Diet:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 187, 36));

        viewDietBttn.setText("View");
        viewDietBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDietBttnActionPerformed(evt);
            }
        });
        jPanel1.add(viewDietBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 230, 20));

        DietTxtArea.setColumns(20);
        DietTxtArea.setRows(5);
        jScrollPane1.setViewportView(DietTxtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 230, 100));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stats of Your Exercise:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 187, 36));

        ExerciseTxtArea.setColumns(20);
        ExerciseTxtArea.setRows(5);
        jScrollPane2.setViewportView(ExerciseTxtArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, 100));

        homeBttn.setText("Home");
        homeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBttnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 70, -1));

        gebBttn.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 280, 440));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("Stats of this Year:");
        gebBttn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 187, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gebBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gebBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void octBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octBttnActionPerformed

        m.genfunction(currentUserId, 10);

    }//GEN-LAST:event_octBttnActionPerformed

    private void juneBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juneBttnActionPerformed
        m.genfunction(currentUserId, 6);
    }//GEN-LAST:event_juneBttnActionPerformed

    private void homeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBttnActionPerformed
        dispose();
        new HomeScreen(m).setVisible(true);
    }//GEN-LAST:event_homeBttnActionPerformed

    private void janBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_janBttnActionPerformed
        m.genfunction(currentUserId, 1);


    }//GEN-LAST:event_janBttnActionPerformed

    private void febBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_febBttnActionPerformed
        m.genfunction(currentUserId, 2);
    }//GEN-LAST:event_febBttnActionPerformed

    private void marchBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marchBttnActionPerformed
        m.genfunction(currentUserId, 3);
    }//GEN-LAST:event_marchBttnActionPerformed

    private void aprilBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprilBttnActionPerformed
      m.genfunction(currentUserId, 4);
    }//GEN-LAST:event_aprilBttnActionPerformed

    private void mayBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayBttnActionPerformed
        m.genfunction(currentUserId, 5);
    }//GEN-LAST:event_mayBttnActionPerformed

    private void julyBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_julyBttnActionPerformed
        m.genfunction(currentUserId, 7);
    }//GEN-LAST:event_julyBttnActionPerformed

    private void augBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_augBttnActionPerformed
       m.genfunction(currentUserId, 8);
    }//GEN-LAST:event_augBttnActionPerformed

    private void septBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septBttnActionPerformed
       m.genfunction(currentUserId, 9);
    }//GEN-LAST:event_septBttnActionPerformed

    private void novBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novBttnActionPerformed
        m.genfunction(currentUserId, 11);
    }//GEN-LAST:event_novBttnActionPerformed

    private void decBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decBttnActionPerformed
       m.genfunction(currentUserId, 12);
    }//GEN-LAST:event_decBttnActionPerformed

    private void viewExBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewExBttnActionPerformed
            try {
            int num= m.getAmountExercise(currentUserId);
            ExerciseTxtArea.setText(m.getName()+ " you have exercised "+num+" out of 365 days this year");
        } catch (SQLException ex) {
            Logger.getLogger(StatScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewExBttnActionPerformed

    private void viewDietBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDietBttnActionPerformed
         try {
            double avg= m.getAvgDiet(currentUserId);
            if(avg<50){
                 DietTxtArea.setText(m.getName()+" you have eaten irregulary this year"+"\n"+ "Your total regularity was:"+ avg);
            }else{
                DietTxtArea.setText(m.getName()+" you have eaten quite regulary this year"+"\n"+ "Your total regularity was:"+ avg);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StatScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewDietBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DietTxtArea;
    private javax.swing.JTextArea ExerciseTxtArea;
    private javax.swing.JButton aprilBttn;
    private javax.swing.JButton augBttn;
    private javax.swing.JButton decBttn;
    private javax.swing.JButton febBttn;
    private javax.swing.JPanel gebBttn;
    private javax.swing.JButton homeBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton janBttn;
    private javax.swing.JButton julyBttn;
    private javax.swing.JButton juneBttn;
    private javax.swing.JButton marchBttn;
    private javax.swing.JButton mayBttn;
    private javax.swing.JButton novBttn;
    private javax.swing.JButton octBttn;
    private javax.swing.JButton septBttn;
    private javax.swing.JButton viewDietBttn;
    private javax.swing.JButton viewExBttn;
    // End of variables declaration//GEN-END:variables
}
