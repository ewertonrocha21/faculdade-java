public class ContaCorrente {
    String titular;
    double saldo;
    int numeroConta;

    public ContaCorrente(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println(saldo + " valor depositado com sucesso");
        } else {
            System.out.println("valor invalido");
        }
    }

    public void sacar(double valor){
        if (saldo < 0 || saldo < valor){
            System.out.println("impossivel");
        } else{
            saldo -= valor;
            System.out.println(valor + " valor sacado");
        }
    }

    public void transferir(ContaCorrente destino, double valor){
        if (valor > 0 && valor <= saldo){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("transferencia realizada");
        } else {
            System.out.println("erro na transferencia");
        }
    }

    public double getsaldo(){
        System.out.println("titular:" + titular);
        System.out.println("conta: " + numeroConta);
        System.out.println("saldo: " + saldo);
        return saldo;
    }
}
