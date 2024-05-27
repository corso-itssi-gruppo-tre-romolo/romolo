package it.preventivo.service;

import it.preventivo.entity.LavoriManutenzione;
import java.util.List;
import java.util.Optional;

public interface LavoriManutenzioneService {
    List<LavoriManutenzione> findAll();
    Optional<LavoriManutenzione> findById(Long id);
    LavoriManutenzione save(LavoriManutenzione lavoriManutenzione);
    void deleteById(Long id);
}

