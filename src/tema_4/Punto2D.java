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
    public void setPunto(double sum_x, double sum_y) {
        punto[0] = sum_x;
        punto[1] = sum_y;
    }
    public void suma(double x, double y){
        double sum_x = punto[0] + x;
        double sum_y = punto[1] + y;
        double[] nuevo = {sum_x, sum_y};

        //List<Object> lista = new ArrayList<>();
        //lista.add(new Punto2D(sum_x, sum_y));
        //return lista;

    }
   
}

