package test;

import java.util.ArrayList;

public class Course {
	private int curseID;
	Mark marObj = new Mark();
	ArrayList<Mark> techList = new ArrayList<Mark>();
	
	public int getCurseID() {
	    return curseID;
	  }

	  // Setter
	  public void setCurseID(int newCurseID) {
	    this.curseID = newCurseID;
	  }


}
