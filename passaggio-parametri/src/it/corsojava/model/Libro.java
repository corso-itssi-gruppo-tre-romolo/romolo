package it.corsojava.model;

public class Libro {
	
	private String titolo;
	private String autore;
	private Double prezzo;
	public Libro() {
		super();
	}
	public Libro(String titolo, String autore, Double prezzo) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", prezzo=" + prezzo + "]";
	}
	
	
}
