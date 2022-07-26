package br.dh.meli.repository;

import br.dh.meli.model.UserDB;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDBRepo extends CrudRepository<UserDB, Long> {

}
