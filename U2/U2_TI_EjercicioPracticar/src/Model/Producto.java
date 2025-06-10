package Model;
public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    
    public Producto(String codigo, String nombre, int cantidad) {
        setCodigo(codigo);
        this.nombre = nombre;
        setCantidad(cantidad);
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor o igual a 0");
        }
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + "]";
    }
}