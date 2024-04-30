package metodoStatico;

public class Avvio {
	/**
	 * 
	 * Per evitare di chiamare metodi non statici direttamente dalla classe Avvio,
	 * puoi creare un'istanza della classe in cui è definito il metodo e chiamare il
	 * metodo sull'istanza creata. Ecco un esempio:
	 */
	public void mioMetodo() {
		System.out.println("Questo è il mio metodo! ......non statico ....");
	}

	public static void main(String[] args) {
		// Creazione di un'istanza della classe contenente il metodo
		Avvio istanza = new Avvio();

		// Chiamata del metodo tramite l'istanza
		istanza.mioMetodo();
		istanza.ciao();
	}

	public void ciao() {
		System.out.println("Ciao Romolo Questo è il secondo metodo chiamato ...non statico ....");

	}
	/**
	 * In questo esempio, sia metodo mioMetodo() e il metodo ciao() sono metodi non statici della classe
	 * Avvio, viene chiamato dal metodo statico  main()  creando prima un'istanza della
	 * classe MiaClasse e poi chiamando il metodo sull'istanza. Non è necessario che
	 * il metodo main sia statico per questo.
	 */
}
