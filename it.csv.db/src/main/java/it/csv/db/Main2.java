package it.csv.db;



import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class Main2 {
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
            
            // Stampa l'array contenente i dati del file CSV
            for (String[] riga : dati) {
                for (String valore : riga) {
                	
                	 System.out.format("%-25s", valore);
                    //System.out.print(valore + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nessun file selezionato.");
        }
    }
}

