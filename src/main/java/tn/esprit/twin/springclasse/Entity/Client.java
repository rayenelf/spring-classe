package tn.esprit.twin.springclasse.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idClient;

    private String identifiant;
    private Date datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
}


