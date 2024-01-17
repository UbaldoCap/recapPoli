import java.time.OffsetDateTime;

public interface Evento {
    OffsetDateTime getDataOra();
    EventoEnum getTipo();
    String dettagli();
}
