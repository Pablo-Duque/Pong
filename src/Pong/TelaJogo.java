package Pong;

import java.awt.Color;
import javax.swing.JPanel;

public class TelaJogo extends javax.swing.JFrame {
        
    public TelaJogo(Menu m, Color corFundo, Color corPlayer1, Color corPlayer2) {
    setTitle("Pong em Java");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    initComponents();
    setLocationRelativeTo(null);
    setResizable(false);
    Jogar j = new Jogar(this, m, corFundo, corPlayer1, corPlayer2);
    j.addKeyListener(j);
    j.setFocusable(true);
    mudarPainel(j);
    }

    public void mudarPainel(JPanel tela){
    this.setContentPane(tela);
    this.validate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
