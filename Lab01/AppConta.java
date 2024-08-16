package Lab01;

public class AppConta {

    public static void main(String[] args) {

        Conta cA = new Conta();
        Conta cB = new Conta();

        System.out.println(cA.getNumero());
        System.out.println(cB.getNumero());

        System.out.println();

        cA.depositar(1000);
        cB.depositar(100);

        cA.sacar(100);
        cB.sacar(20);

        System.out.println("Saldo cA " + cA.getSaldo());
        System.out.println("Saldo cB " + cA.getSaldo());
    }
}
