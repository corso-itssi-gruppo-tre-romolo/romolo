package it.csv.db;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

    public static void main(String [] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/romolofiorenza/Scrivania/eclipse/wks_java/it.csv.db/src/main/resources/PARTE D IMPIANTI ELETTRICI 2023.csv"));
        String line = reader.readLine();
        while(line!=null) {
            System.out.println(line);
            line = reader.readLine();
            
        }
        reader.close();
    }

}