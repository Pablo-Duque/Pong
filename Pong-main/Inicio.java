package Pong;

import java.awt.Color;
import javax.swing.JPanel;

public class Inicio extends javax.swing.JPanel {
    private Menu m;
    private Config c;
    private JPanel j;
    private Color corFundo = Color.white, corPlayer1 = Color.cyan, 
    corPlayer2 = Color.red;
    
    public Inicio(Menu m){
        this.m = m;
        c = new Config(m, this);
        initComponents();
    }
    
    public void setCorFundo(Color cor){
        this.corFundo = cor;
    }

    public void setCorPlayer1(Color cor){
       this.corPlayer1 = cor;
    }

    public void setCorPlayer2(Color cor){
       this.corPlayer2 = cor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JPanel();
        configuracoes = new javax.swing.JButton();
        jogar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        inicio.setPreferredSize(new java.awt.Dimension(767, 508));

        configuracoes.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        configuracoes.setText("Configurações");
        configuracoes.setBorderPainted(true);
        configuracoes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        configuracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracoesActionPerformed(evt);
            }
        });

        jogar.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        jogar.setText("Jogar");
        jogar.setBorderPainted(true);
        jogar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Cambria", 0, 30)); // NOI18N
        sair.setText("Sair");
        sair.setBorderPainted(true);
        sair.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(configuracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(configuracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        j = new Jogar(m, corFundo, corPlayer1, corPlayer2);
        m.mudarPainel(j);
    }//GEN-LAST:event_jogarActionPerformed

    private void configuracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracoesActionPerformed
        m.mudarPainel(c);
    }//GEN-LAST:event_configuracoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configuracoes;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jogar;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

}
