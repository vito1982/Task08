package by.htp.tsk08.dao;

import java.util.List;

import by.htp.tsk08.bean.Appliance;

public interface ApplianceDAO {
	List<Appliance> findByCategory(String name) throws DAOException;
}
