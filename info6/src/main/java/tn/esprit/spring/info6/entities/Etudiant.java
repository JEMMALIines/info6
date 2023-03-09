package tn.esprit.spring.info6.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.spring.info6.enums.Opt;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer idEtudiant;
private String prenomE;
    @Enumerated(EnumType.STRING)
    private Opt opt;
    @ManyToOne
    private Department department;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiants")
    private List<Contrat> ListContrat;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Equipe> Listequipe;
}
