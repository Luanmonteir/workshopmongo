package com.luanmonteiro.workshopmongo.config;

import com.luanmonteiro.workshopmongo.post.domain.Post;
import com.luanmonteiro.workshopmongo.post.repository.PostRepository;
import com.luanmonteiro.workshopmongo.user.domain.User;
import com.luanmonteiro.workshopmongo.user.domain.dto.AuthorDTO;
import com.luanmonteiro.workshopmongo.user.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {


    @Autowired
     private UserRepository  userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));


        Post post1= new Post(null,sdf.parse("21/03/2018"),"partiu viagem","vou viajar para Sao Paulo. Abraços!",new AuthorDTO(maria));
        Post post2= new Post(null,sdf.parse("23/03/2018"),"Bom Dia ","Acordei feliz hoje!",new AuthorDTO(maria));

        postRepository.saveAll(Arrays.asList(post1,post2));


        maria.getPosts().addAll(Arrays.asList(post1,post2));
        userRepository.save(maria);
    }
}
