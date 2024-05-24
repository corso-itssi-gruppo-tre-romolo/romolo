package it.csv.db;

import java.util.ArrayList;

import it.csv.db.model.LetturaFileCSV;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/romolofiorenza/Scrivania/eclipse/wks_java/it.csv.db/src/main/resources/PARTE D IMPIANTI ELETTRICI 2023.csv";
        
        // Chiamata al metodo leggiFileCSV dalla classe LetturaFileCSV
        ArrayList<String[]> dati = LetturaFileCSV.leggiFileCSV(filePath);

        // Stampa l'array contenente i dati del file CSV
        for (String[] riga : dati) {
            for (String valore : riga) {
                System.out.print(valore + "\t");
            }
            System.out.println();
        }
    }
}
