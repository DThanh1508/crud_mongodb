package test.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.demo.models.Movie;
import test.demo.repositories.MovieRepository;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Movie createNewMovie(
        @RequestBody Movie movie
    ) {
        return movieRepository.save(movie);
    }
    @GetMapping ()
    public Movie getAllMovie(
            @RequestBody Movie movie
    ){
        return movieRepository.findAll(movie);
    }
}
