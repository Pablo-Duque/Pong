package movingballexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingBallExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bola");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 650);
        
        bola bp = new bola();
        frame.add(bp);
        
        Timer tempo = new Timer(10, bp);
        tempo.start(); 
        
        frame.setVisible(true);
    }
}

class bola extends JPanel implements ActionListener {
    private double xV = 7, yV = 3;
    private int d = 55, x = getWidth() / 2, y = getWidth() / 2;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, d, d);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        x += xV;
        y += yV;
        
        
        if (x < 0) {
            //x = (getWidth() - d) / 2;
            //y = (getHeight() - d) / 2;
            xV = -xV;
            //xV = xV * 1.2;
            
        }
        if (x > getWidth() - d) {
            xV = -xV;
            xV = xV * 1.2;
        }
        
        if (y < 0 || y > getHeight() - d) {
            yV = - yV;
        }
        
        repaint(); 
    }
}

