package de.example.konto_klasse_testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto konto1 = new Konto("DE1234567", 100);
    Konto konto2 = new Konto("DE12345678", 100);

    @Test
    @DisplayName("gib den aktuellen Saldo zurück")
    void getSaldo() {
        assertEquals(100, konto1.getSaldo());
    }

    @Test
    @DisplayName("gib die Kontonummer zurück")
    void getKontonummer() {
        assertEquals("DE1234567", konto1.getKontonummer());
    }


    @Test
    @DisplayName("erhöht den Saldo auf 200")
    void einzahlen() {
        konto1.einzahlen(100);
        assertEquals(200, konto1.getSaldo());
    }

    @Test
    @DisplayName("verringert den Saldo auf 0")
    void abheben() {
        konto1.abheben(100);
        assertEquals(0,konto1.getSaldo());
    }

    @Test
    @DisplayName("verringert den Saldo von konto1 auf 0 und erhöht Saldo von konto2 auf 200")
    void ueberweisen() {
        konto1.ueberweisen(konto2, 100);
        assertEquals(0,konto1.getSaldo());
        assertEquals(200,konto2.getSaldo());
    }

    @Test
    @DisplayName("sollte einen Fehler werfen, weil der einzuzahlende Betrag nicht negativ sein darf")
    void einzahlen1(){
        assertThrows(IllegalArgumentException.class, () -> konto1.einzahlen(-100));
    }

    @Test
    @DisplayName("sollte einen Fehler werfen, weil der auszuzahlende Betrag nicht negativ sein darf")
    void abheben2(){
        assertThrows(IllegalArgumentException.class, () -> konto1.abheben(-100));
    }

    @Test
    @DisplayName("sollte einen Fehler werfen, weil Saldo darf nicht negativ werden")
    void abheben3(){
        assertThrows(IllegalArgumentException.class, () -> konto1.abheben(200));
    }
}