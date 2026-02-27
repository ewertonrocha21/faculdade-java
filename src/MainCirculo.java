public class MainCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        Circulo c2 = new Circulo(8);

        //exibir dados c1
        c1.exbirdados();

        // exbir dados c2
        c2.exbirdados();

        // c1 contem c2?
        c1.contemOutro(c2);

        // c2 contem c1?
        c2.contemOutro(c1);

        Circulo maior = c1.maior(c2);
        maior.exbirdados();
    }
}
