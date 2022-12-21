/*package test;

public class Hello {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		

	}

}
*/



/*package test;
import java.util.ArrayList;
import java.util.Scanner;
public class school {
	public static void main(String[] args) {
	 String schoolName;
	Scanner sc = new Scanner(System.in);
	ArrayList<Department> depList = new ArrayList<Department>();
	ArrayList<Techer> techList = new ArrayList<Techer>();
	
	

	System.out.println("Enter School Name");
	schoolName = sc.nextLine();
	

    do{
    Department depobj = new Department();
	System.out.println("Enter Department ID");
	int newdepID = sc.nextInt();
	depobj.setDepID(newdepID);
	
	System.out.println("Enter Techer Name");
	String newTecharName = sc.next();
	depobj.dep.setTecharName(newTecharName);
	
	System.out.println("Enter Student Name ");
	String newStudentName = sc.next();
	depobj.dep.stdobj.setStudentName(newStudentName);
	
	System.out.println("Enter Course ID");
	int newCurseID = sc.nextInt();
	depobj.dep.stdobj.corObg.setCurseID(newCurseID);
	
	System.out.println("Enter Mark");
	int newSMark = sc.nextInt();
	depobj.dep.stdobj.corObg.marObj.setSMark(newSMark);
	depList.add(depobj);
	System.out.println("Do You Need Add New department ?");
	System.out.println("Enter 1 to add new.");

    }while(sc.nextInt()==1);
    
   // if(sc.nextInt()==1) {
    	
    	
  //  }
    
    
    //output
    System.out.println("School Name :  " + schoolName);
	for(Department d : depList) {
		
		
		System.out.println("Department ID : " + d.getDepID());
		
		
		System.out.println("Techer Name : " + d.dep.getTecharName());
		
		
		System.out.println("Student Name : " + d.dep.stdobj.getStudentName());
		
		
		System.out.println("Course ID : " + d.dep.stdobj.corObg.getCurseID());
		
		
		System.out.println("Mark : " + d.dep.stdobj.corObg.marObj.getSMark());
		
		
		
	}
	

		
		
	
		
		
		
	
	

	


	
	
	}
	
	
	
	

}
*/
//*************************************************