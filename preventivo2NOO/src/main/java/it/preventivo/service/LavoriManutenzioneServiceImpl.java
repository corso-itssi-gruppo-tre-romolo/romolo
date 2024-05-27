package it.preventivo.service;

import it.preventivo.entity.LavoriManutenzione;
import it.preventivo.repository.LavoriManutenzioneRepository;
import it.preventivo.service.LavoriManutenzioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LavoriManutenzioneServiceImpl implements LavoriManutenzioneService {

    @Autowired
    private LavoriManutenzioneRepository lavoriManutenzioneRepository;

    @Override
    public List<LavoriManutenzione> findAll() {
        return lavoriManutenzioneRepository.findAll();
    }

    @Override
    public Optional<LavoriManutenzione> findById(Long id) {
        return lavoriManutenzioneRepository.findById(id);
    }

    @Override
    public LavoriManutenzione save(LavoriManutenzione lavoriManutenzione) {
        return lavoriManutenzioneRepository.save(lavoriManutenzione);
    }

    @Override
    public void deleteById(Long id) {
        lavoriManutenzioneRepository.deleteById(id);
    }
}

