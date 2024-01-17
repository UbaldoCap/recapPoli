public enum EventoEnum {
    RIUNIONE ("Riunione", "\u001B[31m"),
    PROMEMORIA ("Promemoria", "\u001B[32m");

    private final String descrizione;

    private final String colore;

    EventoEnum(String descrizione, String colore) {
        this.descrizione = descrizione;
        this.colore = colore;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getColore() {
        return colore;
    }
}
