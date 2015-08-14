package fourdrone.dakcheerup.dao;

import fourdrone.dakcheerup.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

import java.util.List;

/**
 * Created by h0ngz on 2015. 8. 15..
 */
public class UserDaoIbatis implements UserDao {
    @Autowired SqlMapClientTemplate sqlMapClientTemplate;

    @Override
    public void add(User user) {
        sqlMapClientTemplate.insert("User.add",user);
    }

    @Override
    public List<User> list() {
        return sqlMapClientTemplate.queryForList("User.list");
    }
}
