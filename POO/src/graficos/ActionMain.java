package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.InputMap;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class ActionMain {
    public static void main (String  [] args){
        MakeFrameAction myVtn = new MakeFrameAction();
        myVtn.setDefaultCloseOperation(3);
    }
}

class MakeFrameAction extends JFrame{
    public MakeFrameAction(){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setVisible(true);
        setTitle("Multiples Objetos Fuentes");
        Image icon = myToolkit.getImage("POO/src/graficos/icon.png");
        setIconImage(icon);
        add(new MakeLaminaAction());

    }
}

class MakeLaminaAction extends JPanel{
    public MakeLaminaAction(){
        ActionColor amrilloActionColor = new ActionColor("Amarillo", new ImageIcon("POO/src/graficos/icon.png"), Color.yellow);
        ActionColor azulActionColor = new ActionColor("Azul", new ImageIcon("POO/src/graficos/icon.png"), Color.blue);
        ActionColor rojoActionColor = new ActionColor("Rojo", new ImageIcon("POO/src/graficos/icon.png"), Color.red);
        
        add(new JButton(amrilloActionColor));
        add(new JButton (azulActionColor));
        add(new JButton(rojoActionColor));
    }

    private class ActionColor extends AbstractAction{

        public ActionColor(String nombre, ImageIcon icono, Color c){
            putValue(AbstractAction.NAME, nombre);
            putValue(AbstractAction.SMALL_ICON, icono);
            putValue("ColorFondo", c);
            putValue(AbstractAction.SHORT_DESCRIPTION, "Este Boton pone la lamina de color "+ nombre);
            InputMap mapaEntrada = getInputMap();
            
        }
    
        public void actionPerformed(ActionEvent event){
            Color c= (Color)getValue("ColorFondo");
            setBackground(c);
        }
    }

}

