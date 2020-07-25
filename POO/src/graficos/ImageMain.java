package graficos;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;


public class ImageMain{
    public static void main(String [] args){
        MakeFrameImage miMarco = new MakeFrameImage();
        miMarco.setDefaultCloseOperation(3);

    }
}

class MakeFrameImage extends JFrame{
    public MakeFrameImage(){
        Toolkit myToolkit = Toolkit.getDefaultToolkit();
        myScreen = myToolkit.getScreenSize();
        setBounds(myScreen.width/4, myScreen.height/4, myScreen.width/2, myScreen.height/2);
        setVisible(true);
        setTitle("My App");
        Image icon = myToolkit.getImage("POO/src/graficos/icon.png");
        setIconImage(icon);

        MakeLaminaImage lamina = new MakeLaminaImage();
        add(lamina);
    }
    private Dimension myScreen;
}

class MakeLaminaImage extends JPanel{
    public MakeLaminaImage(){
        try {
            File myImg = new File("POO/src/graficos/icon.png");
            imge = ImageIO.read(myImg);
           
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("la imagen no fue encontrada.");
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int ancho = imge.getWidth(this);
        int alto = imge.getHeight(this);
        g.drawImage(imge, 0, 0, null);
        
        for(int i =0;i<5;i++){
            for(int j =0;j<10;j++){
                if(i+j>0){
                    g.copyArea(0, 0, ancho, alto, ancho*i, alto*j);
                }
            }
        }
    }
    private Image imge;

}
