package fourdrone.dakcheerup.domain;

/**
 * Created by h0ngz on 2015. 8. 15..
 */


public class User {

    int id;
    String name;

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    String email;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }
}
