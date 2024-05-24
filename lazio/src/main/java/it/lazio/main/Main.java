package it.lazio.main;

import java.util.ArrayList;

import it.lazio.service.LetturaCSVReader;
import it.lazio.service.LetturaFileCSV;

public class Main {
	String filePath = "/home/romolofiorenza/lavoro/lazio/src/main/resources/PARTE D IMPIANTI ELETTRICI 2023.csv";
	ArrayList<String[]> dati = LetturaFileCSV.leggiFileCSV(filePath);
	ArrayList<String[]> campi; 
	//LetturaCSVReader letturaCSVReader=new LetturaCSVReader(filePath);
	//ArrayList<String[]> dati = letturaCSVReader.readCSV();
	int numRiga=1;
	public static void main(String[] args) {
    	
    	
        Main main=new Main();
        
        // Chiamata al metodo leggiFileCSV dalla classe LetturaFileCSV
        //main.leggirighe();
        main.leggirighe2();
       // main.leggicampi();
        // Stampa l'array contenente i dati del file CSV
        
    }

	private void leggirighe() {
		// TODO Auto-generated method stub
		for (String[] campo : dati) {
			System.out.println("RIGA  "+numRiga);
			for(int i=0; i < campo.length; i++){
				
				String current = campo[i];
				
				System.out.print("CAMPO: " + i + " VALORE: " + current + "\n");
			}
            
            System.out.println();
           numRiga=numRiga+1; 
        }
		System.out.println("     Ci sono nella lista  "+dati.size()+" Righe");
	}
	
	private void leggirighe2() {
		
		// Itera su ogni array di stringhe all'interno della lista 'dati'
		for (String[] campo : dati) {
			
			// Stampa il numero della riga corrente
			System.out.println("RIGA  "+numRiga);
			
			// Itera su ogni elemento dell'array di stringhe 'campo'
			for(int i=1; i < campo.length; i++){
				
				// Ottiene il valore corrente dall'array di stringhe 'campo'
				String current = campo[i];
				
//				if (current.equals("")&&current.equals(" ")) {
//					continue;
//					}
				
				// Stampa l'indice del campo e il suo valore
				System.out.print("CAMPO: " + i + " VALORE: " + current + "\n");
			}
            
            // Stampa una riga vuota per separare le righe
            System.out.println();
            
            // Incrementa il numero di riga
            numRiga=numRiga+1; 
        }
		
		// Stampa il numero totale di righe presenti nella lista 'dati'
		System.out.println("     Ci sono nella lista  "+dati.size()+" Righe");
	}

}
