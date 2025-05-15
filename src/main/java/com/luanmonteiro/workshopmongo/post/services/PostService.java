package com.luanmonteiro.workshopmongo.post.services;


import com.luanmonteiro.workshopmongo.exception.ObjectNotFoundException;
import com.luanmonteiro.workshopmongo.post.domain.Post;
import com.luanmonteiro.workshopmongo.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;



    public Post findById(String id){
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }



}
