package it.csv.db;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreazioneDB {

    public static void creaNuovoDatabase(String nomeDB) {
        // Informazioni di connessione al database MySQL
        String jdbcURL = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "simonbasic"; // Inserisci la password del tuo database MySQL

        String sql = "CREATE DATABASE " + nomeDB;

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement statement = conn.createStatement()) {

            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Database " + nomeDB + " creato con successo.", "Info", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Errore durante la creazione del database.", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        String nomeDB = chiediNomeDatabase();
        creaNuovoDatabase(nomeDB);
    }

    public static String chiediNomeDatabase() {
        // Cambia questo valore se il nome utente del database MySQL è diverso
        String nomeDB = JOptionPane.showInputDialog(null, "Inserisci il nome del nuovo database:", "Nuovo Database", JOptionPane.QUESTION_MESSAGE);
        return nomeDB;
    }
}

