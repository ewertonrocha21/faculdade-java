package atv3;

public class Pessoa {
    private String nome;
    private int idade;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // isso nao ira funcionar pois nao é um metodo set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

