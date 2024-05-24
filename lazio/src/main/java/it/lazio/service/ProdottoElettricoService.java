package it.lazio.service;

import it.lazio.entity.ProdottoElettrico;

import java.util.List;

public interface ProdottoElettricoService {
    // Operazione CREATE
    ProdottoElettrico createProdottoElettrico(ProdottoElettrico prodottoElettrico);

    // Operazione READ
    ProdottoElettrico getProdottoElettricoById(Long id);
    List<ProdottoElettrico> getAllProdottiElettrici();
    
    // Operazioni di ricerca aggiuntive
    ProdottoElettrico getProdottoElettricoByCodice(String codice);
    List<ProdottoElettrico> getProdottiElettriciByDescrizione(String keyword);
    List<ProdottoElettrico> getProdottiElettriciByTipo(String tipo);
    List<ProdottoElettrico> getProdottiElettriciByAttacco(String attacco);

    // Operazione UPDATE
    ProdottoElettrico updateProdottoElettrico(Long id, ProdottoElettrico prodottoElettrico);

    // Operazione DELETE
    void deleteProdottoElettrico(Long id);
}
