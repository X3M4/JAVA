package tema_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ejercicio3 {
    public class Ejercicio{
        private static int[] numeros = new int[1];
        private static int contador = 0;
        private static int contador_string = 0;
        private static String[] frases = new String[1];
        
        static void mayor(int num){
            numeros[contador] = num;
            contador++;
            numeros = Arrays.copyOf(numeros, contador+1);
        }

        static void mayor(String frase){
            frases[contador_string] = frase;
            contador_string++;
            frases = Arrays.copyOf(frases, contador_string+1);
        }
       
        static void orden(int... nums){
            Arrays.sort(numeros);
            System.out.println("El número mayor es:" + numeros[numeros.length-1]);
        }
        
        static void orden(String... frases){
            frases = Arrays.copyOf(frases, contador_string-1);
            Arrays.sort(frases, Comparator.naturalOrder());
            System.out.println("El String más largo es: "+ frases[contador_string-2]);
        }
    }
    
    public static void main(String[] args){
        String num = "";
        int numero = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe enteros. Para acabar escribe fin");

        while(true){
            if(num.equals("fin")){
                Ejercicio.orden(Ejercicio.numeros);
                Ejercicio.orden(Ejercicio.frases);
                break;
            }
            num = entrada.nextLine();
            try {
                numero = Integer.parseInt(num);
                Ejercicio.mayor(numero);

            }catch(Exception e){
                Ejercicio.mayor(num);
            }
            
        }
        
    }
    
}
