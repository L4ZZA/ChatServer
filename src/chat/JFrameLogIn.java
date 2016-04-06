package chat;

import javax.swing.JOptionPane;

/**
 *
 * @author Arena, programmazione - Lazzarotto, programmazione - Solito, grafica
 */
public class JFrameLogIn extends javax.swing.JFrame {
    
    private String nomeUtente;
    private String porta;

    public JFrameLogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPorta1 = new javax.swing.JLabel();
        jPanelLogIn = new javax.swing.JPanel();
        jLabelLogIn = new javax.swing.JLabel();
        jTextNomeUtente = new javax.swing.JTextField();
        jLabelNomeUtente = new javax.swing.JLabel();
        jLabelPorta = new javax.swing.JLabel();
        jTextPorta = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();
        hint = new javax.swing.JLabel();

        jLabelPorta1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPorta1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPorta1.setText("Port:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelLogIn.setBackground(new java.awt.Color(0, 0, 153));

        jLabelLogIn.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabelLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogIn.setText("Login");

        jLabelNomeUtente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeUtente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeUtente.setText("Username");

        jLabelPorta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPorta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPorta.setText("Port:");

        jButtonOK.setBackground(new java.awt.Color(0, 51, 204));
        jButtonOK.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonAnnulla.setBackground(new java.awt.Color(0, 51, 204));
        jButtonAnnulla.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        hint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hint.setForeground(new java.awt.Color(255, 255, 255));
        hint.setText("(same for the client)");

        javax.swing.GroupLayout jPanelLogInLayout = new javax.swing.GroupLayout(jPanelLogIn);
        jPanelLogIn.setLayout(jPanelLogInLayout);
        jPanelLogInLayout.setHorizontalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogInLayout.createSequentialGroup()
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLogInLayout.createSequentialGroup()
                        .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLogInLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelNomeUtente))
                            .addGroup(jPanelLogInLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabelPorta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLogInLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hint)
                            .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogInLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelLogIn)
                .addGap(141, 141, 141))
        );
        jPanelLogInLayout.setVerticalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogIn)
                .addGap(46, 46, 46)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNomeUtente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeUtente))
                .addGap(41, 41, 41)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPorta)
                    .addComponent(jTextPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonOK))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        jTextNomeUtente.setText(null);
        jTextPorta.setText(null);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        nomeUtente = jTextNomeUtente.getText();
        porta = jTextPorta.getText();
        int iPorta;
        if(nomeUtente.equals("") || porta.equals("")){
            JOptionPane.showMessageDialog(null, "Errore! Dati non sufficienti!");
        }
        else{
            iPorta = Integer.parseInt(porta);
            this.dispose();
            JFrameChat frameChat = new JFrameChat(nomeUtente, iPorta);
            frameChat.setVisible(true);
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hint;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabelLogIn;
    private javax.swing.JLabel jLabelNomeUtente;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelPorta1;
    private javax.swing.JPanel jPanelLogIn;
    private javax.swing.JTextField jTextNomeUtente;
    private javax.swing.JTextField jTextPorta;
    // End of variables declaration//GEN-END:variables
}
