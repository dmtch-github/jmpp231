package mvchdb.business.dao;

import mvchdb.business.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> list = session.createQuery("FROM User ",User.class).getResultList();
        return list;
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        String hqlDelete = "DELETE User where id = :id";
        session.createQuery(hqlDelete)
                .setParameter("id", id)
                .executeUpdate();
    }
}
