package graficos;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.*;

public class EventoTeclado {
    public static void main (String []args){
        MakeFrameTeclado myTeclado = new MakeFrameTeclado();
        myTeclado.setDefaultCloseOperation(3);

    }
}

class MakeFrameTeclado extends JFrame{
    public MakeFrameTeclado(){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setVisible(true);
        setTitle("My App");
        Image icon = myToolkit.getImage("/src/graficos/icon.png");
        setIconImage(icon);
        addKeyListener(new MakeEventKey());
    }
}



        
class MakeEventKey implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override 
    public void keyPressed(KeyEvent e) {}
    
    @Override
    public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
        char letrapulsada = e.getKeyChar(); 
        System.out.print(letrapulsada); 
    }
}
 