package tn.esprit.twin.springclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.twin.springclasse.Entity.Commande;
import tn.esprit.twin.springclasse.dto.CommandeDto;

import java.util.List;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    @Query("SELECT new tn.esprit.twin.springclasse.dto.CommandeDto(c.dateCommande, c.totalCommande, m.libelleMenu, cl.identifiant) "
	    + "FROM Commande c JOIN c.client cl JOIN c.menu m "
	    + "WHERE cl.identifiant = :identifiant AND m.libelleMenu = :libelleMenu")
    List<CommandeDto> findCommandesByClientIdentifiantAndMenuLibelle(@Param("identifiant") String identifiant,
								     @Param("libelleMenu") String libelleMenu);

}
