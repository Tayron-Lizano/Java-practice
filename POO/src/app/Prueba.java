package app;

public class Prueba {
    public static void main(String[] args){
        Empleados trabajador1=new Empleados("Tayron Lizano");
        Empleados trabajador2=new Empleados("Hilda Lizano");
        Empleados trabajador3=new Empleados("Paco");
        Empleados trabajador4=new Empleados("Emma Lizano");

        trabajador1.setCambiaSeccion("RRHH");

        System.out.println(trabajador1.getInfoEmpleado());
        
        System.out.println(trabajador2.getInfoEmpleado());
        
        System.out.println(trabajador3.getInfoEmpleado());
    
        System.out.println(trabajador4.getInfoEmpleado());
    }

}

class Empleados {
    public Empleados(String nombre){
        this.nombre=nombre;
        seccion="Administración";
        id=idSiguiente;
        idSiguiente++;
    }
    public void setCambiaSeccion(String seccion){
        this.seccion=seccion;
    }

    public String getInfoEmpleado(){
        return "el trabajador se llama: "+nombre+" ,pertenece al departamento:  "+seccion+" y el id es: "+id;
    }
    private final String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente=1;
}