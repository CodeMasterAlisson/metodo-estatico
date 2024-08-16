package Lab01;

public class Conta {

    private static double taxaDeImposto = 1.01; // já calcula tudo
    private static int numeroConta = 1000;
    private int numero;
    private double saldo;

    public Conta(){
        this.numero = ++Conta.numeroConta;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if(valor > 0){
            this.setSaldo(valor);
        }
    }

    public void sacar(double valor) {
        double taxa = valor * Conta.taxaDeImposto;
        if (valor > 0 && this.getSaldo() > (valor * taxa)) {
            this.setSaldo(this.getSaldo() - (valor*taxa));
        }
    }
}
