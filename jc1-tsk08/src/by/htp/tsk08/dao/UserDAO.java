package by.htp.tsk08.dao;

import by.htp.tsk08.bean.User;

public interface UserDAO {
	boolean logination(String login, String password) throws DAOException;
	boolean changeProfile(User user) throws DAOException;
}
