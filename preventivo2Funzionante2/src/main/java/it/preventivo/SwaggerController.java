package it.preventivo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class SwaggerController {

    @GetMapping("/swagger")
    public String redirectToSwaggerUI() {
        return "redirect:/swagger-ui/index.html";
    }
}
