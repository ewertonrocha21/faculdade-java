public class Circulo {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * raio;
    }

    public boolean contemOutro(Circulo outro){
        return this.raio > outro.raio;
    }

    public Circulo maior(Circulo outro){
        if (this.raio >= outro.raio){
            return this;
        } else{
            return outro;
        }
    }
    public void exbirdados(){
        System.out.println(raio);
        System.out.println(calcularArea());
        System.out.println(calcularCircunferencia());
    }
}
