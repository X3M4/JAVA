package tema_4;

public class PruebaEmpleados {
    public static void main(String[] args){
        Empleado e1 = new Empleado("Pepe",34);
        System.out.println("Nombre: " + e1.getNombre());
        e1.setSueldo(15000);
        e1.setPassword("password");
        
        try{
            System.out.printf("Sueldo = %1.2f\n", e1.getSueldo());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
