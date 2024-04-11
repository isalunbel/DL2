package org.example;

import org.example.PostController;
import org.example.PostRepository;
import org.example.PostRepositoryImpl;
import org.example.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public PostRepository postRepository() {
        return new PostRepositoryImpl();
    }

    @Bean
    public PostService postService(PostRepository repository) {
        return new PostService(repository);
    }

    @Bean
    public PostController postController(PostService service) {
        return new PostController(service);
    }
}
