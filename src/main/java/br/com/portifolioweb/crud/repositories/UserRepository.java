package br.com.portifolioweb.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolioweb.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
