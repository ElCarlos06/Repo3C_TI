package Model;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Monto ingresado: "+ monto);
        }
        System.out.println("El saldo es: "+ saldo);
    }

    public boolean retirar(double monto){
        boolean accion = false;
        if (monto > 0 && saldo >= monto) {
            accion = true;
            System.out.println(accion);
            saldo -= monto; 
            System.out.println("Monto retirado: "+ monto);
            System.out.println("Saldo restante: "+ saldo);
        } else {
            System.out.println(accion);
            System.out.println("No hay suficiente saldo.");
        }
        return accion;
    }

    public double getSaldo(){
        return this.saldo;
        
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }


}
