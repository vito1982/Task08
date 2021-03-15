package by.htp.tsk08.controller;

import by.htp.tsk08.controller.command.Command;
import by.htp.tsk08.controller.command.CommandProvider;

public class ImplController implements Controller {
	
	private final CommandProvider provider = new CommandProvider();
	
	@Override
	public String doAction(String request) {
		String commandName;
		commandName = request.split(" ")[0];
		
		Command command;
		command = provider.getCommand(commandName);
		
		String responce;
		responce = command.execute(request);
		
		return responce;
	}

}
