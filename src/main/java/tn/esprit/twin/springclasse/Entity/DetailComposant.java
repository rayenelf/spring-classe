package tn.esprit.twin.springclasse.Entity;

import jakarta.persistence.*;
@Entity
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @ManyToOne
    private Composant composant;
}
