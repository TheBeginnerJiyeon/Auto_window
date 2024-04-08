package spring.jiyeon.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Document(collection = "MOVIES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin(origins = "*")
public class Movie {
    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> backdrops;

    private List<String> genres;

    @DocumentReference
    private List<Review> reviewIds;

}
