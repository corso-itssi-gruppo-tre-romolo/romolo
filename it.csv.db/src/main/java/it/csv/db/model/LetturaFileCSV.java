package it.csv.db.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetturaFileCSV {
    public static ArrayList<String[]> leggiFileCSV(String filePath) {
        ArrayList<String[]> dati = new ArrayList<>();

        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] riga = line.split(";");
                dati.add(riga);
            }
            
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dati;
    }
}
