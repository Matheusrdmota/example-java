package br.com.docker.exemplo.docker.controller;

import br.com.docker.exemplo.docker.model.UserModel;
import br.com.docker.exemplo.docker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/get-users")
    public ResponseEntity<List<UserModel>> getUsers(){
        return ResponseEntity.ok(this.service.getUsers());
    }
}
