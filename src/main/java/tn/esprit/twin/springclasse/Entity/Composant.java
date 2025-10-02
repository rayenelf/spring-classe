package tn.esprit.twin.springclasse.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @ManyToOne
    private Menu menu;

    @OneToMany(mappedBy = "composant")
    private List<DetailComposant> details;
}
