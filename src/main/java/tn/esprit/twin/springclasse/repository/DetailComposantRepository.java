package tn.esprit.twin.springclasse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin.springclasse.Entity.DetailComposant;



@Repository
public interface DetailComposantRepository extends JpaRepository<DetailComposant, Long>{
}
