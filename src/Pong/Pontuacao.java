/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pong;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author ht3024784
 */
public class Pontuacao extends javax.swing.JPanel {

    int p = 0;
    
    public Pontuacao(Color cor) {
       setBackground(cor);
       ponto = new JLabel(String.valueOf(p));
       ponto.setFont(new Font("Serif", Font.BOLD, 50));
       add(ponto);
    }
    public void foiPonto(){
        p += 10; 
        ponto.setText(String.valueOf(p));
        repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ponto = new javax.swing.JLabel();

        ponto.setFont(new java.awt.Font("Segoe UI", 0, 100)); // NOI18N
        ponto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ponto.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ponto, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ponto, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        ponto.getAccessibleContext().setAccessibleName("Ponto");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ponto;
    // End of variables declaration//GEN-END:variables
}