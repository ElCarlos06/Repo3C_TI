public class Pedido {
    private int id;
    private double[] precios;

    
    public Pedido(int id, double[] precios) {
        this.id = id;
        this.precios = precios;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double[] getPrecios() {
        return precios;
    }


    public void setPrecios(double[] precios) {
        this.precios = precios;
    }

    public double calcularTotal() {
        double suma=0;
        for(int i=0 ; i<precios.length; i++){
            suma += precios[i];
        }
        return suma;
    }
    
}
