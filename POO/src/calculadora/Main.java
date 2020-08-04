package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Main {
    public static void main(String []args){

        FrameCalculator myCalculator = new FrameCalculator();
    }
}


class FrameCalculator extends JFrame{
    public FrameCalculator(){
        setVisible(true);
        setBounds(100, 100, 300, 300);
        setTitle("calculator");
        setDefaultCloseOperation(3);
        setResizable(false);

        add(new PanelCalulator(),BorderLayout.NORTH);
        add(new PanelCalulator1(),BorderLayout.CENTER);
    }

}

class PanelCalulator extends JPanel{
    public PanelCalulator(){
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        add(pantalla, BorderLayout.NORTH );
    }
}
class PanelCalulator1 extends JPanel{
    public PanelCalulator1(){
        setLayout(new GridLayout(4, 4));
        makeBoton("7");
        makeBoton("8");
        makeBoton("9");
        makeBoton("/");

        makeBoton("4");
        makeBoton("5");
        makeBoton("6");
        makeBoton("*");
        
        makeBoton("1");
        makeBoton("2");
        makeBoton("3");
        makeBoton("+");
        
        makeBoton("0");
        makeBoton(".");
        makeBoton("=");
        makeBoton("");

    }

    private void makeBoton(String name){
        add(new JButton(name));
    }
}