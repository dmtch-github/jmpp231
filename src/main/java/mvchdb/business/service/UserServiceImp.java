package mvchdb.business.service;

import mvchdb.business.dao.UserDao;
import mvchdb.business.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(@Qualifier("userEmDaoImp") UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    //@Transactional
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    //@Transactional
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
