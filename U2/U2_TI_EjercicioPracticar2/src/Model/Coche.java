package Model;
public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String placa, String marca, int numeroPuertas) {
        super(placa, marca);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    
}
