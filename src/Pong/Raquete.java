package Pong;

public class Raquete extends javax.swing.JPanel {
    private int topo, fim, altura, largura;
    
    public Raquete(int posicao, int largura, int altura) {
        this.altura = altura;
        this.largura = largura;
        this.topo = posicao;
        this.fim = posicao + altura;
        initComponents();
    }
    
    public void moverPanelY(int distancia) {
        int atual = this.getY();
        int novo = atual + distancia;
        this.setBounds(this.getX(), novo, this.getWidth(), this.getHeight());
        this.repaint();
    }
    
    public void subir(int velocidade){
        if (topo <= 0)
        moverPanelY(0);
        else{
            moverPanelY(-velocidade);
            topo -= velocidade;
            fim -= velocidade;
        }
    }
    
    public void descer(int velocidade){
       if (fim >= 650)
        moverPanelY(0);
        else{
            moverPanelY(velocidade);
            topo += velocidade;
            fim += velocidade;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
