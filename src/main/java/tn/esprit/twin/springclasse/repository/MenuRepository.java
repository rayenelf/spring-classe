package tn.esprit.twin.springclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin.springclasse.Entity.Menu; // <- important d'importer l'entité

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    // Tu peux ajouter ici des méthodes personnalisées si besoin
}
