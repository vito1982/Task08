package by.htp.tsk08.service.impl;

import by.htp.tsk08.bean.User;
import by.htp.tsk08.dao.DAOException;
import by.htp.tsk08.dao.DAOProvider;
import by.htp.tsk08.dao.UserDAO;
import by.htp.tsk08.service.ClientService;
import by.htp.tsk08.service.ServiceException;

public class ImplClientService implements ClientService {

	@Override
	public boolean logination(String login, String password) throws ServiceException {
		boolean result = false;
		
		if(login == null || login.equals("")) {
			return false;
		}
		
		DAOProvider provider = DAOProvider.getInstance();
		UserDAO userDAO = provider.getUserDAO();
		
		try {
			result = userDAO.logination(login, password);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

	@Override
	public boolean changeProfile(User user) throws ServiceException {
		boolean result = false;
		
		if(user == null) {
			return false;
		}
		
		DAOProvider provider = DAOProvider.getInstance();
		UserDAO userDAO = provider.getUserDAO();
		
		try {
			result = userDAO.changeProfile(user);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

}
