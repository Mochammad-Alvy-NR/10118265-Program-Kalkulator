/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moch Alvy Nur Ramadh
 */
public class Program_Kalkulator extends javax.swing.JFrame {
    String angka;
    double jumlah, bilangan1, bilangan2;
    int pilih;
    /**
     * Creates new form Program_Kalkulator
     */
    public Program_Kalkulator() {
        initComponents();
        angka = "";
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
        btnbagi = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        layar = new javax.swing.JTextField();
        btnsamadengan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btnangka0 = new javax.swing.JButton();
        btnangka1 = new javax.swing.JButton();
        btnangka2 = new javax.swing.JButton();
        btnangka3 = new javax.swing.JButton();
        btnangka4 = new javax.swing.JButton();
        btnangka5 = new javax.swing.JButton();
        btnangka6 = new javax.swing.JButton();
        btnangka7 = new javax.swing.JButton();
        btnangka8 = new javax.swing.JButton();
        btnangka9 = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("PROGRAM KALKULATOR");

        btnbagi.setText(":");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnkali.setText("x");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        layar.setEditable(false);
        layar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        layar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnsamadengan.setText("=");
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnangka0.setText("0");
        btnangka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka0ActionPerformed(evt);
            }
        });

        btnangka1.setText("1");
        btnangka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka1ActionPerformed(evt);
            }
        });

        btnangka2.setText("2");
        btnangka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka2ActionPerformed(evt);
            }
        });

        btnangka3.setText("3");
        btnangka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka3ActionPerformed(evt);
            }
        });

        btnangka4.setText("4");
        btnangka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka4ActionPerformed(evt);
            }
        });

        btnangka5.setText("5");
        btnangka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka5ActionPerformed(evt);
            }
        });

        btnangka6.setText("6");
        btnangka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka6ActionPerformed(evt);
            }
        });

        btnangka7.setText("7");
        btnangka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka7ActionPerformed(evt);
            }
        });

        btnangka8.setText("8");
        btnangka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka8ActionPerformed(evt);
            }
        });

        btnangka9.setText("9");
        btnangka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka9ActionPerformed(evt);
            }
        });

        btnkoma.setText(".");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });

        jLabel2.setText("Dibuat Oleh : Mochammad Alvy NR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(layar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnangka7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnangka8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnangka4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnangka5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnangka1)
                                                .addGap(27, 27, 27)
                                                .addComponent(btnangka2))
                                            .addComponent(btnangka0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnangka3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnangka6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnangka9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnkoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsamadengan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnkurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnbagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btntambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnkali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(layar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkali)
                    .addComponent(btnkeluar)
                    .addComponent(btnhapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbagi)
                    .addComponent(btnangka7)
                    .addComponent(btnangka8)
                    .addComponent(btnangka9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnangka4)
                    .addComponent(btnangka5)
                    .addComponent(btnangka6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkurang)
                    .addComponent(btnangka1)
                    .addComponent(btnangka2)
                    .addComponent(btnangka3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsamadengan)
                    .addComponent(btnangka0)
                    .addComponent(btnkoma))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText("*");
        angka="";
        pilih=4;
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
        // TODO add your handling code here:
        switch (pilih) {
            case 1:
                bilangan2 = Double.parseDouble(angka);
                jumlah = bilangan1 - bilangan2;
                angka = Double.toString(jumlah);
                layar.setText(angka);
                break;
            case 2:
                bilangan2 = Double.parseDouble(angka);
                jumlah = bilangan1 + bilangan2;
                angka = Double.toString(jumlah);
                layar.setText(angka);
                break;
            case 3:
                bilangan2 = Double.parseDouble(angka);
                jumlah = bilangan1 / bilangan2;
                angka = Double.toString(jumlah);
                layar.setText(angka);
                break;
            case 4:
                bilangan2 = Double.parseDouble(angka);
                jumlah = bilangan1 * bilangan2;
                angka = Double.toString(jumlah);
                layar.setText(angka);
                break;
                default:
                break;
        }
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void btnangka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka8ActionPerformed
        // TODO add your handling code here:
         angka += "8";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka8ActionPerformed

    private void btnangka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka0ActionPerformed
        // TODO add your handling code here:
        angka += "0";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka0ActionPerformed

    private void btnangka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka1ActionPerformed
        // TODO add your handling code here:
         angka += "1";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka1ActionPerformed

    private void btnangka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka2ActionPerformed
        // TODO add your handling code here:
         angka += "2";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka2ActionPerformed

    private void btnangka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka3ActionPerformed
        // TODO add your handling code here:
         angka += "3";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka3ActionPerformed

    private void btnangka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka4ActionPerformed
        // TODO add your handling code here:
         angka += "4";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka4ActionPerformed

    private void btnangka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka5ActionPerformed
        // TODO add your handling code here:
         angka += "5";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka5ActionPerformed

    private void btnangka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka6ActionPerformed
        // TODO add your handling code here:
         angka += "6";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka6ActionPerformed

    private void btnangka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka7ActionPerformed
        // TODO add your handling code here:
         angka += "7";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka7ActionPerformed
                          
    private void btnangka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka9ActionPerformed
        // TODO add your handling code here:
         angka += "9";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka9ActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
        // TODO add your handling code here:
         angka += ".";
        layar.setText(angka);
    }//GEN-LAST:event_btnkomaActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        layar.setText("");
        bilangan1   =0.0;
        bilangan2   =0.0;
        jumlah      =0.0;
        angka       ="";
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText(":");
        angka="";
        pilih=3;
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText("+");
        angka="";
        pilih=2;
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText("-");
        angka="";
        pilih=1;
    }//GEN-LAST:event_btnkurangActionPerformed

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
            java.util.logging.Logger.getLogger(Program_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program_Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program_Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnangka0;
    private javax.swing.JButton btnangka1;
    private javax.swing.JButton btnangka2;
    private javax.swing.JButton btnangka3;
    private javax.swing.JButton btnangka4;
    private javax.swing.JButton btnangka5;
    private javax.swing.JButton btnangka6;
    private javax.swing.JButton btnangka7;
    private javax.swing.JButton btnangka8;
    private javax.swing.JButton btnangka9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnsamadengan;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField layar;
    // End of variables declaration//GEN-END:variables
}
