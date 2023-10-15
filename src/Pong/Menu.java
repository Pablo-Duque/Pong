
package Pong;

import java.awt.event.*;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame implements KeyListener{
    private Inicio i;
    
public Menu() {
    setTitle("Pong em Java");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    initComponents();
    setLocationRelativeTo(null);
    i = new Inicio(this);
    mudarPainel(i);
}

public void mudarPainel(JPanel tela){
    this.setContentPane(tela);
    this.validate();
}

public void keyPressed(KeyEvent e) {
     if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
         mudarPainel(i);
     }
 }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
