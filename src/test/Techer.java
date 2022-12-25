package test;

import java.util.ArrayList;

public class Techer {
	
	Student stdobj =new Student();
	ArrayList<Student> techList = new ArrayList<Student>();

	String techarName;
	//int techerAge;
	
	public String getTecharName() {
	    return techarName;
	  }

	  // Setter
	  public void setTecharName(String newTecharName) {
	    this.techarName = newTecharName;
	  }
	
 public void display() {
	 System.out.println("This is teacher");
 }
}
