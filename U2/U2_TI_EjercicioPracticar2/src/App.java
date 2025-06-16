import Model.Vehiculo;
import Model.Coche;
import Model.Garage;
import Model.Motocicleta;

public class App {
    public static void main(String[] args) throws Exception {
        Garage garage = new Garage(4);

        Vehiculo coche1 = new Coche("CH-001", "Toyota", 4);
        Vehiculo moto1 = new Motocicleta("MT-001", "Yamaha", false);
        Vehiculo coche2 = new Coche("CH-002", "Ford", 4);
        Vehiculo moto2 = new Motocicleta("MT-002", "Italika", true);

        garage.estacionar(coche1);
        garage.estacionar(moto1);
        garage.estacionar(coche2);
        garage.estacionar(moto2);

        System.out.println("Placa1: "+coche1.getPlaca()+"   Marca: "+coche1.getMarca());
        System.out.println("Placa2: "+moto1.getPlaca()+"   Marca: "+moto1.getMarca());
        System.out.println("Placa3: "+coche2.getPlaca()+"   Marca: "+coche2.getMarca());
        System.out.println("Placa4: "+moto2.getPlaca()+"   Marca: "+moto2.getMarca());
        System.out.println("--------------------------");
        System.out.println("Vehiculos estacionados: "+garage.contarVehiculos());
        garage.retirar("MT-001");
        System.out.println("Vehiculo retirado.");
        System.out.println("Vehiculos estacionados: "+garage.contarVehiculos());

    }
}