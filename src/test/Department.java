package test;

import java.util.ArrayList;

public class Department {
	
	int depID;
	//String dipName;
	Techer dep = new Techer();
	ArrayList<Techer> techList = new ArrayList<Techer>();
	
	

	public int getDepID() {
		return depID;
	}

	public void setDepID(int depID) {
		this.depID = depID;
	}

	
	
	public Techer getDep() {
		return dep;
	}

	public void setDep(Techer dep) {
		this.dep = dep;
	}

	public void message() {
		System.out.println("Hello, ");
		dep.display();
	}

}
