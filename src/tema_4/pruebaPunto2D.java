package tema_4;

public class pruebaPunto2D {
    public static void main(String[] args){
        Punto2D p1 = new Punto2D(3.0, 2.5);
        Punto2D p2 = new Punto2D();
        Punto2D p3 = new Punto2D(5.2, 3.5);
        Punto2D p4 = new Punto2D();

        System.out.printf("%f - %f\n", p1.getX(), p1.getY());
        System.out.printf("%f - %f\n", p2.getX(), p2.getY());
        System.out.printf("%f - %f\n", p3.getX(), p3.getY());
        System.out.printf("%f - %f\n", p4.getX(), p4.getY());

        Punto2D p5 = p1.suma(p3);
        System.out.printf("%f - %f\n", p5.getX(), p5.getY());
        System.out.println(p1 + "+" + p3 + "=" + p5 );


    }
    
}
