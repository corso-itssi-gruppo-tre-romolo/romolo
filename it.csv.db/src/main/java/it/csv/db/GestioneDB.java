package it.csv.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestioneDB {

    public static void inserisciDatiDB(ArrayList<String[]> dati) {
        // Informazioni di connessione al database MySQL
        String jdbcURL = "jdbc:mysql://localhost:3306/nomedelDB";
        String username = "username";
        String password = "password";

        // Query di inserimento
        String sql = "INSERT INTO nomedellatabella (colonna1, colonna2, colonna3, colonna4) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
                PreparedStatement statement = conn.prepareStatement(sql)) {

            for (String[] riga : dati) {
                statement.setString(1, riga[0]);
                statement.setString(2, riga[1]);
                statement.setString(3, riga[2]);
                statement.setString(4, riga[3]);

                statement.addBatch();
            }

            statement.executeBatch();

            System.out.println("Dati inseriti nel database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
