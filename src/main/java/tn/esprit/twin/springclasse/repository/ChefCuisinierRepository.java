package tn.esprit.twin.springclasse.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinierRepository, Long> {
}
