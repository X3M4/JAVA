package tema_4;

public class pruebaPunto2D {
    public static void main(String[] args){
        Punto2D p1 = new Punto2D(3.0, 2.5);
        Punto2D p2 = new Punto2D();

        System.out.printf("%f - %f\n", p1.getX(), p1.getY());
        System.out.printf("%f - %f\n", p2.getX(), p2.getY());

    }
    
}
