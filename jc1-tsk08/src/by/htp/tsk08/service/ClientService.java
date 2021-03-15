package by.htp.tsk08.service;

import by.htp.tsk08.bean.User;

public interface ClientService {
	boolean logination(String login, String password) throws ServiceException;
	boolean changeProfile(User user) throws ServiceException;
}
