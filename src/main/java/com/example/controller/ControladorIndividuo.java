
package com.example.controller;

import com.example.entity.Individuo;
import com.example.servicio.IndividuoServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@Controller
public class ControladorIndividuo {
    @Autowired
    private IndividuoServicio individuoServicio;
    
    @GetMapping("/")
    
    public String comienzo(Model model){
        List<Individuo> individuos = individuoServicio.listarIndividuos();
        
        model.addAttribute("individuos",individuos);
        return "index";
    }
    
    @GetMapping("/anexar")
    public String anexar(Individuo individuo){
        return "cambiar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Individuo individuo){
        individuoServicio.guardarIndividuo(individuo);
        return "redirect:/";
    }
    
}
