package it.lazio.repository;

import it.lazio.entity.ProdottoElettrico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdottoElettricoRepository extends JpaRepository<ProdottoElettrico, Long> {
    // Se necessario, è possibile definire ulteriori metodi di query qui
    
	// Metodo per cercare prodotti per id
    ProdottoElettrico findById(String id);
	
    // Metodo per cercare prodotti per codice
    ProdottoElettrico findByCodice(String codice);
    
    // Metodo per cercare prodotti per descrizione contenente una certa stringa
    List<ProdottoElettrico> findByDescrizioneContaining(String keyword);
    
    // Metodo per cercare prodotti per tipo
    List<ProdottoElettrico> findByTipo(String tipo);
    
    // Metodo per cercare prodotti per attacco
    List<ProdottoElettrico> findByAttacco(String attacco);
    
    // Se necessario, aggiungi altri metodi di ricerca qui
}

