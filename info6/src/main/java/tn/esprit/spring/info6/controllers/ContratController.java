package tn.esprit.spring.info6.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.info6.entities.Contrat;
import tn.esprit.spring.info6.interfces.ContratService;


import java.util.List;

@RequestMapping("/contracts")
@AllArgsConstructor
@RestController
public class ContratController {

    ContratService contratService;


    @GetMapping("/get-all")
    List<Contrat> getAllContrat(){
        return contratService.retrieveAllContrats();
    }

    @GetMapping("/get-contrat/{id}")
    Contrat getContrat(@PathVariable Integer id){
        return  contratService.retrieveContrat(id);
    }


    @PostMapping("/add-co00ntrat")
    Contrat addEtudiant(@RequestBody Contrat contrat){
        return  contratService.addContrat(contrat);
    }

    @PutMapping("/put-contrat")
    Contrat putEtudiant(@RequestBody Contrat contrat){
        return contratService.updateContrat(contrat);
    }


    @DeleteMapping("delete-contrat/{id}")
    void deleteContrat(@PathVariable Integer id){
        contratService.removeContrat(id);
    }
}
