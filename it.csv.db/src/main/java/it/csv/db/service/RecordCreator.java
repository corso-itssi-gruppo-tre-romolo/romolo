package it.csv.db.service;

import it.csv.db.service.CSVReaderService;

import java.util.ArrayList;
import java.util.List;

public class RecordCreator {

    public List<Record> creaOggettiDaCSV(String filePath) {
        CSVReaderService csvReaderService = new CSVReaderService();
        List<String[]> data = csvReaderService.readCSV(filePath);
        if (data != null) {
            // Creazione degli oggetti utilizzando i dati letti dal CSV
            List<Record> oggetti = new ArrayList<>();
            for (String[] riga : data) {
                // Supponiamo che ogni riga contenga informazioni per creare un oggetto
                // E che la classe Oggetto abbia un costruttore appropriato
                Record oggetto = new Record(riga[0], riga[1], Integer.parseInt(riga[2])); // Esempio di costruttore
                oggetti.add(oggetto);
            }
            return oggetti;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String filePath = "/home/romolofiorenza/lavoro/it.csv.db/src/main/java/it/csv/db/model/ELETTRICI.csv"; // Sostituisci con il percorso del tuo file CSV
        RecordCreator oggettoCreator = new RecordCreator();
        List<Record> oggetti = oggettoCreator.creaOggettiDaCSV(filePath);
        if (oggetti != null) {
            System.out.println("Oggetti creati dal file CSV:");
            for (Record oggetto : oggetti) {
                System.out.println(oggetto); // Assumendo che Oggetto abbia un metodo toString() appropriato
            }
        }
    }
}

