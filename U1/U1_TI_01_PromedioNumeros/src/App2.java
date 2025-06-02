import Model.Circle;
import Model.Square;
import Model.Triangle;

public class App2 {
    public static void main(String[] args) throws Exception {
        
        Square sq = new Square();
        sq.setLado(10);
        sq.setMessage("");
        System.out.println("Lado del cuadrado: " + sq.getLado());
        double squarePerimeter = sq.getPerimeter();
        System.out.println("Perimetro de cuadrado: " + squarePerimeter);
        double squareArea = sq.getArea();
        System.out.println("area dek cuadrado: " + squareArea);
        System.out.println(sq.getArea());
        
        Circle cr = new Circle();
        cr.setRadio(10);
        System.out.println("Radio del circulo: " + cr.getRadio());
        System.out.println("Perimetro del circulo: " + cr.getPerimeter());
        System.out.println("Area del circulo: " + cr.getArea());
        
        Triangle tr = new Triangle();
        tr.setAltura(10);
        tr.setBase(10);
        tr.setLado(11);
        System.out.println("Lado del traingulo: " + tr.getLado());
        System.out.println("Area del traingulo: " + tr.getArea());
        System.out.println("Perimetro del traingulo: " + tr.getPerimeter());
    }
}
