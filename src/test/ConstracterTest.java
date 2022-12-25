package test;

public class ConstracterTest {
	
	String name;
	String father;
	String family;
	int myAge;
	ConstracterTest(){
		name = "Abdulhamid";
		
	}
	
	ConstracterTest(String fName){
		father = fName;
	}
	
	ConstracterTest(int age,String familyName){
		myAge = age;
		family = familyName;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstracterTest obj = new ConstracterTest();
		System.out.println("My Name is: " + obj.name);
		
		ConstracterTest obj1 = new ConstracterTest("Nasser");
		System.out.println("My Father Name is: " + obj1.father);
		
		ConstracterTest obj2 = new ConstracterTest(30,"Alhuseini");
		System.out.println("My Family : " + obj2.family + "\n" + "My Age: " + obj2.myAge);

	}

}
