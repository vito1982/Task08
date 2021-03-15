package by.htp.tsk08.controller.command.impl;

import java.util.List;

import by.htp.tsk08.bean.Appliance;
import by.htp.tsk08.controller.command.Command;
import by.htp.tsk08.service.ServiceException;
import by.htp.tsk08.service.ServiceProvider;
import by.htp.tsk08.service.WarehouseService;

public class FindByCategoryCommand implements Command {

	@Override
	public String execute(String request) {
		
		String[] params;
		String category;
	
		params = request.split(" ");
		category = params[1].split("=")[1];
		
		ServiceProvider provider = ServiceProvider.getInstance();
		WarehouseService warehouseService = provider.getWarehouseService();
		
		String responce;
		List<Appliance> appliances;
		
		try {
			appliances = warehouseService.findByCategory(category);
			
			responce = "Found elements: " + appliances.size();
			
		} catch (ServiceException e) {
			responce = "Exception Error";
		}
		
		return responce;
	}
}
