
package Pong;

import java.awt.Color;
import javax.swing.JPanel;

public class Config extends javax.swing.JPanel {
    private Menu m;
    
    public Config(Menu m){
        this.m = m;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        corFundo = new javax.swing.JComboBox<>();
        labelCorFundo = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        corPlayer1 = new javax.swing.JComboBox<>();
        labelCorPlayer1 = new javax.swing.JLabel();
        corPlayer2 = new javax.swing.JComboBox<>();
        labelCorPlayer2 = new javax.swing.JLabel();

        corFundo.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        corFundo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branco", "Preto", "Azul", "Vermelho", "Amarelo", "Verde", "Magenta", "Rosa" }));
        corFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        corFundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corFundoActionPerformed(evt);
            }
        });

        labelCorFundo.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        labelCorFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCorFundo.setText("Cor de Fundo");
        labelCorFundo.setToolTipText("");
        labelCorFundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        voltar.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorderPainted(true);
        voltar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        corPlayer1.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        corPlayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branco", "Preto", "Azul", "Vermelho", "Amarelo", "Verde", "Roxo", "Rosa" }));
        corPlayer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        corPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corPlayer1ActionPerformed(evt);
            }
        });

        labelCorPlayer1.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        labelCorPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCorPlayer1.setText("Cor Player 1");
        labelCorPlayer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        corPlayer2.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        corPlayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branco", "Preto", "Azul", "Vermelho", "Amarelo", "Verde", "Roxo", "Rosa" }));
        corPlayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        corPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corPlayer2ActionPerformed(evt);
            }
        });

        labelCorPlayer2.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        labelCorPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCorPlayer2.setText("Cor Player 2");
        labelCorPlayer2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corFundo, 0, 183, Short.MAX_VALUE)
                    .addComponent(labelCorFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corPlayer1, 0, 183, Short.MAX_VALUE)
                    .addComponent(labelCorPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corPlayer2, 0, 183, Short.MAX_VALUE)
                    .addComponent(labelCorPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCorPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCorPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCorFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(corFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        corFundo.getAccessibleContext().setAccessibleName("Escolher cor de fundo");
        labelCorFundo.getAccessibleContext().setAccessibleName("Cor de fundo");
        labelCorFundo.getAccessibleContext().setAccessibleDescription("Escolhas as cores");
        corPlayer1.getAccessibleContext().setAccessibleName("Escolher cor do player 1");
        labelCorPlayer1.getAccessibleContext().setAccessibleName("Cor player 1");
        corPlayer2.getAccessibleContext().setAccessibleName("Escolher cor do player 2");
        labelCorPlayer2.getAccessibleContext().setAccessibleName("Cor player 2");
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        JPanel inicio = new Inicio(m);
        m.mudarPainel(inicio);
    }//GEN-LAST:event_voltarActionPerformed

    private void corFundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corFundoActionPerformed
        String cor = (String) corFundo.getSelectedItem();

        switch (cor) {
            case "Branco" -> m.setBackground(Color.white);
            case "Preto" -> m.setBackground(Color.black);
            case "Azul" -> m.setBackground(Color.cyan);
            case "Vermelho" -> m.setBackground(Color.red);
            case "Amarelo" -> m.setBackground(Color.yellow);
            case "Verde" -> m.setBackground(Color.green);
            case "Magenta" -> m.setBackground(Color.magenta);
            case "Rosa" -> m.setBackground(Color.pink);
        }
    }//GEN-LAST:event_corFundoActionPerformed

    private void corPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corPlayer1ActionPerformed

    private void corPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corPlayer2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> corFundo;
    private javax.swing.JComboBox<String> corPlayer1;
    private javax.swing.JComboBox<String> corPlayer2;
    private javax.swing.JLabel labelCorFundo;
    private javax.swing.JLabel labelCorPlayer1;
    private javax.swing.JLabel labelCorPlayer2;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
