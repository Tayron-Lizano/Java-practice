package graficos;

import java.awt.Graphics;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource.*;

import java.awt.Color;
import java.awt.Color.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Image;


public class MiColor{
    public static void main( String []args){
        MakeFrameColor miMarco = new MakeFrameColor();
        miMarco.setDefaultCloseOperation(3);
    }
}

class MakeFrameColor extends JFrame{
    public MakeFrameColor(){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setVisible(true);
        setTitle("My App");
        Image icon = myToolkit.getImage("src/graficos/icon.png");
        setIconImage(icon);
        MakeLaminaColor myLamina = new MakeLaminaColor();
        add(myLamina);
        myLamina.setBackground(Color.magenta);
    }
}

class MakeLaminaColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double();
        rectangulo.setRect(200, 200, 200, 200);
       

        double centrox = rectangulo.getCenterX();
        double centroy = rectangulo.getCenterY();
        double puntox = (rectangulo.getMinX()-(rectangulo.getMinX()/2))+(rectangulo.getMinX()/11);
        double puntoy = (rectangulo.getMinY()-(rectangulo.getMinY()/2))+(rectangulo.getMinY()/11);

        Point2D punto1 = new Point2D.Double(centrox, centroy);
        Point2D punto2 = new Point2D.Double(puntox, puntoy);
        Ellipse2D elipse1= new Ellipse2D.Double();
        elipse1.setFrameFromCenter(punto1, punto2);
        g2.draw(elipse1);
        g2.setPaint(Color.CYAN);
        g2.fill(elipse1);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        Color miColor = new Color(100, 25, 40);
        g2.setColor(miColor.brighter().brighter().brighter().brighter());
        g2.fill(elipse);

    }    
}
