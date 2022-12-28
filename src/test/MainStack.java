package test;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MainStack {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Stack <String> sck = new Stack<String>();
    	
    	System.out.println("Enter School Name :");
    	
    	sck.push(sc.next());
    	System.out.println("Enter School ID :");
    	
    	sck.push(sc.next());
    	File fil = new File("C:\\Users\\Lenovo\\eclipse-workspace\\test\\src\\test\\new.txt");
    	try {
			FileWriter fw = new FileWriter(fil);
			for(String x : sck) {
	    		fw.write(x);
	    		fw.write("-");
	    	}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Enter word need to search :");
    	String serachWord = sc.next(); 
    	int counter = 0;
    	try {
    		Scanner ns = new Scanner(fil);
    		while (ns.hasNext()) {
    			String[] content = ns.nextLine().split("-");
    			for(int i = 0; i < content.length; i++) {
    				
    				if(serachWord.equalsIgnoreCase(content[i])) {
    					counter++;
    					System.out.println(" the word : " + content[i]);
    				}
    			}
    			
    		}
    		System.out.println("this word search is in the file :"+counter);
    		ns.close();
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	
    	
    	
    	
    	
       
        }
    }
