

package reflection; // Package che contiene la classe

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MainReflection {
    // Variabile di istanza per il nome della classe
    String name = "";

    // Metodo principale
    public static void main(String[] args) throws ClassNotFoundException {
        String className = new String("java.lang.Object"); // Nome della classe predefinito

        // Se si fornisce il nome della classe come argomento da riga di comando, utilizzalo
//        if (args.length < 0) {
//            className = args[0];
//        }

        // Ottieni l'oggetto Class corrispondente al nome della classe
        Class<?> objectClass = Class.forName(className);
        System.out.println("La Classe si chiama  >>>  "+objectClass);
        // Ottieni tutti i metodi della classe
        Method[] methods = objectClass.getMethods();
        System.out.println("La Classe ha  >>>  "+methods.length+"  Metodi ");
        // Ciclo su tutti i metodi
        for (int i = 0; i < methods.length; i++) {
            String name = methods[i].getName(); // Ottieni il nome del metodo
            Parameter[] classParameters = methods[i].getParameters(); // Ottieni i parametri del metodo
            System.out.println("Il Metodo della Classe si chiama  >>>  "+name);
            // Costruisci una stringa dei parametri del metodo
            String stringClassParameters = "";
            int length = classParameters.length;
            for (int j = 0; j < length; j++) {
                // Aggiungi il tipo e il nome del parametro alla stringa
                stringClassParameters += classParameters[j].getClass().getName() + " " + classParameters[j].getName();

                // Aggiungi una virgola se non è l'ultimo parametro
                if (j != (length - 1)) {
                    stringClassParameters += ", ";
                }
            }

            String methodReturnType = methods[i].getReturnType().getName(); // Ottieni il tipo di ritorno del metodo
            // Costruisci la stringa rappresentante il metodo
            String methodString = methodReturnType + " " + name + " (" + stringClassParameters + " )";
            System.out.println(methodString); // Stampa la stringa rappresentante il metodo
        }
    }
}
