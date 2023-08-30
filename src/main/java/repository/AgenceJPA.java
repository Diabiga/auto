package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Agence;

public interface AgenceJPA extends JpaRepository<Agence, Long> {

}
