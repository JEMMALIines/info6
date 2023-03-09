package tn.esprit.spring.info6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.info6.entities.Department;
import tn.esprit.spring.info6.entities.Universite;
import tn.esprit.spring.info6.interfces.DepartementService;
import tn.esprit.spring.info6.repository.DepartementRepository;
import tn.esprit.spring.info6.repository.UniversiteRepository;

import java.util.List;

@Service

class DepartementServiceImpl implements DepartementService {

    @Autowired
    private DepartementRepository departementRepository;
    @Autowired
    private UniversiteRepository universiteRepository;
    @Override
    public List<Department> retrieveAllDepartements()  {
        return departementRepository.findAll();
    }


    @Override
    public Department addDepartement(Department d) {
        return departementRepository.save(d);
    }

    @Override
    public Department updateDepartement(Department d) {
        return departementRepository.save(d);
    }

    @Override
    public Department retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).orElse(null);
    }

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite u = universiteRepository.findById(idUniversite).orElse(null);
        Department d1 = departementRepository.findById(idDepartement).orElse(null);
        u.getDepartments().add(d1);
        universiteRepository.save(u);
    }
}
