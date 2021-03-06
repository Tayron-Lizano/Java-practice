/*PROLIMORFISMO (PRINCIPIO DE SUSTITUCION): se puede utilizar un objeto de la SUB_CLASE siempre y
 cuando el programa espere un objeto de la SUPER_CLASE.*/

package app;

import java.util.*;

public class Uso_Empleado{
    public static void main ( String[] args) {

        /*
         * Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12 ,17); Empleado
         * empleado2=new Empleado("Anna Lopez", 95000, 1995, 06, 02); Empleado
         * empleado3=new Empleado("Maria MArtin", 105000, 2002, 03, 15);
         * 
         * empleado1.setAumento(5); empleado2.setAumento(5); empleado3.setAumento(5);
         */

        // String[] miarreglo=new String[5];


        Jefe RRHH = new Jefe("juan", 55000, 2006, 9, 25);
        RRHH.setIncentivo(2570);

        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Anna Lopez", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Maria MArtin", 105000, 2002, 03, 15);
        misEmpleados[3] = new Empleado("tayron lizano");
        misEmpleados[4] = RRHH; //polimosfismo en acción.
        misEmpleados[5] = new Jefe("Maria", 95000, 1999, 5, 26);
        Jefe jefa_Finanzas=(Jefe) misEmpleados[5]; //refundicion de objetos
        jefa_Finanzas.setIncentivo(2570);

        //Comparable ejemplo = new Comparable();
        Comparable ejemplo = new Empleado("Paula", 75000, 1993, 12, 20);

        /*=================================
           Implementacion de INSTANCEOF 
        ===================================*/
        if(jefa_Finanzas instanceof Empleado){
            System.out.println("la instancia pertenece a empleado.");
        }

        if(ejemplo instanceof Comparable){
            System.out.println("la instancia es de tipo Comparable.");
        }

        /*probando metos tomar decisiones de la interfaz Jefes*/
        System.out.println(jefa_Finanzas.TomaDecisiones("darlemas vacaciones a los empleados."));
        System.out.println("La jefa "+jefa_Finanzas.getNombre()+" tiene un bono de "+jefa_Finanzas.EstableceBono(3000));

        /*PROBANDO HERENCIA DE INTERFAZ CON UN EMPLEADO NORMAL*/
        System.out.println("El empleado "+misEmpleados[3].getNombre()+" tiene un bono de "+misEmpleados[3].EstableceBono(1500));


        for ( Empleado e : misEmpleados) {
            e.setAumento(5);
        }

        Arrays.sort(misEmpleados);

        for ( Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha_Contrato: "
                    + e.getFechaContrato());
        }
    }
}

/*
============================
       CLASE EMPLEADOS
============================
*/

class Empleado implements Comparable, Trabajadores{
    public Empleado( String nombre,  double sueldo,  int anio,  int mes,  int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
         GregorianCalendar fecha = new GregorianCalendar(anio, mes, dia);
        f_contrato = fecha.getTime();
        id=idSiguiente;
        idSiguiente++;

    }

    public Empleado( String nombre) {
        this(nombre, 35000, 2001, 01, 01);
    }

    public String getNombre() {
    return nombre+" ID: "+id;
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

    public int compareTo(Object o){
        Empleado otroEmpleado=(Empleado) o;

        if(this.sueldo<otroEmpleado.sueldo){
            return -1;
        }else if(this.sueldo>otroEmpleado.sueldo){
            return 1;
        }

        return 0;
    }

    public double EstableceBono(double gratificacion){
        return Trabajadores.bono_base+gratificacion;
    }

    

    private  String nombre;
    private double sueldo;
    private Date f_contrato;
    private int id;
    private static int idSiguiente=1;
}

/*
========================
       CLASE JEFE
========================
*/

class Jefe extends Empleado implements Jefes{
    private  double incentivo;

    public Jefe( String nombre,  double sueldo,  int anio,  int mes,  int dia) {
        super(nombre, sueldo, anio, mes, dia);
        
    }

    public void setIncentivo(double incentivo){
        this.incentivo=incentivo;
    }

    public double getSueldo(){
        double sueldo_jefe=super.getSueldo();
        sueldo_jefe+=incentivo;
        return sueldo_jefe;
    }

    public String TomaDecisiones(String decision){
        return "Esta instancia de jefe ha decidido de tomar la decisión de "+decision;
    }

    public double EstableceBono(double gratificacion){
        double prima=2000;
        return Trabajadores.bono_base+prima+gratificacion;
    }
}