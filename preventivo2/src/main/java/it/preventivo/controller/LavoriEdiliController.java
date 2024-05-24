package it.preventivo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import it.preventivo.entity.LavoriEdili;
import it.preventivo.service.LavoriEdiliService;

import java.util.List;

@Controller
@RequestMapping("/lavori-edili")
public class LavoriEdiliController {

    @Autowired
    private LavoriEdiliService lavoriEdiliService;

    @GetMapping
    public String mostraTutti(Model model) {
        List<LavoriEdili> lavoriEdili = lavoriEdiliService.findAll();
        model.addAttribute("lavori", lavoriEdili);
        return "lavori_edili";
    }

    @GetMapping("/nuovo")
    public String mostraFormNuovo(Model model) {
        model.addAttribute("lavoro", new LavoriEdili());
        return "form_lavoro";
    }

    @PostMapping("/nuovo")
    public String salvaNuovo(@ModelAttribute("lavoro") LavoriEdili lavoro) {
        lavoriEdiliService.save(lavoro);
        return "redirect:/lavori-edili";
    }

    @GetMapping("/{id}/modifica")
    public String mostraFormModifica(@PathVariable("id") long id, Model model) {
        LavoriEdili lavoro = lavoriEdiliService.findById(id);
        if (lavoro == null) {
            return "redirect:/lavori-edili";
        }
        model.addAttribute("lavoro", lavoro);
        return "form_lavoro";
    }

    @PostMapping("/{id}/modifica")
    public String salvaModifiche(@PathVariable("id") long id, @ModelAttribute("lavoro") LavoriEdili lavoro) {
        lavoro.setId(id);
        lavoriEdiliService.save(lavoro);
        return "redirect:/lavori-edili";
    }

    @GetMapping("/{id}/elimina")
    public String elimina(@PathVariable("id") long id) {
        lavoriEdiliService.deleteById(id);
        return "redirect:/lavori-edili";
    }
}

