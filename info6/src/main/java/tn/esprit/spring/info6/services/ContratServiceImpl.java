package tn.esprit.spring.info6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.info6.entities.Contrat;
import tn.esprit.spring.info6.interfces.ContratService;
import tn.esprit.spring.info6.repository.ContratRepository;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {
    @Autowired
    private ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrats()  {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {

        return contratRepository.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {

        return contratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);
    }

}
