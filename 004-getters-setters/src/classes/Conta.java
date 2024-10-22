package classes;

public class Conta {
    private double saldo;

    public void depositar(double valorDepositado) {
        if (valorDepositado < 0) {
            System.err.println("Inpossível depositar valor negativo");
        } else {
            saldo = saldo + valorDepositado;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
