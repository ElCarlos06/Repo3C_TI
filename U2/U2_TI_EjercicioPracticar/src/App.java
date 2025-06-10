import Model.Inventario;
import Model.Producto;

public class App {
    public static void main(String[] args) {
        // Crea un inventario de tamaño 3.
        Inventario inventario = new Inventario(3);
        
        // Se crean 4 productos.
        Producto prod1 = new Producto("P001", "Producto 1", 10);
        Producto prod2 = new Producto("P002", "Producto 2", 5);
        Producto prod3 = new Producto("P003", "Producto 3", 2);
        Producto prod4 = new Producto("P004", "Producto 4", 3);
        
        // Se agrega el primer producto.
        boolean agregado = inventario.agregarProducto(prod1);
        System.out.println("Agregado prod1: " + agregado + " - Total items: " + inventario.totalItems());
        
        // Se agrega el segundo producto.
        agregado = inventario.agregarProducto(prod2);
        System.out.println("Agregado prod2: " + agregado + " - Total items: " + inventario.totalItems());
        
        // Se agrega el tercer producto.
        agregado = inventario.agregarProducto(prod3);
        System.out.println("Agregado prod3: " + agregado + " - Total items: " + inventario.totalItems());
        
        // Se intenta agregar un cuarto producto (debe fallar porque el inventario está lleno).
        agregado = inventario.agregarProducto(prod4);
        System.out.println("Agregado prod4: " + agregado + " - Total items: " + inventario.totalItems());
        
        // Se busca un producto existente (P002) y uno que no existe (P005).
        Producto buscado = inventario.buscar("P002");
        System.out.println("\nBuscar P002: " + (buscado != null ? buscado : "No encontrado"));
        
        buscado = inventario.buscar("P005");
        System.out.println("Buscar P005: " + (buscado != null ? buscado : "No encontrado"));
        
        // Se elimina un producto (P001).
        boolean eliminado = inventario.eliminarProducto("P001");
        System.out.println("\nEliminado P001: " + eliminado + " - Total items: " + inventario.totalItems());
        
        // Ahora que hay espacio, se vuelve a agregar el producto 4.
        agregado = inventario.agregarProducto(prod4);
        System.out.println("Reagregado prod4: " + agregado + " - Total items: " + inventario.totalItems());
    }
}