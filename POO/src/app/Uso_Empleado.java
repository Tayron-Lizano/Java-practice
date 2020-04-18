package app;

import java.util.*;

public class Uso_Empleado{
    public static void main (String []args){

        Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12 ,17);
        Empleado empleado2=new Empleado("Anna Lopez", 95000, 1995, 06, 02);
        Empleado empleado3=new Empleado("Maria MArtin", 105000, 2002, 03, 15);

        empleado1.setAumento(5);
        empleado2.setAumento(5);
        empleado3.setAumento(5);

        //String[] miarreglo=new String[5];

        Empleado[] misEmpleados=new Empleado[3];
        misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12 ,17);
        misEmpleados[1]=new Empleado("Anna Lopez", 95000, 1995, 06, 02);
        misEmpleados[2]=new Empleado("Maria MArtin", 105000, 2002, 03, 15);
        
        for(Empleado e: misEmpleados){
            e.setAumento(5);
        }

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: "+e.getNombre()+" Sueldo: "+e.getSueldo()+" Fecha_Contrato: "+e.getFechaContrato());
        }




    }
}


class Empleado{
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia){
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar fecha= new GregorianCalendar(anio, mes, dia);
        f_contrato=fecha.getTime();

    }

    public String getNombre(){
        return nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public Date getFechaContrato(){
        return f_contrato;
    }

    public void setAumento(double porcentaje){
        double aumento = sueldo * porcentaje/100;
        sueldo+=aumento;
    }

    private String nombre;
    private double sueldo;
    private Date f_contrato;
}