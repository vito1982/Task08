package by.htp.tsk08.bean;

import java.io.Serializable;

public class Appliance implements Serializable {
	private static final long serialVersionUID = -1756611671327219302L;

	private boolean statusOnOff;
	
	public Appliance() {}
	
	public Appliance(boolean statusOnOff) {
		super();
		this.statusOnOff = statusOnOff;
	}

	public void on() {
		this.statusOnOff = true;
	}
	
	public void off() {
		this.statusOnOff = false;
	}
	
	public boolean isStatusOnOff() {
		return statusOnOff;
	}
	
	public void setStatusOnOff(boolean statusOnOff) {
		this.statusOnOff = statusOnOff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (statusOnOff ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		if (statusOnOff != other.statusOnOff)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appliance [statusOnOff=" + statusOnOff + "]";
	}
}
