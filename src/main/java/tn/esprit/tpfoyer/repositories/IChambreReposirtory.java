package tn.esprit.tpfoyer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Chambre;

@Repository
public interface IChambreReposirtory extends CrudRepository<Chambre, Long> {
}
