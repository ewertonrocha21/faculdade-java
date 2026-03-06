package atv2;

public class Q1 {
    public static void main(String[] args) {
        // aqui ele pega o valor minimo e maximo de cada tipo primitivo escolhidos
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE + " valor minimo: " + Byte.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE + " valor minimo: " + Short.MIN_VALUE);
        System.out.println("valor maximo int: " + Integer.MAX_VALUE + " valor minimo: " + Integer.MIN_VALUE);

        // nos cassos abaixo acontece overflow ultrapassa o valor maximo de cada caso
        byte a = Byte.MAX_VALUE;
        byte overflowByte = (byte)(a + 1);
        System.out.println("Byte MAX + 1: " + overflowByte);

        // ele pega o maior numero do tipo e adiciona um levando o numero a ser o min dele
        short b = Short.MAX_VALUE;
        short overflowShort = (short)(b + 1);
        System.out.println("Short MAX + 1: " + overflowShort);

        int c = Byte.MAX_VALUE;
        int overflowInt = (int)(c + 1);
        System.out.println("Int MAX + 1: " + overflowByte);
    }
}
