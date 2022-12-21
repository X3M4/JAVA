package tema_4;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el número de estrellas a imprimir");
        int numero = entrada.nextInt();
        estrellas(numero);
        

    }
    static void estrellas(int repeticion){
        for(int i=0; i<repeticion; i++){
            System.out.printf("*");
        }
        System.out.printf("\n");
    }
    
}
