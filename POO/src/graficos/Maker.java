package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Maker{
    public static void main(String []args){
        Writing window= new Writing();
        window.setDefaultCloseOperation(3);
    }
}

class Writing extends JFrame {
    public Writing(){
        Toolkit myToolkit= Toolkit.getDefaultToolkit();
        Dimension mySreen = myToolkit.getScreenSize();
        setBounds(mySreen.width/4, mySreen.height/4, mySreen.width/2, mySreen.height/2);
        Lamina miLamina=new Lamina();
        add(miLamina);
        setVisible(true);
        setTitle("My App");
        Image icon= myToolkit.getImage("icon.png");
        setIconImage(icon);
        

    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 =(Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double();
        rectangulo.setRect(100, 100, 200, 200);
        g2.draw(rectangulo);
        double centrox=rectangulo.getCenterX();
        double centroy=rectangulo.getCenterY();
        double radio=142;
        Ellipse2D elipse= new Ellipse2D.Double();
        elipse.setFrameFromCenter(centrox, centroy, centrox+radio, centroy+radio);
        g2.draw(elipse);
    
        
    }
}