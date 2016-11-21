package apc.entjava.moviet.Model;

/**
 * Created by chamb on 11/21/2016.
 */
public class Movie_has_Mall {

    private String movie_id;
    private String mall_id;

    public Movie_has_Mall() {
    }

    public Movie_has_Mall(String movie_id, String mall_id) {

        this.movie_id = movie_id;
        this.mall_id = mall_id;
    }

    public String getMovie_id() {

        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMall_id() {
        return mall_id;
    }

    public void setMall_id(String mall_id) {
        this.mall_id = mall_id;
    }
}
