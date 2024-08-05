package de.example.konto_klasse_testing;

public class Konto {

    private final String kontonummer;
    private double saldo;

    public Konto(String kontonummer, double anfangssaldo) {
        this.kontonummer = kontonummer;
        this.saldo = anfangssaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void einzahlen(double betrag) {
        if (pruefeBetrag(betrag)) this.saldo += betrag;
    }

    public void abheben(double betrag) {
        if (pruefeBetrag(betrag) && pruefeLiquiditaet(betrag)) {
            this.saldo -= betrag;
        }
    }

    public void ueberweisen(Konto zielKonto, double betrag){
        if (pruefeBetrag(betrag) && pruefeLiquiditaet(betrag)) {
            zielKonto.setSaldo(zielKonto.getSaldo()+betrag);
            this.saldo -= betrag;
        }
    }

    private boolean pruefeBetrag(double betrag){
        if (betrag < 0) throw new IllegalArgumentException("Der abzuhebende Betrag muss positiv sein");
        return true;
    }

    private boolean pruefeLiquiditaet(double betrag){
        if ((this.saldo - betrag) < 0)
            throw new IllegalArgumentException("Es kann nicht mehr abgehoben werden, als verfügbar ist");
        return true;
    }

}
