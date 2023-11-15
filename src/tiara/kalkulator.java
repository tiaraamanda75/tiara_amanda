
package tiara;


public class kalkulator extends javax.swing.JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilih;

    
    public kalkulator() {
        initComponents();
        angka = "";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tampil = new javax.swing.JTextField();
        btnangka7 = new javax.swing.JButton();
        no8 = new javax.swing.JButton();
        btnangka9 = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        btnsisabagi = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btnangka4 = new javax.swing.JButton();
        btnangka5 = new javax.swing.JButton();
        btnangka6 = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btnangka1 = new javax.swing.JButton();
        btnangka2 = new javax.swing.JButton();
        btnangka3 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnangka0 = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        btnsamadengan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tampil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tampil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnangka7.setText("7");
        btnangka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka7ActionPerformed(evt);
            }
        });

        no8.setText("8");
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });

        btnangka9.setText("9");
        btnangka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka9ActionPerformed(evt);
            }
        });

        btnkali.setText("x");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        hapus.setText("c");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        btnsisabagi.setText("%");
        btnsisabagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsisabagiActionPerformed(evt);
            }
        });

        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
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

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
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

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnangka0.setText("0");
        btnangka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka0ActionPerformed(evt);
            }
        });

        btnkoma.setText(",");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });

        btnsamadengan.setText("=");
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tampil)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(hapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnangka7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsisabagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnangka9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnangka4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnangka5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnangka6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnangka0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnangka1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnangka2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnangka3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnkoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsisabagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnangka7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnangka9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnangka4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnangka5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnangka6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnangka1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnangka2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnangka3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnangka0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnangka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka7ActionPerformed
        angka += "7";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka7ActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        tampil.setText (angka);
        angka1 = 0.0;
        angka2 = 0.0;
        jumlah = 0.0;
        angka = "";
    }//GEN-LAST:event_hapusActionPerformed

    private void btnsisabagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsisabagiActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("%");
        angka = "";
        pilih=5;        
    }//GEN-LAST:event_btnsisabagiActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("/");
        angka = "";
        pilih=4;
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnangka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka4ActionPerformed
        angka += "4";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka4ActionPerformed

    private void btnangka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka5ActionPerformed
        angka += "5";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka5ActionPerformed

    private void btnangka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka6ActionPerformed
        angka += "6";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka6ActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("-");
        angka = "";
        pilih=2;
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnangka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka1ActionPerformed
        angka += "1";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka1ActionPerformed

    private void btnangka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka2ActionPerformed
        angka += "2";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka2ActionPerformed

    private void btnangka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka3ActionPerformed
        angka += "3";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka3ActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("+");
        angka = "";
        pilih=1;
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnangka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka0ActionPerformed
        angka += "0";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka0ActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
        angka += ".";
        tampil.setText (angka);
    }//GEN-LAST:event_btnkomaActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
        switch(pilih){
            case 1:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1+angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 2:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1-angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 3:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1*angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 4:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1/angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no8ActionPerformed
        angka += "8";
        tampil.setText (angka);
    }//GEN-LAST:event_no8ActionPerformed

    private void btnangka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka9ActionPerformed
        angka += "9";
        tampil.setText (angka);
    }//GEN-LAST:event_btnangka9ActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("*");
        angka = "";
        pilih=3;
    }//GEN-LAST:event_btnkaliActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
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
    private javax.swing.JButton btnangka9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnsamadengan;
    private javax.swing.JButton btnsisabagi;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton hapus;
    private javax.swing.JButton no8;
    private javax.swing.JTextField tampil;
    // End of variables declaration//GEN-END:variables
}
