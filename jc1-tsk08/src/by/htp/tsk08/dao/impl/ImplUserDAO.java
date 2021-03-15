package by.htp.tsk08.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import by.htp.tsk08.bean.User;
import by.htp.tsk08.dao.DAOException;
import by.htp.tsk08.dao.UserDAO;

public class ImplUserDAO implements UserDAO {
	
	private static final String path = "resources\\users.db";
		
	@Override
	public boolean logination(String login, String password) throws DAOException {
		
		boolean result = false;
		
		try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {
			
			String str;
			
			while(buffReader.ready()) {
				str = buffReader.readLine();
				if(str.split(" ")[2].equals(login) && str.split(" ")[3].equals(password)) {
					result = true;
				}
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}
		
		return result;
	}

	@Override
	public boolean changeProfile(User user) throws DAOException {
		
		boolean result = false;
		
		try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {
			
			String str;
			
			while(buffReader.ready()) {
				str = buffReader.readLine();
				if(str.split(" ")[0].equals(user.getfName()) &&
						str.split(" ")[1].equals(user.getsName()) &&
						str.split(" ")[2].equals(user.getLogin()) &&
						str.split(" ")[3].equals(user.getPassword())) {
					result = true;
				}
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}
		
		return result;
	}

}
