package tn.esprit.twin.springclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin.springclasse.Entity.ChaineRestauration;

@Repository
public interface ChaineRestaurationRepository extends JpaRepository<ChaineRestauration, Long> {
}
