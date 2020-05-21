package innerlocal;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.*;
import java.awt.event.*;
import java.awt.Toolkit;

public class TryTimer{
    public static void main(String []args){
        Clock myClock= new Clock();
        myClock.run(3000, true);
    }
}


class Clock{
    public void run(int delay, boolean sound){
        
        class GiveTime implements ActionListener{
            public void actionPerformed(ActionEvent event){
                Date now = new Date();
                System.out.println("Print the time every 3 seconds."+now);
                if(sound){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new GiveTime();
        Timer myTimer = new Timer(delay, listener);
        myTimer.start();
        JOptionPane.showMessageDialog(null, "Press 'Accept'to finish.");
        System.exit(0);;

        
    }
}