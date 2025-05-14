package com.luanmonteiro.workshopmongo.user.resources;


import com.luanmonteiro.workshopmongo.user.domain.User;
import com.luanmonteiro.workshopmongo.user.domain.dto.UserDTO;
import com.luanmonteiro.workshopmongo.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = service.findAll();
        List<UserDTO>listDto = list.stream().map(x->new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
}