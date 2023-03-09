package tn.esprit.spring.info6.interfces;
import tn.esprit.spring.info6.entities.Department;
import java.util.List;
public interface DepartementService {
    List<Department> retrieveAllDepartements();

    Department addDepartement (Department d);

    Department updateDepartement (Department d);

    Department retrieveDepartement (Integer idDepart);

    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
