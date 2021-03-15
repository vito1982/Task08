package by.htp.tsk08.service;

import by.htp.tsk08.service.impl.ImplClientService;
import by.htp.tsk08.service.impl.ImplWarehouseService;

public final class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	private final ClientService clientService = new ImplClientService();
	private final WarehouseService warehouseService = new ImplWarehouseService();
	
	private ServiceProvider() {}
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	public ClientService getClientService() {
		return clientService;
	}
	
	public WarehouseService getWarehouseService() {
		return warehouseService;
	}
}
