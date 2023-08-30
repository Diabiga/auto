package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Voiture {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String immatriculation;

    @ManyToOne
    private Modele modele;

    @ManyToOne
    private Agence agence;

    private boolean disponible;

    @ManyToOne
    private TypeForfait typeForfait;

}
