package tn.esprit.twin.springclasse.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin.springclasse.Entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}