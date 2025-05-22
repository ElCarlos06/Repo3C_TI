package Model;

public class Square {

    private double lado;
    private String message;

    public double getPerimeter(){
        ///double 
        return lado*4;
    }

    public double getArea(){
            ///validar que this.message tenga un valor
            if(!this.message.isEmpty()){
                getSecretMessage();
            }
        return lado*lado;
    }

    ////getters y setters
    public void setLado(double lado){
        this.lado = lado;

    }

    public double getLado(){
        return this.lado;
    }

    public void setMessage(String message){
        this.message=message;
    } 
    

    private void getSecretMessage(){
        System.out.println("Este metodo solo es accesible dentri de ka ckase, pero no desde afuera");
    }
}
