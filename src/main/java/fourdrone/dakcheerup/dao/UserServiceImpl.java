package fourdrone.dakcheerup.dao;

import fourdrone.dakcheerup.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by h0ngz on 2015. 8. 15..
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired UserDao dao;
    @Override
    public void add(User user) {


    }

    @Override
    public List<User> list() {
        return dao.list();
    }
}
