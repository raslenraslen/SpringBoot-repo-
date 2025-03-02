package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity







@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Etudiant {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEtudiant;
        private String nomEt;
        private String prenomEt;
        private Long cin;
        private String ecole;
        private Date dateNaissance;

        @ManyToMany(mappedBy = "etudiants")
        private List<Reservation> reservations ;

        public Long getIdEtudiant() {
                return idEtudiant;
        }

}