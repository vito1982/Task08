package by.htp.tsk08.controller.command.impl;

import by.htp.tsk08.controller.command.Command;

public class NoFoundCommand implements Command {

	@Override
	public String execute(String request) {
		String responce;
		
		responce = "Unknown command.";
		
		return responce;
	}

}
