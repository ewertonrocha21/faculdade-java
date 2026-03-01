public class MainRelogio {
    public static void main(String[] args) {
        Relogio R1 = new Relogio(23, 59,50);
        Relogio R2 = new Relogio(10,10,10);

        // format para printar o relogio 1
        R1.tick();
        System.out.printf("%02d:%02d:%02d\n", R1.Horas, R1.Minutos, R1.segundos);

        // adicionando 5 segundos
        R1.adicionarSegundos(5);

        // verificando se r1 maior que r2
        if (R1.isMaiorQue(R2)){
            System.out.println("Relogio 1 maior que Relogio 2");
        } else {
            System.out.println("Relogio 2 maior que Relogio 1");
        }
    }
}
