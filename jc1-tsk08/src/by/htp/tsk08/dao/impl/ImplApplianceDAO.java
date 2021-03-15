package by.htp.tsk08.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.tsk08.bean.Appliance;
import by.htp.tsk08.dao.ApplianceDAO;
import by.htp.tsk08.dao.Creator;
import by.htp.tsk08.dao.DAOException;

public class ImplApplianceDAO implements ApplianceDAO {

	private static final String path = "resources\\appliances.db";
	
	@Override
	public List<Appliance> findByCategory(String name) throws DAOException {
		
		List<Appliance> appliances = new ArrayList<>();
		Creator creator = new Creator();
		
		try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {
			
			String str;
			
			while(buffReader.ready()) {
				str = buffReader.readLine();
				
				if(str.split(" :" )[0].equals(name)) {
					appliances.add(creator.createAppliance(name, str.split(" : ")[1]));
				}
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}
	
		return appliances;
	}

}
