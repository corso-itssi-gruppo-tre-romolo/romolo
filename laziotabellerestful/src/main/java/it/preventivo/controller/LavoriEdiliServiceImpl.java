package it.preventivo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.preventivo.entity.LavoriEdili;
import it.preventivo.service.LavoriEdiliService;

@RestController
@RequestMapping("/api/lavori-edili")
public class LavoriEdiliServiceImpl {

    @Autowired
    private LavoriEdiliService lavoriEdiliService;

    @GetMapping
    public Iterable<LavoriEdili> getAllLavoriEdili() {
        return lavoriEdiliService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<LavoriEdili> getLavoriEdiliById(@PathVariable Long id) {
        return lavoriEdiliService.findById(id);
    }

    @PostMapping
    public LavoriEdili createLavoriEdili(@RequestBody LavoriEdili lavoriEdili) {
        return lavoriEdiliService.save(lavoriEdili);
    }

    @PostMapping("/{id}")
    public LavoriEdili updateLavoriEdili(@PathVariable Long id, @RequestBody LavoriEdili lavoriEdili) {
        lavoriEdili.setId(id);
        return lavoriEdiliService.save(lavoriEdili);
    }

    @PostMapping("/delete/{id}")
    public void deleteLavoriEdili(@PathVariable Long id) {
        lavoriEdiliService.deleteById(id);
    }
}