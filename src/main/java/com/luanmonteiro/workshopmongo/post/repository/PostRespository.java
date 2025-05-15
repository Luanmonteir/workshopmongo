package com.luanmonteiro.workshopmongo.post.repository;

import com.luanmonteiro.workshopmongo.post.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRespository extends MongoRepository<Post,String> {
}
