package tema_4;

public class t7 {
    public static void main(String[] args){
        int contador = 1;
        
        while(contador < 11){
            estrellas(contador);
            contador++;
        }

    }
    static void estrellas(int repeticion){
        for(int i=0; i<repeticion; i++){
            System.out.printf("*");
        }
        System.out.printf("\n");
    }
    
}