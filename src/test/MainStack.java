package test;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.io.File;
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
	    	}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
       
        }
    }
