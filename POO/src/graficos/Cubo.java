package graficos;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JPanel;
import java.awt.geom.*;



public class Cubo{
    public static void main(String []args){
        MakeFrame drawCubo = new MakeFrame();
        drawCubo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MakeFrame extends JFrame{
    public MakeFrame(){
        Toolkit mytoolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = mytoolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2 );
        setTitle("My App");
        setVisible(true);
        Image icon=mytoolkit.getImage("/src/graficos/icon.png");
        setIconImage(icon);
        MakeLamina myLamina = new MakeLamina();
        add(myLamina);
    }
}

//Esta lamina dibuja un cubo
class MakeLamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //rect-back
        Rectangle2D rectangulo = new Rectangle2D.Double();
        rectangulo.setRect(50, 50, 200, 200);
        g2.draw(rectangulo);

        //rect-front
        Rectangle2D rectangulo1 = new Rectangle2D.Double();
        rectangulo1.setRect(100, 100,200, 200);
        g2.draw(rectangulo1);

        //uniendo las esquinas del cubo
        Point2D punto1= new Point2D.Double();
        punto1.setLocation(50, 50);
        Point2D punto2 = new Point2D.Double();
        punto2.setLocation(100, 100);

        Line2D line1 = new Line2D.Double();
        line1.setLine(punto1, punto2);
        g2.draw(line1);

        Line2D line2 = new Line2D.Double();
        line2.setLine(250, 50, 300, 100);
        g2.draw(line2);

        Line2D line3 = new Line2D.Double();
        line3.setLine(50, 250, 100, 300);
        g2.draw(line3);

        Line2D line4 = new Line2D.Double();
        line4.setLine(250, 250, 300, 300);
        g2.draw(line4);



        




    }
}