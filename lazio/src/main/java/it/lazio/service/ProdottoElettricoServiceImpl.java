package it.lazio.service;

import it.lazio.entity.ProdottoElettrico;
import it.lazio.repository.ProdottoElettricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdottoElettricoServiceImpl implements ProdottoElettricoService {

    @Autowired
    private ProdottoElettricoRepository prodottoElettricoRepository;

    @Override
    public ProdottoElettrico createProdottoElettrico(ProdottoElettrico prodottoElettrico) {
        return prodottoElettricoRepository.save(prodottoElettrico);
    }

    @Override
    public ProdottoElettrico getProdottoElettricoById(Long id) {
        return prodottoElettricoRepository.findById(id).orElse(null);
    }

    @Override
    public List<ProdottoElettrico> getAllProdottiElettrici() {
        return prodottoElettricoRepository.findAll();
    }

    @Override
    public ProdottoElettrico updateProdottoElettrico(Long id, ProdottoElettrico prodottoElettrico) {
        if (prodottoElettricoRepository.existsById(id)) {
            prodottoElettrico.setId(id);
            return prodottoElettricoRepository.save(prodottoElettrico);
        }
        return null;
    }

    @Override
    public void deleteProdottoElettrico(Long id) {
        prodottoElettricoRepository.deleteById(id);
    }
    
    @Override
    public ProdottoElettrico getProdottoElettricoByCodice(String codice) {
        return prodottoElettricoRepository.findByCodice(codice);
    }
    
    @Override
    public List<ProdottoElettrico> getProdottiElettriciByDescrizione(String keyword) {
        return prodottoElettricoRepository.findByDescrizioneContaining(keyword);
    }
    
    @Override
    public List<ProdottoElettrico> getProdottiElettriciByTipo(String tipo) {
        return prodottoElettricoRepository.findByTipo(tipo);
    }
    
    @Override
    public List<ProdottoElettrico> getProdottiElettriciByAttacco(String attacco) {
        return prodottoElettricoRepository.findByAttacco(attacco);
    }
}
