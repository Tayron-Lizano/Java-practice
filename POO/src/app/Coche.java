package app;
import javax.swing.JOptionPane;

public class Coche {
    public static void main(String[] args) throws Exception {
        Platform Renault = new Platform();
        
        Renault.setColor(JOptionPane.showInputDialog("Establece un color a tu coche!")); //hasta el momesto la variable color es == NULL
        //por eso debemos inicializarla primero
    
        System.out.println(Renault.getDatosgenerales());
        System.out.println(Renault.getColor());

        Renault.setAsientos(JOptionPane.showInputDialog("¿Deseas asientos de cuero? ¿SI o NO?"));
        System.out.println(Renault.getAsientos());

        Renault.setClimatizador(JOptionPane.showInputDialog("¿Deseas climatizador en tu coche? ¿SI o NO?"));
        System.out.println(Renault.getClimatizador());

        System.out.println(Renault.getPesoCoche());
        System.out.println("El precio final del coche con todos los juguetes es de "+Renault.getPrecioCoche()+" dolares.");
        
         //System.out.println("el coche tiene "+Renault.ruedas);
    }
}