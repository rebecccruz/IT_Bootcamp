package br.dh.meli.service;

import br.dh.meli.model.UserDB;
import br.dh.meli.repository.IUserDBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserDBRepo repo;

    public UserDB getUserById(long id) {
        return (UserDB) repo.findById(id).orElse(null);
    }
}
