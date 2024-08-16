package Lab01;

public class Conta {

    private static double taxaDeImposto = 0.01;
    private static int numeroConta = 1000;
    private int numero;
    private double saldo;

    public Conta(){
        this.setNumero(++Conta.numeroConta);
        this.setSaldo(0);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        double valorComImposto = taxa + valor;
        if (valor > 0 && this.getSaldo() >= valorComImposto) {
            this.setSaldo(this.getSaldo() - valorComImposto);
        }
    }
}
