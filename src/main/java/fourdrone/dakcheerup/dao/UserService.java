package fourdrone.dakcheerup.dao;

import fourdrone.dakcheerup.domain.User;

import java.util.List;

/**
 * Created by h0ngz on 2015. 8. 15..
 */
public interface UserService {

    void add (User user);

    List<User> list();

}
