public enum CaratteriEnum {
    ASTERISCO ("*"),
    TRATTINO ("-");

    private final String carattere;

    CaratteriEnum(String carattere) {
        this.carattere = carattere;
    }

    public String getCarattere() {
        return carattere;
    }
}
