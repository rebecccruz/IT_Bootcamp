package com.example.exemplo.controller;


import com.example.exemplo.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // A classe é um controller Rest
@RequestMapping("/user") // "/user" é usado para acionar este controller
public class Hello {

    @GetMapping("/ola/{nome}/{id}")
    public String digaHello(@PathVariable String nome, @PathVariable int id) {
        return "Olá " + nome + ": " + id + "!";
    }

    @GetMapping("/ola")
    public String digaHello2(@RequestParam String nome, @RequestParam int id) {
        return "Olá " + nome + ": " + id + "!";
    }

    @PostMapping
    public ResponseEntity<UserDto> getUser(@RequestBody User user) {
        if(user.getId() == 123) {
            UserDto userDto = new UserDto(user);
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }
}
