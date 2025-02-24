package tn.esprit.tpfoyer.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre  implements Serializable {
    @Id
    private Long idChambre;
    private Long numeroChambre;
    private TypeChambre typeChambre;
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    private List<Reservation> reservations;



}
