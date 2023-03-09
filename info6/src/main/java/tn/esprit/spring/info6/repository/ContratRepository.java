package tn.esprit.spring.info6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.info6.entities.Contrat;
@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {

   // List<Contrat> findByEtudiantsIdEtudiant(Integer idContrat);
}
