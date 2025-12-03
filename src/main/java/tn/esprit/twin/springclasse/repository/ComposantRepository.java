package tn.esprit.twin.springclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin.springclasse.Entity.Client;
import tn.esprit.twin.springclasse.Entity.Composant;

@Repository
public interface ComposantRepository extends JpaRepository<Composant, Long> {
}
