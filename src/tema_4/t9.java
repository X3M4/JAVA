package tema_4;

import java.util.Scanner;

public class t9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce el primer número");
    int a = entrada.nextInt();
    System.out.println("Introduce el segundo número");
    int b = entrada.nextInt();
    System.out.println("Introduce el tercer número");
    int c = entrada.nextInt();

    System.out.println("El mayor de los 3 números es: " + mayor(a,b,c));
    }
    
    static int mayor(int a, int b, int c){
        
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else{
            return c;
        }
    }
    
}
