package apc.entjava.moviet.Model;

/**
 * Created by chamb on 11/21/2016.
 */
public class Mall {

    private String id;
    private String name;

    public Mall() {
    }

    public Mall(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
