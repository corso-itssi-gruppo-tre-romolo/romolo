package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the studente database table.
 * 
 */
@Entity
@Table(name="studente")
@NamedQuery(name="Studente.findAll", query="SELECT s FROM Studente s")
public class Studente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String cognome;

	private String email;

	private String nome;

	@Column(name="rif_genitore")
	private String rifGenitore;

	private String telefono;

	//bi-directional many-to-one association to Classe
	@ManyToOne
	@JoinColumn(name="id_classe")
	private Classe classe;

	public Studente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRifGenitore() {
		return this.rifGenitore;
	}

	public void setRifGenitore(String rifGenitore) {
		this.rifGenitore = rifGenitore;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Classe getClasse() {
		return this.classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

}