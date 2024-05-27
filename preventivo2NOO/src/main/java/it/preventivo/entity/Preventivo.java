package it.preventivo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


//@Entity
//@Table(name = "Preventivo")
@NamedQuery(name="Preventivo.findAll", query="SELECT p FROM Preventivo p")
public class Preventivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_preventivo")
	private int idPreventivo;

	@Temporal(TemporalType.DATE)
	@Column(name="data_preventivo")
	private Date dataPreventivo;

	private String stato;

	//bi-directional many-to-one association to Utente
	@ManyToOne
	@JoinColumn(name="fk_id_utente")
	private Utente utente;

	//bi-directional many-to-many association to Lavorazione
	@ManyToMany
	@JoinTable(
		name="Preventivo_Lavorazione"
		, joinColumns={
			@JoinColumn(name="id_preventivo")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_lavorazione")
			}
		)
	private List<Lavorazione> lavoraziones;

	public Preventivo() {
	}

	public int getIdPreventivo() {
		return this.idPreventivo;
	}

	public void setIdPreventivo(int idPreventivo) {
		this.idPreventivo = idPreventivo;
	}

	public Date getDataPreventivo() {
		return this.dataPreventivo;
	}

	public void setDataPreventivo(Date dataPreventivo) {
		this.dataPreventivo = dataPreventivo;
	}

	public String getStato() {
		return this.stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public List<Lavorazione> getLavoraziones() {
		return this.lavoraziones;
	}

	public void setLavoraziones(List<Lavorazione> lavoraziones) {
		this.lavoraziones = lavoraziones;
	}

}