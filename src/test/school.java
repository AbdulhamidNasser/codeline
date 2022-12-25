package test;
public class school {
	private String name;
	
	//Department department1 = new Department();
	Department depobj = new Department();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}


/* import java.util.ArrayList;
  import java.util.Scanner;
public class school {
	public static void main(String[] args) {
	 String schoolName;
	 school schobj = new school();
	Scanner sc = new Scanner(System.in);
	ArrayList<Department> depList = new ArrayList<Department>();
	//ArrayList<Techer> techList = new ArrayList<Techer>();
	boolean opt1 = true;
	boolean opt2 = true;
	
	  

	System.out.println("Enter School Name");
	schoolName = sc.nextLine();
	

    while(opt1){
    Department depobj = new Department();
	System.out.println("Enter Department ID");
	int newdepID = sc.nextInt();
	depobj.setDepID(newdepID);
	
	while(opt2) {
	Techer techobj = new Techer();
	System.out.println("Enter Techer Name");
	String newTecharName = sc.next();
	techobj.setTecharName(newTecharName);
	
	System.out.println("Enter Student Name ");
	String newStudentName = sc.next();
	techobj.stdobj.setStudentName(newStudentName);
	
	System.out.println("Enter Course ID");
	int newCurseID = sc.nextInt();
	techobj.stdobj.corObg.setCurseID(newCurseID);
	
	System.out.println("Enter Mark");
	int newSMark = sc.nextInt();
	techobj.stdobj.corObg.marObj.setSMark(newSMark);
	depobj.techList.add(techobj);
	

	System.out.println("Do You Need Add New Techer ?");
	System.out.println("Enter 1 to add new Techer.");
	if(sc.nextInt()==1) {
		opt2 = true;
	}

	else if(sc.nextInt()!=1);{
    	opt2 = false;
    }
    
	}
	
	depList.add(depobj);
	System.out.println("Do You Need Add New department ?");
	opt2 = true;
	if(sc.nextInt()==1) {
		opt1 = true;
	}
	else if(sc.nextInt()!=1) {
		opt1 = false;
	}
	
    
    
    
    //output
    System.out.println("School Name :  " + schoolName);
	for(Department d : depList) {
		System.out.println("Department ID : " + d.getDepID());
		
		for(Techer t : d.techList) {
		System.out.println("Techer Name : " + t.getTecharName());
		
		
		System.out.println("Student Name : " + t.stdobj.getStudentName());
		
		
		System.out.println("Course ID : " + t.stdobj.corObg.getCurseID());
		
		
		System.out.println("Mark : " + t.stdobj.corObg.marObj.getSMark());
		
		}
		
	}
	

		
		
	
		
		
		
	
	

	


	
	
	}
	
	
	
	

	}
	}
	*/
