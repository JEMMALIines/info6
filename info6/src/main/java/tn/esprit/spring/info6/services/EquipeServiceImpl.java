package tn.esprit.spring.info6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.info6.entities.Equipe;
import tn.esprit.spring.info6.interfces.EquipeService;
import tn.esprit.spring.info6.repository.EquipeRepository;

import java.util.List;


@Service
public class EquipeServiceImpl implements EquipeService {
    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).orElse(null);
    }
}
