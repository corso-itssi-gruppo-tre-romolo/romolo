// Classe che utilizza il servizio di lettura del file CSV
package it.csv.db.service;

import it.csv.db.service.CSVReaderService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/romolofiorenza/lavoro/it.csv.db/src/main/java/it/csv/db/model/ELETTRICI.csv"; // Sostituisci con il percorso del tuo file CSV
        CSVReaderService csvReaderService = new CSVReaderService();
        List<String[]> data = csvReaderService.readCSV(filePath);
        if (data != null) {
            System.out.println("Dati letti dal file CSV:");
            for (String[] row : data) {
                for (String value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
