
/*In this exercise we have this code:
 * // File Empleado.java
In this branch I'll modify last exercise
 */
package tema_4;

public class Empleado {
    static String nombre;
    int edad;

    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public static String getNombre(){
        return nombre;
    }
    
}