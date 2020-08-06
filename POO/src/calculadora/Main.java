package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class Main {
    public static void main(String []args){

        FrameCalculator myCalculator = new FrameCalculator();
    }
}


class FrameCalculator extends JFrame{
    public FrameCalculator(){
        setVisible(true);
        setBounds(100, 100, 250, 300);
        setTitle("calculator");
        setDefaultCloseOperation(3);
        setResizable(false);

        add(new PanelCalulator());
    }

}

class PanelCalulator extends JPanel{

    JButton pantalla = new JButton("0");
    JPanel lamina2 = new JPanel();

    public PanelCalulator(){
        setLayout(new BorderLayout());
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH );

        
        lamina2.setLayout(new GridLayout(4,4));

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

        
        add(lamina2, BorderLayout.CENTER);
        
    }

    private void makeBoton (String name){
        lamina2.add(new JButton(name));
    }

    private class InsertarNumero implements ActionListener{
        public void actionPerformed(ActionEvent e){
                String entrada= e.getActionCommand();
                pantalla.setText(entrada);
            }
        }
}
