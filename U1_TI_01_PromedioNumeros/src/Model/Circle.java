package Model;

public class Circle {

    private double radio;

    public double getPerimeter(){
        ///double 
        return 2*3.14*radio;
    }

    public double getArea(){
        return 3.14*(radio*radio);
    }

    ////getters y setters
    public void setRadio(double radio){
        this.radio = radio;

    }

    public double getRadio(){
        return this.radio;
    }
}
