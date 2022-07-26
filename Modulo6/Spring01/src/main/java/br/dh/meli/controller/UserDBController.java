package br.dh.meli.controller;

import br.dh.meli.model.UserDB;
import br.dh.meli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserDBController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserDB> buscaPorId(@PathVariable long id) {
        UserDB userFound = userService.getUserById(id);
        if (userFound != null) {
            return ResponseEntity.ok(userFound);
        }
        return ResponseEntity.notFound().build();
    }


}
