package app;

public class Platform{
   private final int ruedas, largo, ancho, peso_platform;
   private int peso_total;
   private String color;
   private boolean asientos_cuero, climatizador;

   public Platform() {
       ruedas = 4;
       largo = 2000;
       ancho = 300;
       peso_platform = 500;

   }

   public String getDatosgenerales() {
       return "el coche cuenta con " + ruedas + " ruedas, un largo de " + largo + " cm, un ancho de " + ancho
               + " cm y un peso de plataforma de " + peso_platform + " kg";
   }
   public int getRuedas() {
       return ruedas;
   }

   public void setColor(final String color) {// esto es un metodo setter... modifica el valor de una propiedad
       this.color = color;
   }
   public String getColor() {
       return "el color de el coche es " + color;
   }

   public void setAsientos(final String asientos_cuero) {
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }
    }
    public String getAsientos(){
        if(asientos_cuero){
            return "el oche cuenta con asientos de cuero";
        }else{
            return "el coche tiene asientos de serie";
        }
    }

    public void setClimatizador(final String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String getClimatizador() {
        if (climatizador) {
            return "El coche tiene climatizador.";
        } else {
            return "El coche solo tiene aire acondicionado.";
        }
    }

    public String getPesoCoche() {
        final int peso_carroceria = 500;
        peso_total=peso_platform+peso_carroceria;

        if(asientos_cuero){
            peso_total+=50;
        }
        if(climatizador){
            peso_total+=20;
        }

        return "El peso total del tu coche es de "+peso_total+" Kg.";
    }

    public int getPrecioCoche(){
        int precio_coche=10000;
        if(asientos_cuero){
            precio_coche+=2000;
        }

        if(climatizador){
            precio_coche+=1000;
        }

        return precio_coche;
    }



    

}