package tn.esprit.spring.info6.controllers;
import tn.esprit.spring.info6.entities.Etudiant;
import tn.esprit.spring.info6.interfces.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/etudiants")
@AllArgsConstructor
@RestController
public class EtudiantController {

    EtudiantService etudiantService;


    @GetMapping("/get-all")
    List<Etudiant> getAllEtudiants(){
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/get-etudiant/{id}")
    Etudiant getEtudiant(@PathVariable Integer id){
        return  etudiantService.retrieveEtudiant(id);
    }


    @PostMapping("/add-etudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return  etudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/put-etudiant")
    Etudiant putEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("delete-etudiant/{id}")
    void deleteEtudiant(@PathVariable Integer id){
        etudiantService.removeEtudiant(id);
    }

    @PutMapping("/assignetudiantdep/{etdudiantId}/{departementId}")
    public void assignEtudiantToDep( @PathVariable("etdudiantId") Integer etudiantId,
                                     @PathVariable("departementId")  Integer departementId) {
        etudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }

    @PutMapping("/addAndAssignEtudiantToEquipeAndContract/{e}/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,
                                                            @PathVariable Integer idContrat,
                                                            @PathVariable Integer idEquipe) {
        etudiantService.addAndAssignEtudiantToEquipeAndContract(e, idContrat, idEquipe);

        return e;
    }
}
