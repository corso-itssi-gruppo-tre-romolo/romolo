package it.preventivo.service;

import java.util.List;

import it.preventivo.entity.LavoriEdili;
import it.preventivo.repository.LavoriEdiliRepository;

public interface LavoriEdiliService extends LavoriEdiliRepository{
    List<LavoriEdili> findAll();
    LavoriEdili findById(long id);
    LavoriEdili save(LavoriEdili lavoroEdile);
    void deleteById(long id);
}

