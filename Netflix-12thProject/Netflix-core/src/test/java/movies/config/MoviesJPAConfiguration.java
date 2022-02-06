package movies.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MoviesJPAConfiguration.class)
public class MoviesJPAConfiguration {
    //just in case if I have to create other Bean notations
    //To separate and organize the @Bean
}