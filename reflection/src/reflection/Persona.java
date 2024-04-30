package reflection;

public class Persona {
    // Attributi
    private String nome;
    private String cognome;
    private int eta;

    public Persona() {
		super();
	}

	// Costruttore
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // Metodo per ottenere il nome completo
    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    // Metodo per ottenere l'età
    public int getEta() {
        return eta;
    }

    // Metodo per impostare l'età
    public void setEta(int eta) {
        this.eta = eta;
    }

    // Metodo per stampare informazioni sulla persona
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Età: " + eta);
    }

    // Metodo per salutare
    public void saluta() {
        System.out.println("Ciao! Mi chiamo " + getNomeCompleto() + ".");
    }

    // Metodo principale per testare la classe
    public static void main(String[] args) {
        // Creazione di un oggetto Persona
        Persona persona1 = new Persona("Mario", "Rossi", 30);

        // Utilizzo dei metodi
        persona1.stampaInformazioni();
        persona1.saluta();

        // Modifica dell'età e stampa di nuovo le informazioni
        persona1.setEta(35);
        System.out.println("Nuova età: " + persona1.getEta());
        persona1.stampaInformazioni();
    }
}
