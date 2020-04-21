package app;
import java.util.*;

public class Uso_Persona {
    public static void main(String [] args){

        Persona[] lasPersonas=new Persona[2];
        
        lasPersonas[0]=new Empleado2("Luis",50000, 2009, 02, 25);
        lasPersonas[1]=new Alumno("Tayron Lizano", "Ingenieria en Sistemas Computacionles.");

        for(Persona p: lasPersonas){
            System.out.println(p.getNombre()+ " "+p.getDescripcion());
        }

    }

}
/*
============================
       CLASE PERSONA
============================
*/
abstract class Persona {
    
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract String getDescripcion();
    /*los metodos abstractos solo de definen en la clase padre... 
    se construyen en las sub-clases.*/


    public String nombre;
}

/*
============================
       CLASE ALUMNO
============================
*/
class Alumno extends Persona{
    public Alumno(String nombre, String carrera){
        super(nombre);
        this.carrera=carrera;
    }

    public String getDescripcion(){
        return "Este alumno esta estudiando la carrera de "+ carrera;
    }

    private String carrera;
}



/*
============================
       CLASE EMPLEADO 2
============================
*/
class Empleado2 extends Persona{
    public Empleado2( String nombre,  double sueldo,  int anio,  int mes,  int dia) {
        super(nombre);
        this.sueldo = sueldo;
         GregorianCalendar fecha = new GregorianCalendar(anio, mes, dia);
        f_contrato = fecha.getTime();
        idSiguiente++;
        id=idSiguiente;
    }

    public String getDescripcion(){
        return "Este empleado tiene un id: "+id+" un sueldo de: "
        +sueldo+" y una fecha de contrato: "+ f_contrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return f_contrato;
    }

    public void setAumento( double porcentaje) {
         double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private double sueldo;
    private Date f_contrato;
    private int id;
    private static int idSiguiente=0;
}