package tn.esprit.spring.info6.controllers;
import tn.esprit.spring.info6.entities.Equipe;
import tn.esprit.spring.info6.interfces.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/equipes")
@AllArgsConstructor
@RestController
public class EquipeController {
    EquipeService equipeService;
    @GetMapping("/get-all")
    public List<Equipe> retrieveAllEquipes() {
        return equipeService.retrieveAllEquipes();    }
    @GetMapping("/get-equipe/{id}")
    Equipe addEquipe(Equipe e) {
        return equipeService.addEquipe(e);    }
    @GetMapping("/update-equipe")
    Equipe updateEquipe(Equipe e) {
        return equipeService.updateEquipe(e);    }
    @GetMapping("/retrieve-equipe")
    Equipe retrieveEquipe(Integer idEquipe) {
        return equipeService.retrieveEquipe(idEquipe);    }
}
