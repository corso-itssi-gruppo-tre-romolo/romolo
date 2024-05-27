package it.preventivo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;

//@Entity
//@Table(name="Lavorazione")
@NamedQuery(name="Lavorazione.findAll", query="SELECT l FROM Lavorazione l")
public class Lavorazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_lavorazione")
	private int idLavorazione;

	private String descrizione;

	private BigDecimal prezzo;

	//bi-directional many-to-many association to Preventivo
	@ManyToMany(mappedBy="lavoraziones")
	private List<Preventivo> preventivos;

	public Lavorazione() {
	}

	public int getIdLavorazione() {
		return this.idLavorazione;
	}

	public void setIdLavorazione(int idLavorazione) {
		this.idLavorazione = idLavorazione;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public List<Preventivo> getPreventivos() {
		return this.preventivos;
	}

	public void setPreventivos(List<Preventivo> preventivos) {
		this.preventivos = preventivos;
	}

}