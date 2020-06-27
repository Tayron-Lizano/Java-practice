package graficos;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;

public class WinStateMain {
    public static void main(String []args){
        MakeFrameWinState myWindow = new MakeFrameWinState();
        myWindow.setDefaultCloseOperation(3);

    }
}



class MakeFrameWinState extends JFrame{
    public MakeFrameWinState(){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setVisible(true);
        setTitle("Windows States");
        Image icon = myToolkit.getImage("src/graficos/icon.png");
        setIconImage(icon);
        addWindowStateListener(new WinState());
        
    }
}


class WinState implements WindowStateListener{
    public void windowStateChanged(WindowEvent event){
        if(event.getNewState()==Frame.ICONIFIED){
            System.out.println("la ventana se ha minimizado.");
        }
        if(event.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("la ventana se ha maximizado.");
        }
        if(event.getNewState()==Frame.NORMAL){
            System.out.println("La ventana está en su estado normal.");
        }
        
    }

}