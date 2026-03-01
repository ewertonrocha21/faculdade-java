public class MainTemperatura {
    public static void main(String[] args) {
        Temperatura t = new Temperatura(30, "C");


        t.imprimeComEscala();
        t.toFahrenheit().imprimeComEscala();
        t.toKelvin().imprimeComEscala();
    }
}
