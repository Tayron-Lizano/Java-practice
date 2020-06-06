package graficos;


import java.awt.*;
import javax.swing.JFrame;

public class DrawFrame{
    public static void main(String [] args){
        MyFrame app= new MyFrame();

    }
}

class MyFrame extends JFrame{
    public MyFrame (){
        Toolkit myScreen =Toolkit.getDefaultToolkit();
        Dimension tamanio= myScreen.getScreenSize();
        setBounds(tamanio.width/4, tamanio.height/4, tamanio.width/2, tamanio.height/2);
        setVisible(true);
        setTitle("My App");
        Image icon = myScreen.getImage("src/graficos/icon.png");
        setIconImage(icon);
        setDefaultCloseOperation(3);
    } 
}