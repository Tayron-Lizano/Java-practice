package graficos;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.geom.*;

public class Elipse{
    public static void main(String []args){
        MakeFrameElipse myFrame= new MakeFrameElipse();
        myFrame.setDefaultCloseOperation(3);
    }
}

class MakeFrameElipse extends JFrame{
    public MakeFrameElipse (){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setTitle("My App");
        setVisible(true);
        Image icon = myToolkit.getImage("src/graficos/icon.png");
        setIconImage(icon);
        MakeLaminaElipse myLamina = new MakeLaminaElipse();
        add(myLamina);   
    }
}

class MakeLaminaElipse extends JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo= new Rectangle2D.Double();
        rectangulo.setRect(100, 100, 200, 200);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);

        Ellipse2D elipse1 = new Ellipse2D.Double();
        double centrox = rectangulo.getCenterX();
        double centroy = rectangulo.getCenterY();
        double puntox = 50;
        double puntoy = 65;
        Point2D punto1 = new Point2D.Double();
        Point2D punto2 = new Point2D.Double();
        punto1.setLocation(centrox, centroy);
        punto2.setLocation(puntox, puntoy);
        elipse1.setFrameFromCenter(punto1, punto2);
        g2.draw(elipse1);
    }
}




