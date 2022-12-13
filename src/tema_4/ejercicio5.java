/*Create a method named media which it accepts a integer array as parameter 
//and it returns a double number with the average of the number ibside the array.
You must use assert to check, at least 2 elements in the array and array not null.*/ 
package tema_4;
import java.util.Arrays;
import java.util.Scanner;
public class ejercicio5 {
    private class Average{
        private static int[] numeros = new int[1];
        private static int contador = 0;
        private static int sumatorio = 0;
        private static double media;

        static void Media(int... nums){
            assert(numeros != null && nums.length >= 2);
            for(int i=0; i < numeros.length; i++){
                sumatorio += numeros[i];
            }
            media = (double)sumatorio / contador;
            System.out.printf("La media es = %1.2f\n", media);
        }

        static void numero(int num){
            numeros[contador] = num;
            contador++;
            numeros = Arrays.copyOf(numeros, contador + 1);
        }
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int entero;
        System.out.println("ESCRIBE NÚMEROS ESTEROS. PARA FINALIZAR ESCRIBE fin");
        while(true){
            String entero_string = entrada.next();
            if(entero_string.equals("fin")){
                Average.Media(Average.numeros);
                break;
            }
            else {
                entero = Integer.parseInt(entero_string);
                Average.numero(entero);
            }
        }
    }
}
