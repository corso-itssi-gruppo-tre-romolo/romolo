package it.lazio.model;

import java.util.ArrayList;
import java.util.List;

public class ImpiantoElettrico {
    // Classe per rappresentare una riga dell'impianto elettrico
    static class Riga {
        String codice;
        String descrizione;
        int quantita;
        double prezzoUnitario;
        double prezzoTotale;

        // Costruttore
        public Riga(String codice, String descrizione, int quantita, double prezzoUnitario) {
            this.codice = codice;
            this.descrizione = descrizione;
            this.quantita = quantita;
            this.prezzoUnitario = prezzoUnitario;
            this.prezzoTotale = quantita * prezzoUnitario;
        }

        // Override del metodo toString per la stampa
        @Override
        public String toString() {
            return String.format("%s %s x %.2f = € %.2f", descrizione, quantita, prezzoUnitario, prezzoTotale);
        }
    }

    public static void main(String[] args) {
        // Lista per memorizzare le righe dell'impianto elettrico
        List<Riga> righeImpianto = new ArrayList<>();

        // Esempi di righe dell'impianto elettrico
        righeImpianto.add(new Riga("D 1.01.1.a", "Punto luce", 2, 15.49));
        righeImpianto.add(new Riga("D 1.01.1.c", "Punto di comando", 1, 8.06));
        righeImpianto.add(new Riga("D 1.01.2.b", "Incremento per dorsale", 2, 10.54));
        righeImpianto.add(new Riga("D 1.01.3.a", "Incremento per op. murarie sul punto luce", 2, 6.82));
        righeImpianto.add(new Riga("D 1.01.3.b", "Incremento per op. murarie sul punto di comando", 1, 4.03));

        // Stampa delle righe dell'impianto elettrico
        System.out.println("Dettagli dell'impianto elettrico:");
        for (Riga riga : righeImpianto) {
            System.out.println(riga);
        }
    }
}
