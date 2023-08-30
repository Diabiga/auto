package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Maintenance;

public interface MaintenaceJPA extends JpaRepository<Maintenance, Long> {

}
