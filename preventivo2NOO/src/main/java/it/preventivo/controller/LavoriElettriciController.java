package it.preventivo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import it.preventivo.entity.LavoriElettrici;
import it.preventivo.service.LavoriElettriciService;

import java.util.List;

@Controller
@RequestMapping("/lavori-elettrici")
public class LavoriElettriciController {

    @Autowired
    private LavoriElettriciService lavoriElettriciService;

    @GetMapping
    public String getAllLavoriElettrici(Model model) {
        List<LavoriElettrici> lavori = lavoriElettriciService.findAll();
        model.addAttribute("lavori", lavori);
        return "lavori_elettrici_list"; // Nome corretto della vista
    }

    @GetMapping("/nuovo")
    public String showCreateForm(Model model) {
        model.addAttribute("lavoro", new LavoriElettrici());
        return "lavori_elettrici_form"; // Nome corretto della vista
    }

    @PostMapping
    public String createLavoriElettrici(@ModelAttribute("lavoro") LavoriElettrici lavoro, RedirectAttributes redirectAttributes) {
        lavoriElettriciService.save(lavoro);
        redirectAttributes.addFlashAttribute("successMessage", "Lavoro creato con successo!");
        return "redirect:/lavori-elettrici";
    }

    @GetMapping("/{id}/modifica")
    public String showUpdateForm(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) {
        LavoriElettrici lavoro = lavoriElettriciService.findById(id);
        if (lavoro == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Lavoro non trovato!");
            return "redirect:/lavori-elettrici";
        }
        model.addAttribute("lavoro", lavoro);
        return "lavori_elettrici_form"; // Nome corretto della vista
    }

    @PostMapping("/{id}")
    public String updateLavoriElettrici(@PathVariable("id") Long id, @ModelAttribute("lavoro") LavoriElettrici lavoroDetails, RedirectAttributes redirectAttributes) {
        LavoriElettrici lavoro = lavoriElettriciService.findById(id);
        if (lavoro == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Lavoro non trovato!");
            return "redirect:/lavori-elettrici";
        }
        lavoro.setCodice(lavoroDetails.getCodice());
        lavoro.setDescrizione(lavoroDetails.getDescrizione());
        lavoro.setPrezzo(lavoroDetails.getPrezzo());
        lavoro.setQuantitaMisuraPezzi(lavoroDetails.getQuantitaMisuraPezzi());
        lavoro.setSigla(lavoroDetails.getSigla());
        lavoriElettriciService.save(lavoro);
        redirectAttributes.addFlashAttribute("successMessage", "Lavoro aggiornato con successo!");
        return "redirect:/lavori-elettrici";
    }

    @GetMapping("/{id}/elimina")
    public String deleteLavoriElettrici(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        LavoriElettrici lavoro = lavoriElettriciService.findById(id);
        if (lavoro == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Lavoro non trovato!");
            return "redirect:/lavori-elettrici";
        }
        lavoriElettriciService.deleteById(id);
        redirectAttributes.addFlashAttribute("successMessage", "Lavoro eliminato con successo!");
        return "redirect:/lavori-elettrici";
    }
}
