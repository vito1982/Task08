package by.htp.tsk08.controller.command.impl;

import by.htp.tsk08.bean.User;
import by.htp.tsk08.controller.command.Command;
import by.htp.tsk08.service.ClientService;
import by.htp.tsk08.service.ServiceException;
import by.htp.tsk08.service.ServiceProvider;

public class ChangeProfileCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params;
		String fName;
		String sName;
		String login;
		String password;
		
		params = request.split(" ");
		fName = params[1].split("=")[1];
		sName = params[2].split("=")[1];
		login = params[3].split("=")[1];
		password = params[4].split("=")[1];
		
		ServiceProvider provider = ServiceProvider.getInstance();
		ClientService clientService = provider.getClientService();
		
		User user = new User(fName, sName, login, password);
		
		boolean result;
		String responce;
		
		try {
			result = clientService.changeProfile(user);
			if(result) {
				responce = "Change Profile - OK";
			} else {
				responce = "Change Profile - ERROR";
			}
			
		} catch (ServiceException e) {
			responce = "Exception Error";
		}
		
		return responce;
	}

}
