package tema_4;

import java.util.Scanner;
import java.util.regex.*;

public class ejercicio8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la expresión regular");
        String er = entrada.next();
        System.out.println("Escribe el texto: ");
        String texto = entrada.next();

        int contar = contarMatches(er, texto);
        System.out.printf("Se repite %d veces\n", contar);
    }

    public static int contarMatches(String er, String texto){
        int contador = 0;
        Pattern p = Pattern.compile(er);
        Matcher m = p.matcher(texto);
        while(m.find()){
            contador++;
        }
        return contador;
    }
}
