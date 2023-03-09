package tn.esprit.spring.info6.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepartment;
    private String nomDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="department")
    private List<Etudiant> ListEtudiant;


}
