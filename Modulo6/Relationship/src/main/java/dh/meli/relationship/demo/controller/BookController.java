package dh.meli.relationship.demo.controller;

import dh.meli.relationship.demo.model.Book;
import dh.meli.relationship.demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepo repo;

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable long id) {
        return ResponseEntity.ok(repo.findById(id).get());
    }

}
