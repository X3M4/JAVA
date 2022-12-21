package tema_4;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5b {
    private class Average{
        private static int[] numeros = new int[1];
        private static int contador = 0;
        private static int sumatorio = 0;
        private static double media;

        static void Media(int... nums) throws Exception {
            if(numeros == null | nums.length < 2){
                throw new Exception("Debe haber al menos 2 elementos en el array y su contenido no ser null");
            }else{
                for(int i=0; i < numeros.length; i++){
                    sumatorio += numeros[i];
                }
                media = (double)sumatorio / contador;
                System.out.printf("La media es = %1.2f\n", media); 
            } 
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
                Average.numeros = Arrays.copyOf(Average.numeros, Average.numeros.length- 1); 
                try{
                    Average.Media(Average.numeros);
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    break;
                }          
            }    
            
            else{
                entero = Integer.parseInt(entero_string);
                Average.numero(entero);
            }
        }    
    }
}