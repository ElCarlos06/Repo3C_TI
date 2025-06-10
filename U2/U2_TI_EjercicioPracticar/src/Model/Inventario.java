package Model;

public class Inventario {
    private Producto[] stock;
    
    public Inventario(int tamano) {
        stock = new Producto[tamano];
    }
    
    // Agrega el producto en la primera posición disponible (null).
    // Retorna true si pudo agregarlo, false si el inventario está lleno.
    public boolean agregarProducto(Producto p) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = p;
                return true;
            }
        }
        return false;
    }
    
    // Busca por código y elimina (pone en null) el producto encontrado.
    // Retorna true si lo elimina, false si no lo encuentra.
    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                stock[i] = null;
                return true;
            }
        }
        return false;
    }
    
    // Retorna el producto cuyo código coincide, o null si no se encuentra.
    public Producto buscar(String codigo) {
        for (Producto p : stock) {
            if (p != null && p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
    
    // Suma las cantidades de todos los productos no nulos en el inventario.
    public int totalItems() {
        int total = 0;
        for (Producto p : stock) {
            if (p != null) {
                total += p.getCantidad();
            }
        }
        return total;
    }
}