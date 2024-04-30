package it.romolo.springContext.springContext.service;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.romolo.springContext.springContext.model.Persona;
/**
 * private String nome;
 * private String cognome;
 * private String indirizzo;
 * private String codiceFiscale;
 * private Date dataNascita;
 */
@Component
public class TastieraP {
	//@Autowired
	//Scanner sc= new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner
	//@Autowired //sul filds
	//Persona p1;
	//Ho ignettato nel costruttore sia il bean Persona che Scanner e poi li ho utilizzati.
	
	public TastieraP(Persona p1,Scanner sc) {
		super();
		System.out.println("Inserisci nome ....\n");
		p1.setNome(sc.next());;
		System.out.println("Inserisci cognome ....\n");
		p1.setCognome(sc.next());		
		System.out.println("Inserisci indirizzo  ....\n");
		p1.setIndirizzo(sc.next());		
		System.out.println("Inserisci codice fiscale ....\n");
		p1.setCodiceFiscale(sc.next());
		System.out.println("Inserisci data di nascita in formato  (dd/MM/yyyy) ....\n");
		
		String data=sc.next();
		//Mi sono costruito un oggetto di tipo SimpleDateFormat con il pattern
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//Poi lo utilizzo per convertire la stringa data da scanner next in un oggetto Date
		// e visto che puo dare una eccezione di tipo Date malformate lo racchiudo in un tray catch
		// dopo di che la inserisco nella proprieta' data di nascita ecc.  .
		try {
			p1.setDataNascita(dateFormat.parse(data));
		} catch (ParseException e) {
			System.out.println("\nErrore nel formato date  \n");
			e.printStackTrace();
		}
		System.out.println(".......................");
		System.out.println(" Questa è la persona che hai costruito  ");
		System.out.println(".......................");
		System.out.println(p1);
		System.out.println(".......................");
	}
	
	void controlloDati(){
		if(true) {
			
		}
	}

}
