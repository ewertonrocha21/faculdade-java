package atv3;

public class Pessoa01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // set
        pessoa.setNome("ewerton");
        pessoa.setIdade(19);

        // get
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
