package test;
import java.util.ArrayList;
import java.util.Scanner;
public class MainSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean opt1 = true;
		boolean opt2 = true;
		boolean opt3 = true;
		boolean opt4 = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<Department> departmentList = new ArrayList<Department>();
		school schoolobj = new school();
		System.out.println("Please Enter Your School ID : ");
		schoolobj.setName(sc.nextLine());
		
		while (opt1) {

			Department depobj = new Department();
			
			System.out.println("Please Enter Your Department ID : ");
			depobj.setDepID(sc.nextInt());
			while (opt2) {

				Techer techerobj = new Techer();
				System.out.println("Please Enter Teacher Your Name : ");
				techerobj.setTecharName(sc.next());
				
				while (opt3) {
					Student studobj = new Student();
					System.out.print("Please Enter Student name : ");
					studobj.setStudentName(sc.next());
					
					while (opt4) {
						Course courobj = new Course();
						
						System.out.print("Please Enter Course ID : ");
						courobj.setCurseID(sc.nextInt());
						System.out.print("Please Enter Mark : ");
						courobj.marObj.setSMark(sc.nextInt());
						
						studobj.coursList.add(courobj);
						
						System.out.print("If You Want Add More course Pres 1 : ");
						if (sc.nextInt() != 1) {
							opt4 = false;
 
						}
						
					}

					techerobj.stdList.add(studobj);
					System.out.print("If You Want Add More Student Pres 1 : ");
					if (sc.nextInt() != 1) {
						opt3 = false;

					}
					
					opt4 = true;

				}
				depobj.techList.add(techerobj);

				System.out.print("If You Want Add More Teacher Pres 1 : ");
				opt3 = true;
				if (sc.nextInt() != 1) {
					opt2 = false;
					
				}
			}
			departmentList.add(depobj);

			System.out.print("If You Want Add More Department Pres 1 : ");
			opt2 = true;
			
			if (sc.nextInt() != 1) {
				opt1 = false;
				
				System.out.println(" School Name :" + schoolobj.getName());
				
				for (Department department : departmentList) {
					System.out.println(" Department name is " + department.getDepID());
				}

					
					
			


	}

}
