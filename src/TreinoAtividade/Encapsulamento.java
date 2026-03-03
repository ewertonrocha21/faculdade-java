package TreinoAtividade;

public class Encapsulamento {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println(nome);
        System.out.println(idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
