package br.ilso.app.register.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.ilso.app.register.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}