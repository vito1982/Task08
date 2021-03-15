package by.htp.tsk08.service.impl;

import java.util.List;

import by.htp.tsk08.bean.Appliance;
import by.htp.tsk08.dao.ApplianceDAO;
import by.htp.tsk08.dao.DAOException;
import by.htp.tsk08.dao.DAOProvider;
import by.htp.tsk08.service.ServiceException;
import by.htp.tsk08.service.WarehouseService;

public class ImplWarehouseService implements WarehouseService {

	@Override
	public List<Appliance> findByCategory(String name) throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		ApplianceDAO applianceDAO = provider.getApplianceDAO();
		
		List<Appliance> appliances;
		
		try {
			appliances = applianceDAO.findByCategory(name);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return appliances;
	}

}
