package tn.esprit.spring.info6.interfces;
import tn.esprit.spring.info6.entities.Universite;
import java.util.List;
public interface UniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);
}
