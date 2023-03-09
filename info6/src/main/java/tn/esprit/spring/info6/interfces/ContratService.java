package tn.esprit.spring.info6.interfces;
import tn.esprit.spring.info6.entities.Contrat;
import java.util.List;
public interface ContratService {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);
}
