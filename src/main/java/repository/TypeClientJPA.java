package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.TypeClient;

public interface TypeClientJPA extends JpaRepository<TypeClient, Long> {

}
