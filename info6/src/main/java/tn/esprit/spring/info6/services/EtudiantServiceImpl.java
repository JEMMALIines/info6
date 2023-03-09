package tn.esprit.spring.info6.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.info6.entities.Contrat;
import tn.esprit.spring.info6.entities.Department;
import tn.esprit.spring.info6.entities.Equipe;
import tn.esprit.spring.info6.entities.Etudiant;
import tn.esprit.spring.info6.interfces.EtudiantService;
import tn.esprit.spring.info6.repository.ContratRepository;
import tn.esprit.spring.info6.repository.DepartementRepository;
import tn.esprit.spring.info6.repository.EquipeRepository;
import tn.esprit.spring.info6.repository.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class EtudiantServiceImpl implements EtudiantService {


    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private ContratRepository contratRepository;

    @Autowired
    private EquipeRepository equipeRepository;


    @Autowired
    private  DepartementRepository departementRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant e = etudiantRepository.findById(etudiantId).orElse(null);
        Department d = departementRepository.findById(departementId).orElse(null);
        e.setDepartment(d);
        etudiantRepository.save(e);

    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        e.setListequipe((List<Equipe>) equipe);
        e.setListcontrat((List<contrat>) contrat);
        etudiantRepository.save(e);
    }
}