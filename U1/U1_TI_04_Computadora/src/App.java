import Model.Computadora;

public class App {
    public static void main(String[] args) throws Exception {
        Computadora pc = new Computadora();

        pc.encender();
        pc.setModelo("g55");
        pc.encender();
        pc.apagar();
    }
}
