public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Ewerton", 123);
        ContaCorrente conta2 = new ContaCorrente("leticia", 456);

        // depositar
        conta1.depositar(1000);
        conta2.depositar(1000);

        // saque
        conta1.sacar(100);

        // transferir
        conta2.transferir(conta1, 200);

        // sacar a mais do que tem em saldo

        conta1.sacar(5000);

        // dados finais
        conta1.getsaldo();
        System.out.println();
        conta2.getsaldo();
    }
}
