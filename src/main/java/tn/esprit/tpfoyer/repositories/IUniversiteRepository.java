package tn.esprit.tpfoyer.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Universite;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite, Long> {
}