package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.net.server.Client;

public interface ClientJPA extends JpaRepository<Client, Long> {

}
