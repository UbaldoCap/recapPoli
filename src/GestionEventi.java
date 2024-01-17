import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class GestionEventi {
    private final ArrayList<Evento> eventos;

    public GestionEventi() {
        this.eventos = new ArrayList<>();
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void addEvento(Evento evento) {
        if (eventos.contains(evento)) {
            System.out.println("evento già inserito");
        } else {
            eventos.add(evento);
        }
    }
    public void stampaDettgagli() {
        for (Evento evento : eventos) {
            System.out.println(evento.dettagli());
        }
        System.out.println(" ");
    }

    public void eventiFuturi() {
        System.out.println("eventi programmati futuri");
        for (Evento evento : eventos) {
            if (evento.getDataOra().isAfter(OffsetDateTime.now())) {
                System.out.println(evento.dettagli());
            }
        }
        System.out.println(" ");
    }

    public void ordina(OrdineEnum ordineEnum) {
        if (ordineEnum.equals(OrdineEnum.CRESCENTE)) {
            eventos.sort(Comparator.comparing(Evento::getDataOra));
            System.out.println("lista eventi in ordine crescente");
            stampaDettgagli();
        } else {
            eventos.sort(Comparator.comparing(Evento::getDataOra).reversed());
            System.out.println("lista eventi in ordine decrescente");
            stampaDettgagli();
        }
    }
}
