package com.luanmonteiro.workshopmongo.user.services;


import com.luanmonteiro.workshopmongo.exception.ObjectNotFoundException;
import com.luanmonteiro.workshopmongo.user.domain.User;
import com.luanmonteiro.workshopmongo.user.domain.dto.UserDTO;
import com.luanmonteiro.workshopmongo.user.respository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> findAll() {
        List<User> user = repository.findAll();
        return user;
    }

    public User findById(String id){
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return repository.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repository.deleteById(id);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(),objDto.getEmail());
    }
}
