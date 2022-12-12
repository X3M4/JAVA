package tema_4;
import java.util.Arrays;
public class ejercicio5 {
    private class Media{
        private static int[] numeros = new int[1];
        private static int contador = 0;
        private static int sumatorio = 0;
        private static double media;

        static double Sumatorio(int... nums){
            assert(numeros != null && nums.length >= 2);
            for(int i=0; i < numeros.length; i++){
                sumatorio += numeros[i];
            }
            media = sumatorio / numeros.length;
            return media;
        }

        static void numero(int num){
            numeros[contador] = num;
            contador++;
            numeros = Arrays.copyOf(numeros, contador + 1);
        }
    }
    public static void main(String[] args){

    }
}
