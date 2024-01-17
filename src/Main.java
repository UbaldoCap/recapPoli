import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        Riunione riunione1 = new Riunione("prima", OffsetDateTime.parse("2024-10-03T13:55:30+01:00"));
        Promemoria promemoria1 = new Promemoria("nuovo", OffsetDateTime.parse("2024-12-03T14:25:30+01:00"));
        Riunione riunione2 = new Riunione("seconda", OffsetDateTime.parse("2020-10-03T10:15:30+01:00"));
        Promemoria promemoria2 = new Promemoria("ponte", OffsetDateTime.parse("2021-12-03T11:10:30+01:00"));
        System.out.println(riunione1.getTipo());
        System.out.println(promemoria1.getTipo());
        GestionEventi gestionEventi = new GestionEventi();
        gestionEventi.addEvento(riunione1);
        gestionEventi.addEvento(promemoria1);
        gestionEventi.addEvento(riunione2);
        gestionEventi.addEvento(promemoria2);
        gestionEventi.eventiFuturi();
        gestionEventi.ordina(OrdineEnum.CRESCENTE);
        gestionEventi.ordina(OrdineEnum.DECRESCENTE);
    }
}
