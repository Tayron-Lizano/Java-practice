package graficos;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;


public class FocusMain{
    public static void main(String []args){
        MakeFrameFocus myFocus = new MakeFrameFocus();
        myFocus.setDefaultCloseOperation(3);

    }

}

class MakeFrameFocus extends JFrame{
    public MakeFrameFocus(){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        Dimension myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setVisible(true);
        setTitle("Focus");
        MakeLaminaFocus myLamina = new MakeLaminaFocus();
        add(myLamina);
    }
} 

class MakeLaminaFocus extends JPanel{

    JTextField cuadro1 = new JTextField();
    JTextField cuadro2 = new JTextField();
    public MakeLaminaFocus(){
        setLayout(null);
        cuadro1.setBounds(100, 20, 150, 50);
        cuadro2.setBounds(100, 150, 150, 50);
        add(cuadro1);
        add(cuadro2);
        cuadro1.addFocusListener(new Focus());
        cuadro2.addFocusListener(new Focus());
    }
    private class Focus implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
        }
    
        @Override
        //COMPRUEBA SI EL TEXTO INGRESADO EN EL TEXTFIELD ES UN CORREO
        public void focusLost(FocusEvent e) {
            String email = cuadro1.getText();
            boolean cmp= false;

            for(int i=0; i<email.length();i++){
                if (email.charAt(i)=='@') {
                    cmp=true;
                }
            }

            if (cmp) {
                System.out.println("El correo es correcto");
            }else{
                System.out.println("El correo es incorrecto");
            }
    
        }
    
    }

}

