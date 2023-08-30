package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Marque;

public interface ModelJPA extends JpaRepository<Marque, Long> {
	

}
