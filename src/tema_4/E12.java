package tema_4;

import java.lang.StringBuilder;
public class E12 {
    public static void main(String[] args){
        capitaliza("");
    }
    
    public static StringBuilder capitaliza(String entrada){
        if(entrada.isEmpty()){
            System.out.println("Debe pasar la frase a capitalizar");
        }
        char[] caracter = entrada.toCharArray();
        StringBuilder sb = new StringBuilder();
        caracter[0] = Character.toUpperCase(caracter[0]);
        for(int i=0; i<caracter.length; i++){
            if(caracter[i] == ' ' || caracter[i] == '.' || caracter[i] == ','){
                caracter[i+1] = Character.toUpperCase(caracter[i+1]);
            }
            sb.append(caracter[i]);
        }

        return sb;  
    }
}

