package Model;
import java.time.LocalDateTime;

//aqui coloquei basicamente o modelo de sempre (construtor, getters e setters e tostring)
public class Evento {
    private String nomeDoEvento;
    private LocalDateTime horario;

    public Evento(String nomeDoEvento, LocalDateTime horario) {
        this.nomeDoEvento = nomeDoEvento;
        this.horario = horario;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Evento " +
                "nomeDoEvento= '" + nomeDoEvento + '\'' +
                ", horario= " + horario +
                ' ';
    }
}
