package by.htp.tsk08.main;

import by.htp.tsk08.controller.Controller;
import by.htp.tsk08.controller.ImplController;

public class Main {

	public static void main(String[] args) {
		Controller controller = new ImplController();
		
		System.out.println(controller.doAction("findbycategory category=Oven"));
	}

}
