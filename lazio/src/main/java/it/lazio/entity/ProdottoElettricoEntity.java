package it.lazio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // Annotazione per indicare che questa classe è un'entità JPA
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProdottoElettricoEntity {
    @Id // Annotazione per indicare che questo campo è la chiave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generazione automatica dell'ID
    private Long id;
    private String codice;
    private String descrizione;
    private String quantita;
    private String prezzo;
public ProdottoElettricoEntity() {
	// TODO Auto-generated constructor stub
}
	// Costruttore senza id, poiché generato da MYSQL
  public ProdottoElettricoEntity(String codice, String descrizione, String quantita, String prezzo) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
	}

public ProdottoElettricoEntity(Long id, String codice, String descrizione, String quantita, String prezzo) {
	super();
	this.id = id;
	this.codice = codice;
	this.descrizione = descrizione;
	this.quantita = quantita;
	this.prezzo = prezzo;
}


@Override
public String toString() {
	return "ProdottoElettricoEntity [id=" + id + ", codice=" + codice + ", descrizione=" + descrizione + ", quantita="
			+ quantita + ", prezzo=" + prezzo + "]";
}
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
public String getQuantita() {
	return quantita;
}
public void setQuantita(String quantita) {
	this.quantita = quantita;
}
public String getPrezzo() {
	return prezzo;
}
public void setPrezzo(String prezzo) {
	this.prezzo = prezzo;
}

}
