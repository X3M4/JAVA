package tema_4;

import java.util.Arrays;
import java.util.Scanner;
/*In this exercise an array is created and every space is occupied by an double number generated randomly.
 * After the user chooses a number called 'n' and it calls the function media for returnning the average of first
 * n numbers.
 */
public class t10 {
    public static void main(String[] args){
        double[] numeros = new double[1];
        Scanner entrada = new Scanner(System.in);
        int contador = 1;

        for(int i = 0; i < 100; i++){
            double numero = Math.random()*10;
            numeros[i] = numero;
            contador++;
            numeros = Arrays.copyOf(numeros, contador);
        }
        for(int i = 0; i < 100; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("Escribe un numero 'n'");
        System.out.printf("La media es = %1.3f\n", media(entrada.nextInt(), numeros));

        
    }
    static double media(int n, double... numeros){
        double sumatorio = 0;
        for(int i = 0; i < n; i++){
            sumatorio += numeros[i];
        }
        return sumatorio / n;
    }
    
}
