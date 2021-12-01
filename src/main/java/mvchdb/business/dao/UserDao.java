package mvchdb.business.dao;

import mvchdb.business.entities.User;

import java.util.List;

public interface UserDao {

    public List<User> getUsers();

    public void addUser(User user);

    public void updateUser();

    public void deleteUser(int id);

}
