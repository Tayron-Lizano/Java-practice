package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class WindowsFocusMain extends JFrame implements WindowFocusListener{
    public static void main(String []args){
        WindowsFocusMain myWindow = new WindowsFocusMain();
        myWindow.makeVentana();
    }
    public void makeVentana(){
        marco1 = new WindowsFocusMain();
        marco2 = new WindowsFocusMain();
        marco1.setBounds(100, 100, 550, 400);
        marco2.setBounds(700, 100, 550, 400);
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
        marco1.setDefaultCloseOperation(3);
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==marco1) {
            marco1.setTitle("Tengo el foco");
        }else{
            marco2.setTitle("Tengo el foco");
        }

    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource()==marco1) {
            marco1.setTitle("");
        }else{
            marco2.setTitle("");
        }

    }
    WindowsFocusMain marco1;
    WindowsFocusMain marco2;
}