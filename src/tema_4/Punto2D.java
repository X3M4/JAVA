package tema_4;

public class Punto2D {
    
    private static double[] punto = new double[2];

   
   
    public Punto2D() {
        Punto2D.punto[0] = 0;
        Punto2D.punto[1] = 0;
    }
    public Punto2D(double x, double y) {
        Punto2D.punto[0] = x;
        Punto2D.punto[1] = y;
    }

    public double getX(){
        return Punto2D.punto[0];
    }

    public double getY(){
        return Punto2D.punto[1];
    }
    public void setPunto(double sum_x, double sum_y) {
        Punto2D.punto[0] = sum_x;
        Punto2D.punto[1] = sum_y;
    }
   

}



