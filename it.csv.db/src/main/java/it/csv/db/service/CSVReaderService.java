

//Servizio di lettura del file CSV
package it.csv.db.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderService {
	//Il costruttore accetta un parametro filePath
 public List<String[]> readCSV(String filePath) {
     List<String[]> data = new ArrayList<>();
     String line;
     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
         while ((line = br.readLine()) != null) {
             String[] row = line.split(",");
             data.add(row);
         }
     } catch (IOException e) {
         System.err.println("Errore durante la lettura del file CSV: " + e.getMessage());
     }
     //Mi ritorna una Lista di righe lette dal file.csv 
     return data;
 }
}

