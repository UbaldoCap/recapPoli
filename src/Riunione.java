import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Riunione implements Evento{
    private String nome;
    private OffsetDateTime data;

    private EventoEnum eventoEnum;

    public Riunione(String nome, OffsetDateTime data) {
        this.nome = nome;
        this.data = data;
        this.eventoEnum = EventoEnum.RIUNIONE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public EventoEnum getEventoEnum() {
        return eventoEnum;
    }

    public void setEventoEnum(EventoEnum eventoEnum) {
        this.eventoEnum = eventoEnum;
    }

    private StringBuilder allinea(String parte, CaratteriEnum character) {
        StringBuilder stringBuilder = new StringBuilder(" ");
        int nChar = 15 - parte.length();
        stringBuilder.append(character.getCarattere().repeat(Math.max(0, nChar)));
        stringBuilder.append(" ");
        return stringBuilder;
    }

    @Override
    public OffsetDateTime getDataOra() {
        return data;
    }

    @Override
    public EventoEnum getTipo() {
        return eventoEnum;
    }

    @Override
    public String dettagli() {
        return eventoEnum.getColore() + eventoEnum.getDescrizione() + allinea(eventoEnum.getDescrizione(), CaratteriEnum.ASTERISCO)
                + nome + allinea(nome, CaratteriEnum.TRATTINO) + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy : HH.mm")) + "\u001B[0m";
    }
}
