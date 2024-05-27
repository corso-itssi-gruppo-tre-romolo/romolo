package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Preventivo_Lavorazione database table.
 * 
 */
@Embeddable
public class Preventivo_LavorazionePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_preventivo", insertable=false, updatable=false)
	private int idPreventivo;

	@Column(name="id_lavorazione", insertable=false, updatable=false)
	private int idLavorazione;

	public Preventivo_LavorazionePK() {
	}
	public int getIdPreventivo() {
		return this.idPreventivo;
	}
	public void setIdPreventivo(int idPreventivo) {
		this.idPreventivo = idPreventivo;
	}
	public int getIdLavorazione() {
		return this.idLavorazione;
	}
	public void setIdLavorazione(int idLavorazione) {
		this.idLavorazione = idLavorazione;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Preventivo_LavorazionePK)) {
			return false;
		}
		Preventivo_LavorazionePK castOther = (Preventivo_LavorazionePK)other;
		return 
			(this.idPreventivo == castOther.idPreventivo)
			&& (this.idLavorazione == castOther.idLavorazione);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPreventivo;
		hash = hash * prime + this.idLavorazione;
		
		return hash;
	}
}