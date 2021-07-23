package br.com.icaro.ratingsdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingsDataMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatingsDataMovieApplication.class, args);
    }

}
