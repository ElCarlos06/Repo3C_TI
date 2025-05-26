package Model;

public class Computadora {
    private String marca = "hp";
    private String modelo;
    private boolean encendida = false;

    public void encender(){
        if(encendida != true){
            encendida = true;
            System.out.println("Encendiendo...");
        }
    }

    public void apagar(){
        if(encendida != false){
            encendida = false;
            System.out.println("Apagando...");
        }
    }

    public String getMarca(){
        return this.marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public boolean getEncendida(){
        return this.encendida;
    }

}
