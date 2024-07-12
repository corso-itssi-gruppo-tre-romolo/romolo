package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the classe database table.
 * 
 */
@Entity
@Table(name="classe")
@NamedQuery(name="Classe.findAll", query="SELECT c FROM Classe c")
public class Classe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="anno_scolastico")
	private String annoScolastico;

	@Column(name="aula_num")
	private String aulaNum;

	@Column(name="classe_anno")
	private String classeAnno;

	private String piano;

	private String sezione;

	//bi-directional many-to-one association to Studente
	@OneToMany(mappedBy="classe")
	private List<Studente> studentes;

	public Classe() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnnoScolastico() {
		return this.annoScolastico;
	}

	public void setAnnoScolastico(String annoScolastico) {
		this.annoScolastico = annoScolastico;
	}

	public String getAulaNum() {
		return this.aulaNum;
	}

	public void setAulaNum(String aulaNum) {
		this.aulaNum = aulaNum;
	}

	public String getClasseAnno() {
		return this.classeAnno;
	}

	public void setClasseAnno(String classeAnno) {
		this.classeAnno = classeAnno;
	}

	public String getPiano() {
		return this.piano;
	}

	public void setPiano(String piano) {
		this.piano = piano;
	}

	public String getSezione() {
		return this.sezione;
	}

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}

	public List<Studente> getStudentes() {
		return this.studentes;
	}

	public void setStudentes(List<Studente> studentes) {
		this.studentes = studentes;
	}

	public Studente addStudente(Studente studente) {
		getStudentes().add(studente);
		studente.setClasse(this);

		return studente;
	}

	public Studente removeStudente(Studente studente) {
		getStudentes().remove(studente);
		studente.setClasse(null);

		return studente;
	}

}