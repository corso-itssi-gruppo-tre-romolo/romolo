package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lavori_manutenzione database table.
 * 
 */
@Entity
@Table(name="lavori_manutenzione")
@NamedQuery(name="LavoriManutenzione.findAll", query="SELECT l FROM LavoriManutenzione l")
public class LavoriManutenzione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Lob
	private String codice;

	@Lob
	private String descrizione;

	@Lob
	private String prezzo;

	@Lob
	@Column(name="`﻿sigla`")
	private String _sigla;

	public LavoriManutenzione() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodice() {
		return this.codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getPrezzo() {
		return this.prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String get_sigla() {
		return this._sigla;
	}

	public void set_sigla(String _sigla) {
		this._sigla = _sigla;
	}

}