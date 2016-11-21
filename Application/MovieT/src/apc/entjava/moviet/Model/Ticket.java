package apc.entjava.moviet.Model;

/**
 * Created by chamb on 11/21/2016.
 */
public class Ticket {

    private String id;
    private String code;
    private String price;
    private String movieId;

    public Ticket() {
    }

    public Ticket(String id, String code, String price, String movieId) {

        this.id = id;
        this.code = code;
        this.price = price;
        this.movieId = movieId;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
