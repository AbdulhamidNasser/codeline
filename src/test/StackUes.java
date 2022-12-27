package test;
import java.util.ArrayList;
import java.util.List;
//import java.util.Stack;
public class StackUes {
	    private final List<Integer> intStack;

	    public StackUes(int stackSize) {
	        intStack = new ArrayList<>(stackSize);
	    }

	    public void push(int item) {
	        intStack.add(0, item);
	    }

	    public int pop() {
	        if (!intStack.isEmpty()) {
	            int item = intStack.get(0);
	            intStack.remove(0);
	            return item;
	        } else {
	            return -1;
	        }
	    }

	    public int peek() {
	        if (!intStack.isEmpty()) {
	            return intStack.get(0);
	        } else {
	            return -1;
	        }
	    }

	    public List<Integer> getAllItems() {
	        return intStack;
	    }
	}
