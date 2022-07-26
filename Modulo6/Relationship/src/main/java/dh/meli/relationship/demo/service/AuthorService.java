package dh.meli.relationship.demo.service;

import dh.meli.relationship.demo.model.Author;
import dh.meli.relationship.demo.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class AuthorService {

    @Autowired
    private AuthorRepo repo;

    @Transactional
    public Author save(Author author){
        author.getAddress().setAuthor(author);
        return repo.save(author);
    }

}
