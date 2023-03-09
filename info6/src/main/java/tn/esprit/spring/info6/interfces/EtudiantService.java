package tn.esprit.spring.info6.interfces;
import tn.esprit.spring.info6.entities.Etudiant;
import java.util.List;
public interface EtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
}
