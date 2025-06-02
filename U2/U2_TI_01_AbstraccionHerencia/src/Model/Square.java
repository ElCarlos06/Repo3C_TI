package Model;

public class Square extends FigureAbs {

    public Square(double side) {
        this.side = side;
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return side * side;
    }

    @Override
    public double getPerimeter(){
        return side * 4;
    }
    

}