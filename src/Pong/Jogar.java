
package Pong;

import java.awt.Color;
import java.awt.event.*;

public class Jogar extends javax.swing.JPanel implements KeyListener{
    private Menu m;
    private Inicio i;
    private TelaJogo tj;
    private Raquete player1, player2;
    private int altura = 100, largura = 25, velocidade = 10, posicao = 250;
    
    public Jogar(TelaJogo tj, Menu m, Color corFundo, Color corPlayer1, Color corPlayer2) {
        this.m = m;
        this.tj = tj;
        initComponents();
        this.setBackground(corFundo);
        player1 = new Raquete(posicao, largura, altura);
        player2 = new Raquete(posicao, largura, altura);
        player1.setBounds(0, posicao, largura, altura);
        player2.setBounds(1175, posicao, largura, altura);
        add(player1);
        add(player2);
        player1.setBackground(corPlayer1);
        player2.setBackground(corPlayer2);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            player1.subir(velocidade);
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            player1.descer(velocidade);
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player2.subir(velocidade);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player2.descer(velocidade);
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            tj.dispose(); 
            m.setVisible(true);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(767, 508));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
