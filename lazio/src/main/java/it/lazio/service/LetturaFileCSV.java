package it.lazio.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import it.lazio.entity.ProdottoElettricoEntity;

public class LetturaFileCSV {
    public static ArrayList<String[]> leggiFileCSV(String filePath) {
        ArrayList<String[]> dati = new ArrayList<>();
        ArrayList<ProdottoElettricoEntity> prodottoElettrico;
        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
               // String[]riga = line.split(";") ;
                String[]riga=line.split(";");
                int contCampi=riga.length;
                //*********
                
                
//                //********// Itera su ogni elemento dell'array di stringhe 'campo'
//    			for(int i=1; i < contCampi; i++){
//    				
//    				// Ottiene il valore corrente dall'array di stringhe 'campo'
//    				String current = riga[i];
//    				
//    				if (current.equals("")&&current.equals(" ")) {
//    					continue;
//    					}
//    				
//    				// Stampa l'indice del campo e il suo valore
//    				System.out.print("CAMPO: " + i + " VALORE: " + current + "\n");
//    			}
//               // int contCampi = riga.length;
                
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
