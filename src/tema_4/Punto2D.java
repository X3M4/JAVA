package tema_4;

public class Punto2D {
    
    private double[] punto = new double[2];

   
   
    public Punto2D() {
        this.punto[0] = 0;
        this.punto[1] = 0;
    }
    public Punto2D(double x, double y) {
        this.punto[0] = x;
        this.punto[1] = y;
    }

    public double getX(){
        return punto[0];
    }

    public double getY(){
        return punto[1];
    }
    public Punto2D suma(Punto2D p){
        double sum_x = punto[0] + p.getX();
        double sum_y = punto[1] + p.getY();
        Punto2D nuevo = new Punto2D(sum_x, sum_y);
        return nuevo;
    }
   
}

