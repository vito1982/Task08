package by.htp.tsk08.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.tsk08.controller.command.impl.ChangeProfileCommand;
import by.htp.tsk08.controller.command.impl.FindByCategoryCommand;
import by.htp.tsk08.controller.command.impl.LoginationCommand;
import by.htp.tsk08.controller.command.impl.NoFoundCommand;

public class CommandProvider {
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("logination", new LoginationCommand());
		commands.put("changeprofile", new ChangeProfileCommand());
		commands.put("findbycategory", new FindByCategoryCommand());
		commands.put("nocomand", new NoFoundCommand());
	}
	
	public Command getCommand(String commandName) {
		Command command;
		
		command = commands.get(commandName);
		if(command == null) {
			command = commands.get("nocomand");
		}
		
		return command;
	}
}
