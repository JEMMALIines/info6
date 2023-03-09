package tn.esprit.spring.info6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.info6.entities.Department;
@Repository
public interface DepartementRepository extends JpaRepository<Department,Integer> {


   // List<Department> findByUniversiteidUniv(Integer id);
}

