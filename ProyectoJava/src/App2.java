import Model.Circle;
import Model.Square;
import Model.Triangle;

public class App2 {
    public static void main(String[] args) throws Exception {
        
        Square sq = new Square();
        sq.setLado(10);
        sq.setMessage("");
        System.out.println(sq.getLado());
        double squarePerimeter = sq.getPerimeter();
        System.out.println(squarePerimeter);
        double squareArea = sq.getArea();
        System.out.println(squareArea);
        System.out.println(sq.getArea());
        System.out.println();
        
        Circle cr = new Circle();
        cr.setRadio(10);
        System.out.println(cr.getRadio());
        System.out.println(cr.getPerimeter());
        System.out.println(cr.getArea());
        
        Triangle tr = new Triangle();
        tr.setAltura(10);
        tr.setBase(10);
        tr.setLado(11);
        System.out.println(tr.getArea());
        System.out.println(tr.getPerimeter());
    }
}
