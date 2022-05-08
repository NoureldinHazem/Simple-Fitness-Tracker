/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activities;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Nour
 */
public class Fitness_Tracker2 extends javax.swing.JFrame {

    /**
     * Creates new form Fitness_Tracker2
     */
    public Fitness_Tracker2() {
        initComponents();
        TCalories.setText("" + Fitness.Total_Calories_Burnt);
        THeart.setText("" + Fitness.Final_Heart_Rate);
        
            float [][]rank = new float [4][3];
      
      rank[0][0]=1;
      rank[1][0]=2;
      rank[2][0]=3;
      rank[3][0]=4;
      
      rank[0][1]=Fitness_Tracker1.Swimming_Calories;
      rank[0][2]=Fitness_Tracker1.Swimming_Heart;
      
      rank[1][1]=Fitness_Tracker1.Running_Calories;
      rank[1][2]=Fitness_Tracker1.Running_Heart;
      
      rank[2][1]=Fitness_Tracker1.Boxing_Calories;
      rank[2][2]= Fitness_Tracker1.Boxing_Heart;
      
      rank[3][1]=Fitness_Tracker1.Strength_Calories;
      rank[3][2]= Fitness_Tracker1.Strength_Heart;
       
        int col = 2; 
        sortbyCalories(rank, col - 1); 
        if (rank[0][0]==1.0){
            First.setText("Swimming");
            FirstC.setText(" " + Fitness_Tracker1.Swimming_Calories);
            FirstH.setText("" + Fitness_Tracker1.Swimming_Heart);
        }else if (rank[0][0]==2.0){
            First.setText("Running");
            FirstC.setText(" " + Fitness_Tracker1.Running_Calories);
            FirstH.setText("" + Fitness_Tracker1.Running_Heart);
        }else if (rank[0][0]==3.0){
            First.setText("Kick Boxing");
            FirstC.setText(" " + Fitness_Tracker1.Boxing_Calories);
            FirstH.setText("" + Fitness_Tracker1.Boxing_Heart);
        }else if (rank[0][0]==4.0){
            First.setText("Strength Training");
            FirstC.setText(" " + Fitness_Tracker1.Strength_Calories);
            FirstH.setText("" + Fitness_Tracker1.Strength_Heart);
        }
 
        if (rank[1][0]==1.0){
            Second.setText("Swimming");
            SecondC.setText(" " + Fitness_Tracker1.Swimming_Calories);
            SecondH.setText("" + Fitness_Tracker1.Swimming_Heart);   
        }else if (rank[1][0]==2.0){
            Second.setText("Running");
            SecondC.setText(" " + Fitness_Tracker1.Running_Calories);
            SecondH.setText("" + Fitness_Tracker1.Running_Heart);
        }else if (rank[1][0]==3.0){
            Second.setText("Kick Boxing");
            SecondC.setText(" " + Fitness_Tracker1.Boxing_Calories);
            SecondH.setText("" + Fitness_Tracker1.Boxing_Heart);
        }else if (rank[1][0]==4.0){
            Second.setText("Strength Training");
            SecondC.setText(" " + Fitness_Tracker1.Strength_Calories);
            SecondH.setText("" + Fitness_Tracker1.Strength_Heart);
        }
        
        if (rank[2][0]==1.0){
            Third.setText("Swimming");
            ThirdC.setText(" " + Fitness_Tracker1.Swimming_Calories);
            ThirdH.setText("" + Fitness_Tracker1.Swimming_Heart);   
        }else if (rank[2][0]==2.0){
            Third.setText("Running");
            ThirdC.setText(" " + Fitness_Tracker1.Running_Calories);
            ThirdH.setText("" + Fitness_Tracker1.Running_Heart);
        }else if (rank[2][0]==3.0){
            Third.setText("Kick Boxing");
            ThirdC.setText(" " + Fitness_Tracker1.Boxing_Calories);
            ThirdH.setText("" + Fitness_Tracker1.Boxing_Heart);
        }else if (rank[2][0]==4.0){
            Third.setText("Strength Training");
            ThirdC.setText(" " + Fitness_Tracker1.Strength_Calories);
            ThirdH.setText("" + Fitness_Tracker1.Strength_Heart);
        }
       
        
        if (rank[3][0]==1.0){
            Fourth.setText("Swimming");
            FourthC.setText(" " + Fitness_Tracker1.Swimming_Calories);
            FourthH.setText("" + Fitness_Tracker1.Swimming_Heart);   
        }else if (rank[3][0]==2.0){
            Fourth.setText("Running");
            FourthC.setText(" " + Fitness_Tracker1.Running_Calories);
            FourthH.setText("" + Fitness_Tracker1.Running_Heart);
        }else if (rank[3][0]==3.0){
            Fourth.setText("Kick Boxing");
            FourthC.setText(" " + Fitness_Tracker1.Boxing_Calories);
            FourthH.setText("" + Fitness_Tracker1.Boxing_Heart);
        }else if (rank[3][0]==4.0){
            Fourth.setText("Strength Training");
            FourthC.setText(" " + Fitness_Tracker1.Strength_Calories);
            FourthH.setText("" + Fitness_Tracker1.Strength_Heart);
        }
    }
      public static void sortbyCalories(float arr[][], int col) 
    {
        Arrays.sort(arr, new Comparator<float[]>() { 
            
         
          public int compare(final float[] entry1,  
                             final float[] entry2) { 
  
            if (entry1[col] < entry2[col]) 
                return 1; 
            else if (entry1[col] == entry2[col] && entry1[col+1]<entry2[col+1])
                return 1;
            else 
                return -1;
          } 
        });  
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        THeart = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TCalories = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        First = new javax.swing.JTextField();
        FirstC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FirstH = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Second = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SecondC = new javax.swing.JTextField();
        SecondH = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Third = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ThirdC = new javax.swing.JTextField();
        ThirdH = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Fourth = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        FourthC = new javax.swing.JTextField();
        FourthH = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel1.setText("   Results");

        jLabel2.setText(" Total Calories Burnt :");

        jLabel3.setText(" Total Heart Rate : ");

        jLabel4.setText("Calories");

        jLabel5.setText(" beat/minute.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("    Great Job For Today ");

        jLabel7.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel7.setText("Activity Ranking ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText(" 1.");

        jLabel9.setText(" Calories Burnt :");

        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });

        jLabel10.setText("Heart Rate Increase:");

        jLabel11.setText("Calories");

        jLabel12.setText("beat/minute");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText(" 2.");

        jLabel14.setText(" Calories Burnt :");

        jLabel15.setText("Heart Rate Increase:");

        SecondC.setText(" ");

        jLabel16.setText("Calories");

        jLabel17.setText("beat/minute");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText(" 3.");

        jLabel19.setText(" Calories Burnt :");

        jLabel20.setText("Heart Rate Increase:");

        jLabel21.setText("Calories");

        jLabel22.setText("beat/minute");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText(" 4.");

        jLabel24.setText(" Calories Burnt :");

        jLabel25.setText("Heart Rate Increase: ");

        FourthC.setText(" ");
        FourthC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthCActionPerformed(evt);
            }
        });

        FourthH.setText(" ");

        jLabel26.setText("Calories");

        jLabel27.setText("beat/minute");

        jButton1.setText("Add Another Activity");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(321, 321, 321)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TCalories, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(THeart, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Second, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(FirstH, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                        .addComponent(FirstC)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel14))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(SecondC, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                                        .addComponent(SecondH))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel16)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(First, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel7)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Third, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel24))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FourthC)
                                            .addComponent(FourthH, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel26)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ThirdC, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                            .addComponent(ThirdH))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel21)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(74, 74, 74))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jButton2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TCalories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(THeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)))
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(FirstC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FirstH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel20)
                                .addComponent(ThirdH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(First, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(Third, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(ThirdC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Fourth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SecondC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(FourthC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SecondH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel25)
                        .addComponent(FourthH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FourthCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FourthCActionPerformed

    private void FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Fitness_Tracker1 form = new Fitness_Tracker1();
    form.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Fitness_Tracker2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fitness_Tracker2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fitness_Tracker2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fitness_Tracker2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fitness_Tracker2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField First;
    private javax.swing.JTextField FirstC;
    private javax.swing.JTextField FirstH;
    private javax.swing.JTextField Fourth;
    private javax.swing.JTextField FourthC;
    private javax.swing.JTextField FourthH;
    private javax.swing.JTextField Second;
    private javax.swing.JTextField SecondC;
    private javax.swing.JTextField SecondH;
    private javax.swing.JTextField TCalories;
    private javax.swing.JTextField THeart;
    private javax.swing.JTextField Third;
    private javax.swing.JTextField ThirdC;
    private javax.swing.JTextField ThirdH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
