package tn.esprit.spring.info6.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.spring.info6.enums.Niveau;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe;
    private String nomEquipe;
    private Niveau niveau;
    @OneToOne
    private DetailEquipe DetailEquipe;
    @ManyToMany(mappedBy="Listequipe", cascade = CascadeType.ALL)
    private List<Etudiant> ListEtudiant_equipe;

}
