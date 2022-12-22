package tema_4;

/*In this program the user writes the sphere radius and one method returns the sphere volume */
import java.util.Scanner;

public class t15 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el radio de la esfera: ");
        double radio = entrada.nextDouble();
        System.out.printf("El volumen de la esfera = %1.2f m³\n", volumenEsfera(radio));    
    }
    
    static double volumenEsfera(double radio){
        double volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
        return volumen;
    }
}
