package it.corsojava.model;

import java.util.Objects;

public class Persona {
	private String nome;
	private String indirizzo;
	public Persona(String nome, String indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	
	public Persona() {
	}
	
	
	private void faiQualcosa() {
		System.out.println("No");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
	
	public void visualizza() {
		System.out.println("Ciao sono " + nome + ", da " + indirizzo);
	}



































	@Override
	public int hashCode() {
		return Objects.hash(indirizzo, nome);
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
		return Objects.equals(indirizzo, other.indirizzo) 
				&& Objects.equals(nome, other.nome);
	}
	







}
