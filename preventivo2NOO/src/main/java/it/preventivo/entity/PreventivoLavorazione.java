package it.preventivo.entity;

import java.io.Serializable;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//@Entity
//@Table(name = "Preventivo_Lavorazione")
public class PreventivoLavorazione implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "preventivo_id")
    private Preventivo preventivo;

    @ManyToOne
    @JoinColumn(name = "lavorazione_id")
    private Lavorazione lavorazione;

	public PreventivoLavorazione() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Preventivo getPreventivo() {
		return preventivo;
	}

	public void setPreventivo(Preventivo preventivo) {
		this.preventivo = preventivo;
	}

	public Lavorazione getLavorazione() {
		return lavorazione;
	}

	public void setLavorazione(Lavorazione lavorazione) {
		this.lavorazione = lavorazione;
	}

    // Costruttori, getter e setter


}
