package Model;

public class Triangle {
    private double base, altura, lado;

    public double getPerimeter(){
        ///double 
        return 2*lado+base;
    }

    public double getArea(){
        return (base*altura)/2;
    }

    ////getters y setters
    public void setLado(double lado){
        this.lado = lado;

    }

    public double getLado(){
        return this.lado;
    }

    public void setAltura(double altura){
        this.altura = altura;

    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base = base;

    }

    public double getBase(){
        return this.base;
    }

}
