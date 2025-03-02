package tn.esprit.tpfoyer.services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.repositories.IChambreReposirtory;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreServices {

    IChambreReposirtory chambreReposirtory;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreReposirtory.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreReposirtory.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        if (chambreReposirtory.existsById(c.getIdChambre())) {
            return chambreReposirtory.save(c);
        }
        return null;
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreReposirtory.findById(idChambre).orElse(null);
    }
}