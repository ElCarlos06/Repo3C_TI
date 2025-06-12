public abstract class Empleado {
    private String id;
    private String nombre;
    private double salarioBase;
    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    
    
    /*public Empleado(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double cantidad){
        if(cantidad >0){
            this.saldo = this.saldo +cantidad;
            //es lo mismo que------ saldo+=cantidad; porque solo estan esas variables
        }else{
            System.out.println("La cantidad es muy baja para depositar.");
        }
    }
    public void retirar(double cantidad){
        if (cantidad>0 && cantidad<=saldo) {
            if (cantidad%100==0) {
                saldo -= cantidad; ////tambien se puede usando los get y los set---- setSaldo(getSaldo()-cantidad);
            }else{
                System.out.println("Imposible realizar el retiro.");
            }
        }else{
            System.out.println("No hay suficiente saldo.");
        }

    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getTitulo() {
        return titular;
    }
    public void setTitulo(String titulo) {
        this.titular = titulo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/
}
