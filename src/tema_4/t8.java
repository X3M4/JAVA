package tema_4;

import java.util.Scanner;

public class t8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una palabra o frase");
        String frase = entrada.nextLine();
        System.out.println("Escribe un carácter");
        String string_test = entrada.next();
        try{
            char caracter = string_test.charAt(string_test.length()-1);
            System.out.printf("El carácter '%s' aparece %d veces\n", caracter, cuentaLetras(frase, caracter));

        }catch(Exception e){
            System.out.println("No has escrito un caracter");
        }
    }
    static int cuentaLetras(String frase, char caracter){
        char[] letras = new char[frase.length()];
        letras = frase.toCharArray();
        int contador = 0;

        for(int i = 0; i < letras.length; i++){
            if(caracter == letras[i]) contador++;
        }
        return contador;
    }
    
}
