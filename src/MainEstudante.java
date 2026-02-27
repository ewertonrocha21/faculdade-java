public class MainEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("matheus", 1234);

        estudante.setNotas(10, 8, 7, 8);
        System.out.println(estudante.getSituacao());
        System.out.println(estudante.getNota(3));

    }
}
