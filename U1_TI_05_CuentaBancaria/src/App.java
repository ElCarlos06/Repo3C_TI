import Model.CuentaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria accountBank = new CuentaBancaria();

        accountBank.depositar(1000);
        accountBank.getSaldo();

        accountBank.retirar(2000);
        accountBank.getSaldo();

        accountBank.retirar(1000);
        accountBank.getSaldo();

    }
}
