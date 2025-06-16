package Model;
public abstract class Vehiculo {
    private String placa;
    private String marca;
    public String getPlaca() {
        return placa;
    }
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    };

}
