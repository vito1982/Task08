package by.htp.tsk08.dao;

import by.htp.tsk08.dao.impl.ImplApplianceDAO;
import by.htp.tsk08.dao.impl.ImplUserDAO;

public final class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();
	
	private final UserDAO userDAO = new ImplUserDAO();
	private final ApplianceDAO applianceDAO = new ImplApplianceDAO();
	
	private DAOProvider() {}
	
	public static DAOProvider getInstance() {
		return instance;
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}
}
