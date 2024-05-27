package entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the Preventivo_Lavorazione database table.
 * 
 */
@Entity
@NamedQuery(name="Preventivo_Lavorazione.findAll", query="SELECT p FROM Preventivo_Lavorazione p")
public class Preventivo_Lavorazione implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Preventivo_LavorazionePK id;

	public Preventivo_Lavorazione() {
	}

	public Preventivo_LavorazionePK getId() {
		return this.id;
	}

	public void setId(Preventivo_LavorazionePK id) {
		this.id = id;
	}

}