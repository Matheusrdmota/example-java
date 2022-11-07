package br.com.docker.exemplo.docker.service;

import br.com.docker.exemplo.docker.model.UserModel;
import br.com.docker.exemplo.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<UserModel> getUsers(){
        return this.repository.findAll();
    }
}
