package it.corsojava.model;

public class Auto {
private String marca ;
private String modello;
private int prezzo;
public Auto() {
	super();
}
public Auto(String marca, String modello, int prezzo) {
	super();
	this.marca = marca;
	this.modello = modello;
	this.prezzo = prezzo;
}
@Override
public String toString() {
	return "Auto [marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + "]";
}




}
