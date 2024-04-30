package it.corsojava.main;

import it.corsojava.model.Libro;

public class LibroMain {

	public static void main(String[] args) {

//		 Libro lib1=new Libro("Il Signore degli Anelli" , "Carem", 30.45);
//		 Libro lib2=new Libro("Il Signore degli Anelli" , "Carem", 30.45);
//		 Libro lib3=new Libro("Il Signore degli Anelli" , "Carem", 30.45);
		//stampaLibri();
		esequi();
	}

	private static void esequi() {
		// TODO Auto-generated method stub
		
		int totale=11;
		System.out.println(totale/2);
		
		
		
	}

	private static void stampaLibri() {

		Libro lib1 = new Libro("Il Signore degli Anelli 1 volume", "Carem", 30.45);
		Libro lib2 = new Libro("Il Signore degli Anelli 2 volume", "Carem", 45.45);
		Libro lib3 = new Libro("Il Signore degli Anelli 3 volume", "Carem", 87.45);

		System.out.println(lib1);
		System.out.println(lib2);
		System.out.println(lib3);
	}

	
	
}
