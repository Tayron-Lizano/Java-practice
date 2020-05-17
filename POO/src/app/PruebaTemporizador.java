package app;

import javax.swing.JOptionPane;
import javax.swing.Timer;
<<<<<<< HEAD

import java.awt.Toolkit;
=======
>>>>>>> 9c775e433a40c18a299701d668fa012785b698f9
import java.awt.event.*;
import java.util.Date;


public class PruebaTemporizador {
    public static void main(String [] args){
        ActionListener oyente = new DameLaHora();
        Timer temporizador = new Timer(5000, oyente);

        temporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para Deterner el Temporizador: ");
        System.exit(0);

    }
}

class DameLaHora  implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Date ahora=new Date();
        System.out.println("te devuelvo la hora cada 5 sg: "+ ahora);
        Toolkit.getDefaultToolkit().beep();
    }

}