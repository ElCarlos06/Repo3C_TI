package Model;

public class EquilateralTriangle extends FigureAbs{
    private double height, side;

    public EquilateralTriangle(double height, double side){
        this.height = height;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter(){
        return side*3;
    }

    @Override
    public double getArea(){
        return (height*side)/2;
    }
}
