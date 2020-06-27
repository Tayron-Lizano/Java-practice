package graficos;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoMain{
    public static void main (String []args){
        MakeFrameEvento e = new MakeFrameEvento();
        e.setDefaultCloseOperation(3);

    }
}


class MakeFrameEvento extends JFrame{
    public MakeFrameEvento(){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setVisible(true);
        setTitle("My Event");
        Image icon = myToolkit.getImage("src/graficos/icon.png");
        setIconImage(icon);
        MakeLaminaEvento lamina = new MakeLaminaEvento();
        add(lamina);
    
        
    }
}

class MakeLaminaEvento extends JPanel{
    
    JButton cyan= new JButton("cyan");
    JButton magenta = new JButton("magenta");
    JButton orange = new JButton("orange");
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        add(cyan);
        add(magenta);
        add(orange);
        CambiaColor colorCyan = new CambiaColor(Color.CYAN);
        CambiaColor colorMagenta = new CambiaColor(Color.MAGENTA);
        CambiaColor colorOrange = new CambiaColor(Color.ORANGE);
        cyan.addActionListener(colorCyan);
        magenta.addActionListener(colorMagenta);
        orange.addActionListener(colorOrange);
    }

    private class CambiaColor implements ActionListener{
        public CambiaColor(Color c){
            this.c= c;
        }
        public void actionPerformed(ActionEvent event){
            setBackground(c);
        }
        private Color c;
    }

}
