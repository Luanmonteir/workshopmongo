package com.luanmonteiro.workshopmongo.user.services;


import com.luanmonteiro.workshopmongo.user.domain.User;
import com.luanmonteiro.workshopmongo.user.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> findAll() {
        List<User> user = repository.findAll();
        return user;
    }
}
