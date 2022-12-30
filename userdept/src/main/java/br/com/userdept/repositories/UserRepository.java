package br.com.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.userdept.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
