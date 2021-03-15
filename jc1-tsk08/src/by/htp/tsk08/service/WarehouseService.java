package by.htp.tsk08.service;

import java.util.List;

import by.htp.tsk08.bean.Appliance;

public interface WarehouseService {
	List<Appliance> findByCategory(String name) throws ServiceException;
}
