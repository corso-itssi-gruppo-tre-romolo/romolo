package it.csv.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

import it.csv.db.model.LetturaFileCSV;

public class Main3 {
    public static void main(String[] args) {
        // Apri una finestra di dialogo del file system per selezionare il file CSV
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleziona il file CSV");
        
        int result = fileChooser.showOpenDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            
            // Chiamata al metodo leggiFileCSV dalla classe LetturaFileCSV
            ArrayList<String[]> dati = LetturaFileCSV.leggiFileCSV(filePath);

            // Stampa l'intestazione
            System.out.format("%-25s%-25s%-25s%-25s%n", "Colonna1", "Colonna2", "Colonna3", "Colonna4");

            // Stampa l'array contenente i dati del file CSV in forma tabellare (30 righe per volta)
            int righeStampate = 0;
            int indiceRiga = 0;
            Scanner scanner = new Scanner(System.in);
            while (indiceRiga < dati.size()) {
                for (int i = 0; i < 30 && indiceRiga < dati.size(); i++) {
                    String[] riga = dati.get(indiceRiga);
                    for (String valore : riga) {
                    	// System.out.format("%-25s", valore.replace("€", "EURO"));
                        System.out.format("%-25s", valore);
                    }
                    System.out.println();
                    indiceRiga++;
                    righeStampate++;
                }
                if (indiceRiga < dati.size()) {
                    System.out.println("Premi 'c' per continuare... o 'e' per uscire  ");
                    String input = scanner.nextLine();
                    if (!input.toLowerCase().equals("c")) {
                    	
                        break;
                    }
                    
                    if (input.toLowerCase().equals("e")) {
                        indiceRiga=indiceRiga+10000000;
                        
                    }
                }
                
                
                
            }
            System.out.println();
            System.out.println("  Ciao sei uscito dal programma  ");
            scanner.close();
        } else {
            System.out.println("Nessun file selezionato.");
        }
    }
}
