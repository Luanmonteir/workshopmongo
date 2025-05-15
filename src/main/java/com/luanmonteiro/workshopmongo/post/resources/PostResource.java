package com.luanmonteiro.workshopmongo.post.resources;


import com.luanmonteiro.workshopmongo.post.domain.Post;
import com.luanmonteiro.workshopmongo.post.services.PostService;
import com.luanmonteiro.workshopmongo.user.domain.User;
import com.luanmonteiro.workshopmongo.user.domain.dto.UserDTO;
import com.luanmonteiro.workshopmongo.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostService service;



    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
       return ResponseEntity.ok().body(obj);
    }

}