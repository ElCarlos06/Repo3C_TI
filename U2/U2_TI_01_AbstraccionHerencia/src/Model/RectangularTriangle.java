package Model;

public class RectangularTriangle extends FigureAbs{
    private double base, height, hypotenuse;

    public RectangularTriangle(double base, double height, double hypotenuse){
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getPerimeter(){
        return base+height+hypotenuse;
    }

    @Override
    public double getArea(){
        return (height*base)/2;
    }
}
