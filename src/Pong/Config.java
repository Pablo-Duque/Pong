
package Pong;

import java.awt.Color;

public class Config extends javax.swing.JPanel {
    private Menu m;
    private Inicio i;
    String comparaFundo, comparaPlay1, comparaPlay2;
            
    public Config(Menu m, Inicio i){
        this.m = m;
        this.i = i;
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
        corPlayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branco", "Preto", "Azul", "Vermelho", "Amarelo", "Verde", "Magenta", "Rosa" }));
        corPlayer1.setSelectedIndex(2);
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
        corPlayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branco", "Preto", "Azul", "Vermelho", "Amarelo", "Verde", "Magenta", "Rosa" }));
        corPlayer2.setSelectedIndex(3);
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
        m.mudarPainel(i);
    }//GEN-LAST:event_voltarActionPerformed

    private void corFundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corFundoActionPerformed
        String cor = (String) corFundo.getSelectedItem();
        comparaFundo = cor;
        
        switch (cor) {
            case "Branco" -> {
                i.setCorFundo(Color.white);
                if(comparaPlay1 == "Branco")
                    i.setCorPlayer1(new Color(204, 204, 204));
                if(comparaPlay2 == "Branco")
                    i.setCorPlayer2(new Color(204, 204, 204));
            }
            case "Preto" -> {
                i.setCorFundo(Color.black);
                if(comparaPlay1 == "Preto")
                    i.setCorPlayer1(new Color(51, 51, 51));
                if(comparaPlay2 == "Preto")
                    i.setCorPlayer2(new Color(51, 51, 51));
            }
            case "Azul" -> {
                i.setCorFundo(Color.cyan);
                if(comparaPlay1 == "Azul" || comparaPlay1 == null)
                    i.setCorPlayer1(Color.blue);
                if(comparaPlay2 == "Azul")
                    i.setCorPlayer2(Color.blue);
            }
            case "Vermelho" -> {
                i.setCorFundo(Color.red);
                if(comparaPlay1 == "Vermelho")
                    i.setCorPlayer1(Color.pink);
                if(comparaPlay2 == "Vermelho" || comparaPlay2 == null)
                    i.setCorPlayer2(Color.pink);
            }
            case "Amarelo" -> {
                i.setCorFundo(Color.yellow);
                if(comparaPlay1 == "Amarelo")
                    i.setCorPlayer1(new Color(120, 120, 0));
                if(comparaPlay2 == "Amarelo")
                    i.setCorPlayer2(new Color(120, 120, 0));
            }
            case "Verde" -> {
                i.setCorFundo(Color.green);
                if(comparaPlay1 == "Verde")
                    i.setCorPlayer1(new Color(0, 120, 0));
                if(comparaPlay2 == "Verde")
                    i.setCorPlayer2(new Color(0, 120, 0));
            }
            case "Magenta" -> {
            i.setCorFundo(Color.magenta);
            if(comparaPlay1 == "Magenta")
                i.setCorPlayer1(Color.pink);
            if(comparaPlay2 == "Magenta")
                i.setCorPlayer2(Color.pink);
            }
            case "Rosa" -> {
            i.setCorFundo(Color.pink);
            if(comparaPlay1 == "Rosa")
                i.setCorPlayer1(Color.magenta);
            if(comparaPlay2 == "Rosa")
                i.setCorPlayer2(Color.magenta);
            }
        }
    }//GEN-LAST:event_corFundoActionPerformed

    private void corPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corPlayer1ActionPerformed
        String cor = (String) corPlayer1.getSelectedItem();
        comparaPlay1 = cor;
        
        switch (cor) {
            case "Branco" -> {
                if(comparaFundo == "Branco" || comparaFundo == null)
                    i.setCorPlayer1(new Color(204, 204, 204));
                else
                    i.setCorPlayer1(Color.white);
            }
            case "Preto" -> {
                if(comparaFundo == "Preto")
                    i.setCorPlayer1(new Color(51, 51, 51));
                else
                    i.setCorPlayer1(Color.black);
            }
            case "Azul" -> {
                if(comparaFundo == "Azul")
                    i.setCorPlayer1(Color.blue);
                else
                    i.setCorPlayer1(Color.cyan);
            }
            case "Vermelho" -> {
                if(comparaFundo == "Vermelho")
                    i.setCorPlayer1(Color.pink);
                else
                    i.setCorPlayer1(Color.red);
            }
            case "Amarelo" -> {
                if(comparaFundo == "Amarelo")
                    i.setCorPlayer1(new Color(120, 120, 0));
                else
                    i.setCorPlayer1(Color.yellow);
            }
            case "Verde" -> {
                if(comparaFundo == "Verde")
                    i.setCorPlayer1(new Color(0, 120, 0));
                else
                    i.setCorPlayer1(Color.green);
            }
            case "Magenta" -> {
                if(comparaFundo == "Magenta")
                    i.setCorPlayer1(Color.pink);
                else
                    i.setCorPlayer1(Color.magenta);
            }
            case "Rosa" -> {
                if(comparaFundo == "Rosa")
                    i.setCorPlayer1(Color.magenta);
                else
                    i.setCorPlayer1(Color.pink);
            }
        }
    }//GEN-LAST:event_corPlayer1ActionPerformed

    private void corPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corPlayer2ActionPerformed
        String cor = (String) corPlayer2.getSelectedItem();
        comparaPlay2 = cor;
        
        switch (cor) {
            case "Branco" -> {
                if(comparaFundo == "Branco" || comparaFundo == null)
                    i.setCorPlayer2(new Color(204, 204, 204));
                else
                    i.setCorPlayer2(Color.white);
            }
            case "Preto" -> {
                if(comparaFundo == "Preto")
                    i.setCorPlayer2(new Color(51, 51, 51));
                else
                    i.setCorPlayer2(Color.black);
            }
            case "Azul" -> {
                if(comparaFundo == "Azul")
                    i.setCorPlayer2(Color.blue);
                else
                    i.setCorPlayer2(Color.cyan);
            }
            case "Vermelho" -> {
                if(comparaFundo == "Vermelho")
                    i.setCorPlayer2(Color.pink);
                else
                    i.setCorPlayer2(Color.red);
            }
            case "Amarelo" -> {
                if(comparaFundo == "Amarelo")
                    i.setCorPlayer2(new Color(120, 120, 0));
                else
                    i.setCorPlayer2(Color.yellow);
            }
            case "Verde" -> {
                if(comparaFundo == "Verde")
                    i.setCorPlayer2(new Color(0, 120, 0));
                else
                    i.setCorPlayer2(Color.green);
            }
            case "Magenta" -> {
                if(comparaFundo == "Magenta")
                    i.setCorPlayer2(new Color(0, 0, 0));
                else
                    i.setCorPlayer2(Color.magenta);
            }
            case "Rosa" -> {
                if(comparaFundo == "Rosa")
                    i.setCorPlayer2(new Color(0, 0, 0));
                else
                    i.setCorPlayer2(Color.pink);
            }
        }
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
