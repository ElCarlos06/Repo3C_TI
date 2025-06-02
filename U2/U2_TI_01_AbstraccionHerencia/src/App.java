import Model.Circle;
import Model.Square;
import Model.Triangle;
import Model.FigureAbs;
import Model.RectangularTriangle;
import Model.EquilateralTriangle;

public class App {
    public static void main(String[] args) throws Exception {
        
        FigureAbs square = new Square(10);
        FigureAbs circle = new Circle(10);
        FigureAbs trirangle = new Triangle(5,20, 10);
        FigureAbs equilateralTriangle = new EquilateralTriangle(4, 3);
        FigureAbs rectangularTriangle = new RectangularTriangle(10, 4, 11);

        FigureAbs[]figures={circle,trirangle,equilateralTriangle,square, rectangularTriangle};

        for (FigureAbs figureAbs : figures){
            System.out.println("la clase es: "+ figureAbs.getClass().getSimpleName());
            System.out.println("El area es: "+ figureAbs.getArea());
            System.out.println("El perimetro es: "+ figureAbs.getPerimeter());
            System.out.println("-----------------------------------------\n");
        }

    }
}
