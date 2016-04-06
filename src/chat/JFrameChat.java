package chat;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Arena, programmazione - Lazzarotto, programmazione - Solito, grafica
 */
public class JFrameChat extends javax.swing.JFrame {
    
    private String nomeUtente;
    private String nomeOspite;
    private int porta;
    MioServer mioServer;
    JLabel labels[];
    
    final int DIM = 12;

    public JFrameChat(String nomeUtente, int porta) {
        initComponents();
        this.nomeUtente = nomeUtente;
        this.porta = porta;
        
        mioServer = new MioServer(this, porta, nomeUtente);
        mioServer.avvia();
        
        labels = new JLabel[DIM];
        
        for(int i=0; i<DIM; i++){
            labels[i] = new JLabel("");
            labels[i].setBounds(30, (((i+1)*30 + 30)), 600, 30);
            
            jPanelChat.add(labels[i]);
        }
        try {
            jLabel2.setText("IP: "+Inet4Address.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(JFrameChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChat = new javax.swing.JPanel();
        jLabelArezzaChat = new javax.swing.JLabel();
        jTextInput = new javax.swing.JTextField();
        jButtonInvia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelChat.setBackground(new java.awt.Color(0, 0, 153));

        jLabelArezzaChat.setFont(new java.awt.Font("Traditional Arabic", 3, 36)); // NOI18N
        jLabelArezzaChat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelArezzaChat.setText("#QuintaChat");

        jTextInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextInputKeyTyped(evt);
            }
        });

        jButtonInvia.setBackground(new java.awt.Color(0, 51, 204));
        jButtonInvia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInvia.setText("INVIA");
        jButtonInvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInviaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanelChatLayout = new javax.swing.GroupLayout(jPanelChat);
        jPanelChat.setLayout(jPanelChatLayout);
        jPanelChatLayout.setHorizontalGroup(
            jPanelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChatLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jTextInput, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInvia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanelChatLayout.createSequentialGroup()
                .addGroup(jPanelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChatLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabelArezzaChat, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelChatLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelChatLayout.setVerticalGroup(
            jPanelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelArezzaChat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addGroup(jPanelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonInvia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInviaActionPerformed
        boolean r = mioServer.scrivi(jTextInput.getText());
        
        if(r){
            for(int i=0; i<DIM-1; i++){
                labels[i].setForeground(Color.white);
                labels[i].setText(labels[i+1].getText());
            }
            
            labels[DIM-1].setForeground(Color.white);
            labels[DIM-1].setText(nomeUtente +": " + jTextInput.getText());
        
            jTextInput.setText("");
        }
        
        
    }//GEN-LAST:event_jButtonInviaActionPerformed

    private void jTextInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextInputKeyTyped
        if(evt.getKeyChar() == 10){ //INVIO
            boolean r = mioServer.scrivi(jTextInput.getText());
            
            if(r){
        
                for(int i=0; i<DIM-1; i++){
                    labels[i].setText(labels[i+1].getText());
                }
        
                labels[DIM-1].setText(nomeUtente + ": " + jTextInput.getText());
        
                jTextInput.setText("");
            }
        }
    }//GEN-LAST:event_jTextInputKeyTyped

    /**
     * @param args the command line arguments
     */
    
    void setNomeOspite(String nomeOspite){
        this.nomeOspite = nomeOspite;
    }
    
    public void visualizza(String msg){
        for(int i=0; i<DIM-1; i++){
            labels[i].setForeground(Color.white);
            labels[i].setText(labels[i+1].getText());
        }
        labels[DIM-1].setForeground(Color.white);
        labels[DIM-1].setText(nomeOspite + ": " + msg);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInvia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelArezzaChat;
    private javax.swing.JPanel jPanelChat;
    private javax.swing.JTextField jTextInput;
    // End of variables declaration//GEN-END:variables
}
