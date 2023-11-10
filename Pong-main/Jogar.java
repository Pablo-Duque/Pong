package Pong;

import java.awt.Color;
import java.awt.event.*;

public class Jogar extends javax.swing.JPanel implements KeyListener{
    private Menu m;
    private Inicio i;
    private Raquete player1, player2;
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
        player1 = new Raquete();
        player2 = new Raquete();
        //Seta a posicao
        player1.setBounds(0, 250, largura, altura);
        player2.setBounds(1175, 250, largura, altura);
        //Adiciona ao painel
        add(player1);
        add(player2);
        player1.setBackground(corPlayer1);
        player2.setBackground(corPlayer2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(767, 508));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
 @Override
 public void keyTyped(KeyEvent e) {
  
 }

 @Override
 public void keyPressed(KeyEvent e) {
  switch(e.getKeyCode()) {
  case KeyEvent.VK_W: 
        if (topo1 <= 0)
            player1.moverPanelY(0);
        else{
            player1.moverPanelY(-velocidade);
            topo1 -= velocidade;
            fim1 -= velocidade;
        }
   break;

  case KeyEvent.VK_S: 
        if (fim1 >= 650)
            player1.moverPanelY(0);
        else{
            player1.moverPanelY(velocidade);
            topo1 += velocidade;
            fim1 += velocidade;
        }
   break;
   
    case KeyEvent.VK_UP: 
       if (topo2 <= 0)
           player2.moverPanelY(0);
       else{
           player2.moverPanelY(-velocidade);
           topo2 -= velocidade;
           fim2 -= velocidade;
       }
   break;
   
    case KeyEvent.VK_DOWN: 
       if (fim2 >= 650)
           player2.moverPanelY(0);
       else{
           player2.moverPanelY(velocidade);
           topo2 += velocidade;
           fim2 += velocidade;
       }
   break;

 }
 }

 @Override
 public void keyReleased(KeyEvent e) {

 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
