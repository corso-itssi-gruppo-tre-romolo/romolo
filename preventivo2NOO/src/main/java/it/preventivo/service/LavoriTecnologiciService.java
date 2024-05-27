package it.preventivo.service;

import it.preventivo.entity.LavoriTecnologici;
import it.preventivo.repository.LavoriTecnologiciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LavoriTecnologiciService {
    
    @Autowired
    private LavoriTecnologiciRepository lavoriTecnologiciRepository;

    public List<LavoriTecnologici> findAll() {
        return lavoriTecnologiciRepository.findAll();
    }

    public Optional<LavoriTecnologici> findById(Long id) {
        return lavoriTecnologiciRepository.findById(id);
    }

    public LavoriTecnologici save(LavoriTecnologici lavoriTecnologici) {
        return lavoriTecnologiciRepository.save(lavoriTecnologici);
    }

    public void deleteById(Long id) {
        lavoriTecnologiciRepository.deleteById(id);
    }
}
