package it.preventivo.service;

import it.preventivo.entity.LavoriRestauro;
import it.preventivo.repository.LavoriRestauroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LavoriRestauroService {
    
    @Autowired
    private LavoriRestauroRepository lavoriRestauroRepository;

    public List<LavoriRestauro> findAll() {
        return lavoriRestauroRepository.findAll();
    }

    public Optional<LavoriRestauro> findById(Long id) {
        return lavoriRestauroRepository.findById(id);
    }

    public LavoriRestauro save(LavoriRestauro lavoriRestauro) {
        return lavoriRestauroRepository.save(lavoriRestauro);
    }

    public void deleteById(Long id) {
        lavoriRestauroRepository.deleteById(id);
    }
}
