package it.csv.db.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LetturaCSVReader {
    private String filePath;// ="/home/romolofiorenza/lavoro/it.csv.db/src/main/java/it/csv/db/model/ELETTRICI.csv";

    public LetturaCSVReader(String filePath) {
        this.filePath = filePath;
    }

    public List<String[]> readCSV() {
        List<String[]> data = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                //System.out.println("RIGA >>>> "+line);
             // Suddivide la stringa utilizzando il delimitatore ";"
//                String[] parts = line.split(";");
//                System.out.println("RIGA >>>> "+parts);
                data.add(row);
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file CSV: " + e.getMessage());
        }
        return data;
    }

    public static void main(String[] args) {
        String filePath = "/home/romolofiorenza/lavoro/it.csv.db/src/main/java/it/csv/db/model/ELETTRICI.csv"; // Sostituisci con il percorso del tuo file CSV
        LetturaCSVReader csvLettura = new LetturaCSVReader(filePath);
        List<String[]> dati = csvLettura.readCSV();
        if (dati != null) {
            System.out.println("Dati letti dal file CSV:");
            int contatore=0;
            for (String[] riga : dati) {
            	
                for (String valore : riga) {
                  //  System.out.print("*"+valore + "*");
                 // Suddivide la stringa utilizzando il delimitatore ";"
                    String[] parts = valore.split(";");
                    for (int i = 0; i < parts.length; i++) {
						//String string = parts[i];
						System.out.println(parts[i]);
					}
                }
                
                contatore+=1;
                if(contatore>50) {break;}
            }
            
            System.out.println(contatore);
            
        }
    }

}

