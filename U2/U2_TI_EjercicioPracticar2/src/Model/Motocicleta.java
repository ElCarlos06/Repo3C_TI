package Model;
public class Motocicleta extends Vehiculo {
    private boolean tieneCaja;

    public Motocicleta(String placa, String marca, boolean tieneCaja) {
        super(placa, marca);
        this.tieneCaja = tieneCaja;
    }

    

    public boolean isTieneCaja() {
        return tieneCaja;
    }

    public void setTieneCaja(boolean tieneCaja) {
        this.tieneCaja = tieneCaja;
    }
    
}
