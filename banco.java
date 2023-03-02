public class Dinheiro {

    String numeroDaConta;
    String titular;
    int saldo;

    public void deposito() {
        saldo += 100;
    }

    public void saque() {
        saldo -= 190;
    }

    public void imprimirInformacoes() {
        System.out.println("Numero da Conta " + numeroDaConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }
}

public class Main {
    public static void main (String[] args) {
        ContaBancaria conta1 = new ContaBancaria ("12345-6", "Daniel Dosadi", 1000);

        conta1.deposito(500);
        conta1.saque(200);

        conta1.imprimirInformacoes();
    }
}