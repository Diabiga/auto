package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Voiture;

public interface VoitureJPA extends JpaRepository<Voiture, Long> {

}
