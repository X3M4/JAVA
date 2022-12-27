package tema_4;


public class Punto2D {
    
    private double[] punto = new double[2];

    public Punto2D() {
        setX();
        setY();
    }
    public Punto2D(double x, double y) {
        setX(x);
        setY(y);
    }
    public void setX(){
        this.punto[0] = 0;
    }

    public  void setY(){
        this.punto[1] = 0;
    }

    public void setX(double x){
        this.punto[0] = x;
    }

    public void setY(double y){
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
    @Override
    public String toString() {
        return String.format("(%f - %f)", getX(), getY());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(obj instanceof Punto2D){
            Punto2D otro = (Punto2D)obj;
            if(getX() == otro.getX() && getY() == otro.getY()) return true;
        }
        return false;

    }
   
}

