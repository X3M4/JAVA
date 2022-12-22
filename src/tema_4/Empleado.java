
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

        if(edad < 18){
            System.out.printf("El empleado %s es menor de edad\n", nombre);
        }
        else{
            this.edad = edad;
        }
        
    }

    public static String getNombre(){
        return nombre;
    }
    //Necesitas el pasword para cambiar el sueldo
    public void setSueldo(double sueldo){
        String outPass = outPassword();
        
        if(!outPass.equals(password)){
            throw new IllegalArgumentException ("PASSWORD INCORRECTO");
        }
        else{
            Empleado.sueldo = sueldo;
        }
    }
    //Pasword necesario para obtener el sueldo
    public double getSueldo() throws IllegalArgumentException{
        String outPass = outPassword();
        
        if(!outPass.equals(password)){
            throw new IllegalArgumentException ("PASSWORD INCORRECTO");
        }
        else{
            return sueldo;
        }
        
    }
    //Método para comprobar el password
    private String outPassword(){
        System.out.println("Escriba el password del empleado");
        String outPassword = entrada.next();
        return outPassword;
    }

}