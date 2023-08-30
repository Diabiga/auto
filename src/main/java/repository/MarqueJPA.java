package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Marque;

public interface MarqueJPA extends JpaRepository<Marque, Long> {

}
