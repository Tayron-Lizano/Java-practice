/*Este programa revisa si la fuente ingresada est� en el sistema*/
package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Fuentes {
	public static void main(String [] args) {
		String [] fuentesdeSistema= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		String fuentein = JOptionPane.showInputDialog("ingresa la fuente a buscar");
		boolean busqueda = false;
		
		for (String f:fuentesdeSistema) {
			if(f.equals(fuentein)) {
				busqueda = true;
			}
		}
		
		if (busqueda) {
			System.out.println("la fuentes si está");
		}else {
			System.out.println("la fuente ingresada no se encuentra de el arreglo.");
		}
		
	}

}
