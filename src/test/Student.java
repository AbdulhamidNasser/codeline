package test;

import java.util.ArrayList;

public class Student {
	private String studentName;
	
	Course corObg = new Course();
	ArrayList<Course> coursList = new ArrayList<Course>();
	public String getStudentName() {
	    return studentName;
	  }

	  // Setter
	  public void setStudentName(String newStudentName) {
	    this.studentName = newStudentName;
	  }


}
