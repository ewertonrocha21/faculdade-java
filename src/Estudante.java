public class Estudante {
    String nome;
    int matricula;
    double[] notas;

    public Estudante(String nome, int matricula, double... notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }
    public void setNotas(double...notas){
        this.notas = notas;
    }

    public double getMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        return media;
    }

    public String getSituacao() {
        double r = getMedia();
        if (r > 7) {
            return "Aprovado";
        } else if (r >= 5){
            return "Final";
        } else{
            return "Reprovado";
        }
    }
    public double getNota(int pos){
        if (pos >= notas.length || pos < 0){
            return -1;
        }
        return notas[pos];
    }
}
