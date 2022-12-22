
/*In this exercise we have this code:
 * // File Empleado.java
In this branch I set a password for updating or getting
salario, edad (higher than 18 years) and other variables from Empleado
class.
 */
package tema_4;

import java.util.Scanner;
public class Empleado {
    Scanner entrada = new Scanner(System.in);
    static String nombre;
    int edad;
    private static double sueldo;
    private static String password = "password";

    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public static String getNombre(){
        return nombre;
    }

    public void setSueldo(double sueldo){
        Empleado.sueldo = sueldo;
    }

    public double getSueldo() throws IllegalArgumentException{
        System.out.println("Escriba el password del empleado");
        String outPassword = entrada.next();
        
        if(!password.equals(outPassword)){
            throw new IllegalArgumentException ("PASSWORD INCORRECTO");
        }
        else{
            return sueldo;
        }
        
    }

}