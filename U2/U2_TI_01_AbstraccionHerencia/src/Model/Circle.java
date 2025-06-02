package Model;

public class Circle extends FigureAbs{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    ////getters y setters
    public void setRadius(double radius){
        this.radius = radius;

    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        ///double 
        return 2*Math.PI*radius;
    }
}
