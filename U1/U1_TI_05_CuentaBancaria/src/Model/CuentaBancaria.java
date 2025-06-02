package Model;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Monto ingresado: "+ monto);
        }

    }

    public boolean retirar(double monto){
        boolean accion = false;
        if (monto > 0 && saldo >= monto) {
            accion = true;
            saldo -= monto; 
            System.out.println(accion + ".\t Monto retirado: "+ monto);
        } else {
            System.out.println(accion + ".\t No hay suficiente saldo.");
        }
        return accion;
    }

    public double getSaldo(){
        System.out.println("Saldo actual: "+ saldo);
        return this.saldo;
        
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }


}
