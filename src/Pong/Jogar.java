
package Pong;

import java.awt.Color;
import javax.swing.JPanel;

public class Jogar extends javax.swing.JPanel {
    private Menu m;
    private Inicio i;
    private JPanel player1, player2;
    private int altura = 100, largura = 25;
    private int topo1 = 250, fim1 = 250 + altura, topo2 = 250, fim2 = 250 + altura;
    private int velocidade = 10;
    //O 250 que passamos na criacao n e o meio, mas sim o topo
    //Para acharmos o fim e so somar a altura
    //Esses valores de topo e fim serve para checar a colisao
    //Uma ideia e usar o getY usado no metodo moverPanelY na bola para compararmos dps
    
    public Jogar(Menu m, Color corFundo, Color corPlayer1, Color corPlayer2) {
        this.m = m;
        initComponents();
        this.setBackground(corFundo);
        player1 = new JPanel();
        player2 = new JPanel();
        //Seta a posicao
        player1.setBounds(0, 250, largura, altura);
        player2.setBounds(1175, 250, largura, altura);
        //Adiciona ao painel
        add(player1);
        add(player2);
        player1.setBackground(corPlayer1);
        player2.setBackground(corPlayer2);
    }
    
    public void moverPanelY(int distancia, JPanel player) {
        int atual = player.getY();
        int novo = atual + distancia;
        player.setBounds(player.getX(), novo, player.getWidth(), player.getHeight());
        player.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descer = new javax.swing.JButton();
        subir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(767, 508));

        descer.setText("Descer");
        descer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descerActionPerformed(evt);
            }
        });

        subir.setText("Subir");
        subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(904, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(subir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(descer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void descerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descerActionPerformed
        //Para a raquete nao sumir
        if (fim1 >= 650)
            moverPanelY(0, player1);
        else{
            moverPanelY(velocidade, player1);
            topo1 += velocidade;
            fim1 += velocidade;
            //Println para fins de testes
            System.out.println(topo1);
            System.out.println(fim1 + "\n");
        }
    }//GEN-LAST:event_descerActionPerformed

    private void subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirActionPerformed
        if (topo1 <= 0)
            moverPanelY(0, player1);
        else{
            moverPanelY(-velocidade, player1);
            topo1 -= velocidade;
            fim1 -= velocidade;
            System.out.println(topo1);
            System.out.println(fim1 + "\n");
        }
    }//GEN-LAST:event_subirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton descer;
    private javax.swing.JButton subir;
    // End of variables declaration//GEN-END:variables
}
