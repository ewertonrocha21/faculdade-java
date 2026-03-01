public class Temperatura {

    double valor;
    String escala;

    // aqui é o construtor
    public Temperatura(double valor, String escala) {
        if (!escala.equals("C") && !escala.equals("F") && !escala.equals("K")) {
            System.out.println("Escala inválida");
            return;
        }
        if (escala.equals("K") && valor < 0) {
            System.out.println("Temperatura em Kelvin não pode ser negativa");
            return;
        }
        this.valor = valor;
        this.escala = escala;
    }

    public Temperatura toCelsius() {
        double c = valor;
        if (escala.equals("F")) {
            c = (valor - 32) * 5 / 9;
        }
        if (escala.equals("K")) {
            c = valor - 273.15;
        }
        return new Temperatura(c, "C");
    }

    public Temperatura toFahrenheit() {
        double f = valor;
        if (escala.equals("C")) {
            f = (valor * 9 / 5) + 32;
        }
        if (escala.equals("K")) {
            f = (valor - 273.15) * 9 / 5 + 32;
        }
        return new Temperatura(f, "F");
    }

    public Temperatura toKelvin() {
        double k = valor;
        if (escala.equals("C")) {
            k = valor + 273.15;
        }
        if (escala.equals("F")) {
            k = (valor - 32) * 5 / 9 + 273.15;
        }
        if (k < 0) {
            System.out.println("Temperatura em Kelvin não pode ser negativa");
            return null;
        }
        return new Temperatura(k, "K");
    }

    // impressao
    public void imprimeComEscala() {
        System.out.println(valor + " " + escala);
    }
}