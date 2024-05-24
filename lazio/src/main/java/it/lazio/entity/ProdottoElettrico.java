package it.lazio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Data: Genera automaticamente i metodi toString, equals, hashCode, nonché i
 *        getter e i setter per tutti i campi della classe.
 */
@Data
/**
 * @NoArgsConstructor: Genera un costruttore senza argomenti.
 */
@NoArgsConstructor
/**
 * @AllArgsConstructor: Genera un costruttore con tutti gli argomenti.
 */
@AllArgsConstructor
/**
 * @ToString: Genera un metodo toString per la classe.
 */
@ToString
public class ProdottoElettrico {
    private Long id;
    private String codice;
    private String descrizione;
    private String tipo;
    private String attacco;
    private double potenza;
    private double prezzo;
    //Costruttore senza id , perche generato da MYSQL
	public ProdottoElettrico(String codice, String descrizione, String tipo, String attacco, double potenza,
			double prezzo) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.attacco = attacco;
		this.potenza = potenza;
		this.prezzo = prezzo;
	}
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
    
}

