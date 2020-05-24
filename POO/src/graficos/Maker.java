package graficos;

import javax.swing.*;
import java.awt.*;

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
        g.drawString("Estamos escribiendo en el panel", 50, 50);
    }
}