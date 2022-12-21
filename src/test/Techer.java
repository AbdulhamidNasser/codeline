package test;

public class Techer {
	
	Student stdobj =new Student();

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
