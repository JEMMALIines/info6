package tn.esprit.spring.info6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.info6.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Integer> {
   //  List<Universite> findByDepartment(Integer idUniv);
}
