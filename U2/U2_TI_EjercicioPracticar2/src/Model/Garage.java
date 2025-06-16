package Model;

public class Garage {
    private Vehiculo[] espacios;


    public Garage(int numEspacios) {
        espacios = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo v){
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] == null) {
                espacios[i] = v;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(String placa){
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i].getPlaca().equals(placa)) {
                espacios[i]=null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculos(){
        int contar=0;
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo!=null) {
                contar++;   
            }
        }
        return contar;
    }
    public Vehiculo[] getEspacios() {
        return espacios;
    }

    public void setEspacios(Vehiculo[] espacios) {
        this.espacios = espacios;
    }

    
}
