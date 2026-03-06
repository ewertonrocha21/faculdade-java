package atv2;

public class Relogio {
    int Horas;
    int Minutos;
    int segundos;

    public Relogio(int horas, int minutos, int segundos){
        this.Horas = horas;
        this.Minutos = minutos;
        this.segundos = segundos;
    }

    public void tick(){
        segundos ++;

        if (segundos == 60){
            segundos = 0;
            Minutos ++;

            if (Minutos == 60){
                Minutos = 0;
                Horas += 1;

                if (Horas == 24){
                    Horas = 0;
                }
            }
        }

    }

    public void adicionarSegundos(int n){
        for (int i = 0; i < n; i++){
            tick();
            System.out.println(exibirHorario());
        }
    }

    public String exibirHorario(){
        return String.format("%02d:%02d:%02d", Horas, Minutos, segundos);
    }

    public boolean isMaiorQue(Relogio outro){
        if (this.Horas > outro.Horas) return true;
        if (this.Horas < outro.Horas) return false;

        if (this.Minutos > outro.Minutos) return true;
        if (this.Minutos < outro.Minutos) return false;

        return this.segundos > outro.segundos;
    }
}
