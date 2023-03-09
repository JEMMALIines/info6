package tn.esprit.spring.info6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.info6.entities.Etudiant;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {


   // List<Etudiant> findByDepartmentIdDepartment(Integer id);
}
