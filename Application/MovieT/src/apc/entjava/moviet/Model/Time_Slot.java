package apc.entjava.moviet.Model;

/**
 * Created by chamb on 11/21/2016.
 */
public class Time_Slot {

    private String id;
    private String datetime;
    private String movieId;

    public Time_Slot() {
    }

    public Time_Slot(String id, String datetime, String movieId) {

        this.id = id;
        this.datetime = datetime;
        this.movieId = movieId;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
