package it.csv.db;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lettura {

	
	
	public Lettura() {
		super();
		try {
			FileReader fileReader=new FileReader("/home/romolofiorenza/Scrivania/eclipse/wks_java/it.csv.db/src/main/resources/PARTE D IMPIANTI ELETTRICI 2023.csv");
		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
			e.printStackTrace();
			
		}
		BufferedReader reader = null;
		reader = new BufferedReader(reader);
		
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			System.out.println("Riga non letta ");
			e.printStackTrace();
		}
		while(line!=null) {
		     System.out.println(line);
		     try {
				line = reader.readLine();
			} catch (IOException e) {
				System.out.println("Fine file o finito linee ");
				e.printStackTrace();
			}
		}
	}

	
	
	
}
