package it.romolo.springContext.springContext.model;

import java.util.Date;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Persona {
	
private String nome;
private String cognome;
private String indirizzo;
private String codiceFiscale;
private Date dataNascita;
public Persona() {
	super();
}
public Persona(String nome, String cognome, String indirizzo, String codiceFiscale, Date dataNascita) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.indirizzo = indirizzo;
	this.codiceFiscale = codiceFiscale;
	this.dataNascita = dataNascita;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}
public String getCodiceFiscale() {
	return codiceFiscale;
}
public void setCodiceFiscale(String codiceFiscale) {
	this.codiceFiscale = codiceFiscale;
}
public Date getDataNascita() {
	return dataNascita;
}
public void setDataNascita(Date dataNascita) {
	this.dataNascita = dataNascita;
}
@Override
public String toString() {
	return "     Persona \n nome=" + nome + "\n cognome=" + cognome + "\n indirizzo=" + indirizzo + "\n codiceFiscale="
			+ codiceFiscale + "\n dataNascita=" + dataNascita + "\n";
}
@Override
public int hashCode() {
	return Objects.hash(codiceFiscale, cognome, dataNascita, indirizzo, nome);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona other = (Persona) obj;
	return Objects.equals(codiceFiscale, other.codiceFiscale) && Objects.equals(cognome, other.cognome)
			&& Objects.equals(dataNascita, other.dataNascita) && Objects.equals(indirizzo, other.indirizzo)
			&& Objects.equals(nome, other.nome);
}




}
