package tn.esprit.spring.info6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.info6.entities.Universite;
import tn.esprit.spring.info6.interfces.UniversiteService;
import tn.esprit.spring.info6.repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImpl implements UniversiteService {
    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }
}
