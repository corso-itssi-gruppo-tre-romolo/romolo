package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class MainReflection2 {
    // Metodo principale
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome della classe da controllare: ");
        String className = scanner.nextLine(); // Leggi il nome della classe da console

        // Richiama il metodo per stampare i metodi della classe
        printClassMethods(className);
        
        scanner.close(); // Chiudi lo scanner
    }

    // Metodo per stampare i metodi di una classe
    public static void printClassMethods(String className) throws ClassNotFoundException {
        // Ottieni l'oggetto Class corrispondente al nome della classe
        Class<?> objectClass = Class.forName(className);
        System.out.println("La Classe si chiama >>> " + objectClass);

        // Ottieni tutti i metodi della classe
        Method[] methods = objectClass.getMethods();
        System.out.println("La Classe ha >>> " + methods.length + " Metodi ");

        // Ciclo su tutti i metodi
        for (Method method : methods) {
            String name = method.getName(); // Ottieni il nome del metodo
            Parameter[] classParameters = method.getParameters(); // Ottieni i parametri del metodo
            System.out.println("Il Metodo della Classe si chiama >>> " + name);

            // Costruisci una stringa dei parametri del metodo
            StringBuilder stringClassParameters = new StringBuilder();
            int length = classParameters.length;
            for (int j = 0; j < length; j++) {
                // Aggiungi il tipo e il nome del parametro alla stringa
                stringClassParameters.append(classParameters[j].getType().getName())
                                      .append(" ")
                                      .append(classParameters[j].getName());

                // Aggiungi una virgola se non è l'ultimo parametro
                if (j != (length - 1)) {
                    stringClassParameters.append(", ");
                }
            }

            String methodReturnType = method.getReturnType().getName(); // Ottieni il tipo di ritorno del metodo
            // Costruisci la stringa rappresentante il metodo
            String methodString = methodReturnType + " " + name + " (" + stringClassParameters + " )";
            System.out.println(methodString); // Stampa la stringa rappresentante il metodo
        }
    }
}
