
/*In this exercise we have this code:
 * // File Empleado.java
Public class empleado {
String nombre;
int edad;
}
// File PruebaEmpleados.java
public class PruebaEmpleados {
public static void main(String[] args) {
Empleado e1 = new Empleado();
System.out.println( e1.edad );
e1.edad = 14;
}
}
I need to modify the code for doing the age obligatory
 */
package tema_4;

public class Empleado {
    String nombre;
    int edad;

    public Empleado(int edad){
        this.edad = edad;
    }
    
}