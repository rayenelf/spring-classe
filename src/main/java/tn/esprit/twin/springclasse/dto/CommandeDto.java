package tn.esprit.twin.springclasse.dto;

import java.time.LocalDate;

public class CommandeDto {
    private LocalDate dateCommande;
    private Float montantCommande;
    private String libelleMenu;
    private String identifiantClient;

    public CommandeDto(LocalDate dateCommande, Float montantCommande, String libelleMenu, String identifiantClient) {
        this.dateCommande = dateCommande;
        this.montantCommande = montantCommande;
        this.libelleMenu = libelleMenu;
        this.identifiantClient = identifiantClient;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public Float getMontantCommande() {
        return montantCommande;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public String getIdentifiantClient() {
        return identifiantClient;
    }
}
