package tn.esprit.spring.info6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.info6.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
    //List<Equipe> findByidEquipe(Integer idEquipe);
}
