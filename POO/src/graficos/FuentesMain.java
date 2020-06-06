package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Font.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.*;

public class FuentesMain {
	
	public static void main(String [] args) {
		MakeFrameFuentes myMarcoFrameFuentes = new MakeFrameFuentes();
	}

}


class MakeFrameFuentes extends JFrame{
	public MakeFrameFuentes() {
		Toolkit myToolkit = Toolkit.getDefaultToolkit();
		Dimension myScreenDimension = myToolkit.getScreenSize();
		setBounds(myScreenDimension.width/3, myScreenDimension.height/4, myScreenDimension.width/2, myScreenDimension.height/2 );
		setVisible(true);
		setTitle("Manejando fuentes");
		Image icon = myToolkit.getImage("src/graficos/icon.png");
		setIconImage(icon);
		MakeLaminaFuentes miLaminaFuentes = new MakeLaminaFuentes();
		add(miLaminaFuentes);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MakeLaminaFuentes extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Font miFuente = new FontUIResource("Verdana", Font.ITALIC, 24);
		Font miFuente1 = new FontUIResource("Vivaldi", Font.BOLD, 24);
		g2.setFont(miFuente);
		g2.setPaint(Color.MAGENTA);
		g2.drawString("Hola con todos.", 100, 50);
		g2.setFont(miFuente1);
		g2.setColor(Color.ORANGE);
		g2.drawString("Hola con todos.", 100, 100);	
	}
}



