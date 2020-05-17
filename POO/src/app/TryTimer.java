package app;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.*;
import java.awt.event.*;
import java.awt.Toolkit;


public class TryTimer{
    public static void main(String []args){
        Rolex myRolex= new Rolex(3000, true);
        myRolex.run();

    }
}

class Rolex {
    public Rolex (int delay, boolean sound){
        this.delay=delay;
        this.sound=sound;
    }

    public void run(){
        ActionListener listener =new MyRolex();
        Timer myTimer = new Timer (delay, listener);
        myTimer.start();
        JOptionPane.showMessageDialog(null, "Press 'Accept' to finish.");
        System.exit(0);
    }

    private class MyRolex implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Date now= new Date();
            System.out.println("Print the time every 3 seconds."+now);
            if(sound){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    private int delay;
    private boolean sound;
}