package io.tar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan
@EnableWebMvc
public class Application extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/*")
                .allowedOrigins("http://mocker.egen.io")
                .allowedMethods("PUT", "POST")
                .allowedHeaders("accepts","Origin", "Access-Control-Request-Method","Access-Control-Request-Method","Access-Control-Allow-Origin")
                .allowCredentials(true).maxAge(3600);
    }
}
