
package Pong;

import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {
    private Inicio i;
    
public Menu() {
    setTitle("Pong em Java");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    initComponents();
    setLocationRelativeTo(null);
    setResizable(false);
    i = new Inicio(this);
    mudarPainel(i);
}

public void mudarPainel(JPanel tela){
    this.setContentPane(tela);
    this.validate();
}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
