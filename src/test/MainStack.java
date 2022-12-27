package test;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainStack {
    public static void main(String[] args) {
    	StackUes stackClassObj = new StackUes(5);
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Stack Items:");

    	stackClassObj.push(sc.nextInt());
    	stackClassObj.push(sc.nextInt());
    	stackClassObj.push(sc.nextInt());
    	stackClassObj.push(sc.nextInt());
    	stackClassObj.push(sc.nextInt());
        System.out.println("Topmost Element of the stack: " + stackClassObj.peek());
        System.out.println("All Stack Items:");
        
        for (Integer allItem : stackClassObj.getAllItems()) {
            System.out.println(allItem);
        }

        stackClassObj.pop();
        System.out.println("All Stack Items After popping one item:");
        
        for (Integer allItem : stackClassObj.getAllItems()) {
            System.out.println(allItem);
        }
    }
}