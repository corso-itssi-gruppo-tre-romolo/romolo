package it.csv.db;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreazioneDB2 {

    public static void creaNuovoDatabase(String nomeDB, String username, String password) {
        // Informazioni di connessione al database MySQL
        String jdbcURL = "jdbc:mysql://localhost:3306/";
        
        String sql = "CREATE DATABASE " + nomeDB;

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement statement = conn.createStatement()) {

            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Database " + nomeDB + " creato con successo.", "Info", JOptionPane.INFORMATION_MESSAGE);

            String nomeTabella = chiediNomeTabella();
            creaTabella(nomeDB, nomeTabella, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Errore durante la creazione del database.", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void creaTabella(String nomeDB, String nomeTabella, String username, String password) {
        // Informazioni di connessione al database MySQL
        String jdbcURL = "jdbc:mysql://localhost:3306/" + nomeDB;

        String sql = "CREATE TABLE " + nomeTabella + " ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "colonna1 VARCHAR(255),"
                + "colonna2 VARCHAR(255),"
                + "colonna3 VARCHAR(255),"
                + "colonna4 VARCHAR(255))";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement statement = conn.createStatement()) {

            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Tabella " + nomeTabella + " creata con successo.", "Info", JOptionPane.INFORMATION_MESSAGE);

            Main3.main(new String[] { nomeDB, nomeTabella, username, password });

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Errore durante la creazione della tabella.", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String chiediNomeDatabase() {
        // Cambia questo valore se il nome utente del database MySQL è diverso
        String nomeDB = JOptionPane.showInputDialog(null, "Inserisci il nome del nuovo database:", "Nuovo Database", JOptionPane.QUESTION_MESSAGE);
        return nomeDB;
    }

    public static String chiediNomeTabella() {
        // Cambia questo valore se il nome utente del database MySQL è diverso
        String nomeTabella = JOptionPane.showInputDialog(null, "Inserisci il nome della nuova tabella:", "Nuova Tabella", JOptionPane.QUESTION_MESSAGE);
        return nomeTabella;
    }

    public static String chiediUsername() {
        // Cambia questo valore se il nome utente del database MySQL è diverso
        String username = JOptionPane.showInputDialog(null, "Inserisci l'username del database:", "Username", JOptionPane.QUESTION_MESSAGE);
        return username;
    }

    public static String chiediPassword() {
        // Cambia questo valore se il nome utente del database MySQL è diverso
        String password = JOptionPane.showInputDialog(null, "Inserisci la password del database:", "Password", JOptionPane.QUESTION_MESSAGE);
        return password;
    }
    
}
