package it.preventivo.controller;

import it.preventivo.entity.LavoriRestauro;
import it.preventivo.service.LavoriRestauroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lavoriRestauro")
public class LavoriRestauroController {

    @Autowired
    private LavoriRestauroService lavoriRestauroService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("lavoriRestauroList", lavoriRestauroService.findAll());
        return "lavoriRestauro/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("lavoriRestauro", new LavoriRestauro());
        return "lavoriRestauro/form";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute LavoriRestauro lavoriRestauro) {
        lavoriRestauroService.save(lavoriRestauro);
        return "redirect:/lavoriRestauro/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("lavoriRestauro", lavoriRestauroService.findById(id).orElse(null));
        return "lavoriRestauro/form";
    }

    @PostMapping("/edit/{id}")
    public String edit(@ModelAttribute LavoriRestauro lavoriRestauro) {
        lavoriRestauroService.save(lavoriRestauro);
        return "redirect:/lavoriRestauro/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        lavoriRestauroService.deleteById(id);
        return "redirect:/lavoriRestauro/list";
    }
}

