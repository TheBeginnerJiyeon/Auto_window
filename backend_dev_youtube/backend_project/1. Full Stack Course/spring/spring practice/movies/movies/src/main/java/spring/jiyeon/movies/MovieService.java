package spring.jiyeon.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;

@Service
@CrossOrigin(origins = "*")
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();

    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
