package tn.esprit.twin.springclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin.springclasse.Entity.ChefCuisinier; // <-- ton entité

@Repository
public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinier, Long> {
    // tu peux ajouter des méthodes personnalisées ici
}
