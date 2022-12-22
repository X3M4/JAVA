package tema_4;

public class PruebaEmpleados {
    public static void main(String[] args){
        Empleado e1 = new Empleado("Pepe",34);
        Empleado e2 = new Empleado("Andrés", 17);
        e1.setSueldo(15000);
        
        try{
            System.out.printf("Sueldo = %1.2f\n", e1.getSueldo());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
