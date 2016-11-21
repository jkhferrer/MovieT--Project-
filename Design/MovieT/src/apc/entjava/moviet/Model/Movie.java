package apc.entjava.moviet.Model;

/**
 * Created by chamb on 11/21/2016.
 */
public class Movie {

    private String id;
    private String details;
    private String director;
    private String rating;
    private String casts;

    public Movie() {
    }

    public Movie(String id, String details, String director, String rating, String casts) {

        this.id = id;
        this.details = details;
        this.director = director;
        this.rating = rating;
        this.casts = casts;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }
}
