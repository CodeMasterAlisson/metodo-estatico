package Lab01;

public class AppConta {

    public static void main(String[] args) {

        Conta cA = new Conta();
        Conta cB = new Conta();

        System.out.println("Numero da conta cA: " + cA.getNumero());
        System.out.println("Numero da conta cB: " + cB.getNumero() + "\n");

        cA.depositar(1000);
        cB.depositar(100);

        cA.sacar(100);
        cB.sacar(20);

        System.out.printf("Saldo cA R$ %,3.2f\n", cA.getSaldo());
        System.out.printf("Saldo cB R$ %,3.2f\n" , cB.getSaldo());
    }
}
