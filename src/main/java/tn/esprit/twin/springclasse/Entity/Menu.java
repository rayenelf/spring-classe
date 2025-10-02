package tn.esprit.twin.springclasse.Entity;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private Float prixTotal;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToMany
    private List<ChefCuisinier> chefs;

    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;
}
