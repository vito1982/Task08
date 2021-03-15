package by.htp.tsk08.dao;

import by.htp.tsk08.appliances.Laptop;
import by.htp.tsk08.appliances.Oven;
import by.htp.tsk08.appliances.Refrigerator;
import by.htp.tsk08.appliances.Speakers;
import by.htp.tsk08.appliances.TabletPC;
import by.htp.tsk08.appliances.VacuumCleaner;
import by.htp.tsk08.bean.Appliance;

public class Creator {
	public Appliance createAppliance(String name, String data) {
		Appliance appliance;
		String[] dataArray = data.split(", ");
		
		switch(name) {
			case ("Laptop") :
				appliance = new Laptop(Double.parseDouble(dataArray[0].split("=")[1]),
									dataArray[1].split("=")[1],
									Integer.parseInt(dataArray[2].split("=")[1]),
									Integer.parseInt(dataArray[3].split("=")[1]),
									Double.parseDouble(dataArray[4].split("=")[1]),
									Integer.parseInt(dataArray[5].split("=")[1]));
				break;
			case ("Oven") :
				appliance = new Oven(Integer.parseInt(dataArray[0].split("=")[1]),
									Double.parseDouble(dataArray[1].split("=")[1]),
									Integer.parseInt(dataArray[2].split("=")[1]),
									Double.parseDouble(dataArray[3].split("=")[1]),
									Double.parseDouble(dataArray[4].split("=")[1]),
									Double.parseDouble(dataArray[5].split("=")[1]));
				break;
			case ("Refrigerator") :
				appliance = new Refrigerator(Integer.parseInt(dataArray[0].split("=")[1]),
									Double.parseDouble(dataArray[1].split("=")[1]),
									Integer.parseInt(dataArray[2].split("=")[1]),
									Integer.parseInt(dataArray[3].split("=")[1]),
									Double.parseDouble(dataArray[4].split("=")[1]),
									Double.parseDouble(dataArray[5].split("=")[1])); 
				break;
			case ("Speakers") :
				appliance = new Speakers(Integer.parseInt(dataArray[0].split("=")[1]),
									Integer.parseInt(dataArray[1].split("=")[1]),
									dataArray[2].split("=")[1],
									Integer.parseInt(dataArray[3].split("=")[1]));
				break;
			case ("TabletPC") :
				appliance = new TabletPC(Integer.parseInt(dataArray[0].split("=")[1]),
									Integer.parseInt(dataArray[1].split("=")[1]),
									Integer.parseInt(dataArray[2].split("=")[1]),
									Integer.parseInt(dataArray[3].split("=")[1]),
									dataArray[4].split("=")[1]);
				break;
			case ("VacuumCleaner") :
				appliance = new VacuumCleaner(Integer.parseInt(dataArray[0].split("=")[1]),
									dataArray[1].split("=")[1],
									dataArray[2].split("=")[1],
									dataArray[3].split("=")[1],
									Integer.parseInt(dataArray[4].split("=")[1]),
									Integer.parseInt(dataArray[5].split("=")[1]));
				break;
			default:
				appliance = null;
				break;
		}
		
		return appliance;
	}
}
