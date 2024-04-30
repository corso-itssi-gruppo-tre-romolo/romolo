package it.corsojava.main;

import it.corsojava.model.Persona;

public class PassaggioParametri {
	
	public static void main(String[] args) {
		PassaggioParametri pp=new PassaggioParametri();
		pp.esegui();
	}

	private void esegui() {
		int numero=10;
		Persona personaUno=new Persona("Paola", "Roma");
		
		System.out.println("**	in esegui() -1 ...");
		System.out.println("numero: " + numero);
		System.out.println("persona: " + personaUno.toString());
		
		//	richiama il metodo lavoraConParametri()
		lavoraConParametri(numero, personaUno);
		
		//	Quali saranno i valori visualizzati?
		System.out.println();
		System.out.println("**	in esegui() -2 ...");
		System.out.println("numero: " + numero);
		System.out.println("persona: " + personaUno.toString());
	}

	private void lavoraConParametri(int parPrimitivo, Persona parOggetto) {
		System.out.println();
		System.out.println("in lavoraConParametri() ...");
		parPrimitivo*=5;
		parOggetto.setNome("Marta");
		parOggetto.setIndirizzo("Milano");
		
		//	Quali saranno i valori visualizzati?
		System.out.println("parPrimitivo: " + parPrimitivo);
		System.out.println("parOggetto: " + parOggetto.toString());
		
	}
}
