package tema_4;

import java.util.regex.*;

public class ejercicio_prueba {
    public static void main(String[] args){
        Pattern p = Pattern.compile("[01]+");
        Matcher m = p.matcher("00001000010010100kj");
        if(m.find()){
            System.out.println("Contiene el patrón");
            System.out.printf("Se inicia en %d y acaba en %d\n", m.start(), m.end());
        }
        else{
            System.out.println("No existe este patrón");
        }
        while(m.find()){
            System.out.println(m.group(0));
        }
        System.out.println("Total de grupos encontrados: " + m.groupCount());
    }    
}
