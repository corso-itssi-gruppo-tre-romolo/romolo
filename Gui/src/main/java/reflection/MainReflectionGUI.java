package reflection;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MainReflectionGUI extends JFrame {

    // Componenti GUI
    private JLabel classNameLabel;
    private JTextField classNameField;
    private JButton submitButton;
    private JTextArea outputArea;

    public MainReflectionGUI() {
        // Impostazioni della finestra
        setTitle("Reflection Class Methods Viewer");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inizializzazione dei componenti GUI
        classNameLabel = new JLabel("Class Name:");
        classNameField = new JTextField();
        submitButton = new JButton("Submit");
        outputArea = new JTextArea();

        // Area di output non editabile
        outputArea.setEditable(false);

        // Pannello per il campo di inserimento e il pulsante
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(classNameLabel, BorderLayout.WEST);
        inputPanel.add(classNameField, BorderLayout.CENTER);
        inputPanel.add(submitButton, BorderLayout.EAST);

        // Aggiungi componenti alla finestra
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Aggiungi azione al pulsante di submit
        submitButton.addActionListener(e -> {
            String className = classNameField.getText();
            try {
                // Chiamata al metodo per stampare i metodi della classe
                printClassMethods(className);
            } catch (ClassNotFoundException ex) {
                outputArea.setText("Classe non trovata!");
            }
        });
    }

    // Metodo per stampare i metodi di una classe
    private void printClassMethods(String className) throws ClassNotFoundException {
        // Ottieni l'oggetto Class corrispondente al nome della classe
        Class<?> objectClass = Class.forName(className);
        outputArea.append("\n");
        outputArea.append("\n");
        outputArea.append("La Classe si chiama            >>>         " + objectClass + "\n");
        outputArea.append("\n");
        // Ottieni tutti i metodi della classe
        Method[] methods = objectClass.getMethods();
        outputArea.append("La Classe ha     >>>         " + methods.length + " Metodi\n");
        outputArea.append("\n");
        outputArea.append("\n");
        // Ciclo su tutti i metodi
        for (Method method : methods) {
            String name = method.getName(); // Ottieni il nome del metodo
            Parameter[] classParameters = method.getParameters(); // Ottieni i parametri del metodo
            outputArea.append("Il Metodo della Classe si chiama >>> " + name + "\n");

            // Costruisci una stringa dei parametri del metodo
            StringBuilder stringClassParameters = new StringBuilder();
            int length = classParameters.length;
            for (int j = 0; j < length; j++) {
                // Aggiungi il tipo e il nome del parametro alla stringa
                stringClassParameters.append(classParameters[j].getType().getName())
                        .append("Nome del metodo   \n ")
                        .append(classParameters[j].getName());

                // Aggiungi una virgola se non è l'ultimo parametro
                if (j != (length - 1)) {
                    stringClassParameters.append(", ");
                }
            }

            String methodReturnType = method.getReturnType().getName(); // Ottieni il tipo di ritorno del metodo
            // Costruisci la stringa rappresentante il metodo
            String methodString = methodReturnType + " " + name + " (" + stringClassParameters + " )";
            outputArea.append("   Tipo di ritorno   >>>>>"+methodString + "\n"); // Aggiungi la stringa rappresentante il metodo all'area di output
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainReflectionGUI frame = new MainReflectionGUI();
            frame.setVisible(true);
        });
    }
}
