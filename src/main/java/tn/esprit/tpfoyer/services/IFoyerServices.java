package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerServices {

    public Foyer findById(long id);
    public List<Foyer> findAll();
    public Foyer save(Foyer foyer);
    public void delete(Long id);
public Foyer getNomCapacite(String nom, Long capacite);
}
