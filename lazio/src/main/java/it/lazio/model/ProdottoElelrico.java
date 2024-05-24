package it.lazio.model;

public class ProdottoElelrico {
	private Long id;
    private String codice;
    private String descrizione;
    private String tipo;
    private String attacco;
    private double potenza;
    private double prezzo;

    // Costruttore vuoto
    public ProdottoElelrico() {
		super();
	}
    // Costruttore con tutti i parametri
    public ProdottoElelrico(Long id, String codice, String descrizione, String tipo, String attacco, double potenza,
			double prezzo) {
		super();
		this.id = id;
		this.codice = codice;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.attacco = attacco;
		this.potenza = potenza;
		this.prezzo = prezzo;
	}    
    public ProdottoElelrico(String codice, String descrizione, String tipo, String attacco, double potenza,
			double prezzo) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.attacco = attacco;
		this.potenza = potenza;
		this.prezzo = prezzo;
	}
	// Getter e setter
    public Long getId() {
		return id;
	}	

	public void setId(Long id) {
		this.id = id;
	}
	
    public String getCodice() {
        return codice;
    }    

	public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAttacco() {
        return attacco;
    }

    public void setAttacco(String attacco) {
        this.attacco = attacco;
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

	@Override
	public String toString() {
		return "ProdottoElelrico [id=" + id + ", codice=" + codice + ", descrizione=" + descrizione + ", tipo=" + tipo
				+ ", attacco=" + attacco + ", potenza=" + potenza + ", prezzo=" + prezzo + "]";
	}
    
}

