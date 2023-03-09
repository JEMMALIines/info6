package tn.esprit.spring.info6.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.info6.entities.Department;
import tn.esprit.spring.info6.interfces.DepartementService;

import java.util.List;
@RequestMapping("/departement")
@AllArgsConstructor
@RestController
public class DepartementController {
    DepartementService departementService;


    @GetMapping("/get-all")
    List<Department> getAllDepartment(){
        return departementService.retrieveAllDepartements();
    }

    @PostMapping("/add-departement")
    Department addDepartement(@RequestBody Department contrat){
        return  departementService.addDepartement(contrat);
    }
    @PostMapping("/update-departement")
    Department updateDepartement(@RequestBody Department d) {

        return departementService.addDepartement(d);
    }

    @PostMapping("/get-departement")
    public Department retrieveDepartement(Integer idDepart) {
        return departementService.retrieveDepartement(idDepart);
    }
    @PutMapping("/assignUniversiteToDepartement/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement( @PathVariable("idUniversite") Integer idUniversite,
                                     @PathVariable("idDepartement")  Integer idDepartement) {
        departementService.assignUniversiteToDepartement(idUniversite,idDepartement);
    }


}
