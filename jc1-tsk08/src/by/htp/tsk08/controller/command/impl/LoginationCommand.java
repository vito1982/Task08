package by.htp.tsk08.controller.command.impl;

import by.htp.tsk08.controller.command.Command;
import by.htp.tsk08.service.ClientService;
import by.htp.tsk08.service.ServiceException;
import by.htp.tsk08.service.ServiceProvider;

public class LoginationCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params;
		String login;
		String password;
	
		params = request.split(" ");
		login = params[1].split("=")[1];
		password = params[2].split("=")[1];
		
		ServiceProvider provider = ServiceProvider.getInstance();
		ClientService clientService = provider.getClientService();
		
		boolean result;
		String responce;
		
		try {
			result = clientService.logination(login, password);
			if(result) {
				responce = "Logination - OK";
			} else {
				responce = "Logination - ERROR";
			}
			
		} catch (ServiceException e) {
			responce = "Exception Error";
		}
		
		return responce;
	}

}
