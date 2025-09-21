package com.demo.ServiceImpl;

import java.util.List;

import com.demo.DAOIMPL.UserDaoImpl;
import com.demo.Dao.UserDAO;
import com.demo.Online_Food_System.Entity.User;
import com.demo.Service.UserService;

public class UserServiceImple implements UserService {

    UserDAO userDao = new UserDaoImpl();

    

    @Override
    public User createUser(User user) {
        return userDao.createUser(user);
    }

    @Override
    public User getUser(int userId) {
        return userDao.getUser(userId);
    }

    @Override
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDao.deleteUser(userId);
    }

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}