package net.ubilife.hellogit;

import java.text.DecimalFormat;

public class TestTest {

	public static void main(String args[]) {
		double tempCompleted = 10; //number completed toward goal
    	double tempGoal = 18; //goal to reach for task
    	double percentageDone = 0.0; //percentage completed
    	
    	//if number completed > 0, then calculate percentage
    	if (tempCompleted > 0) {
    		percentageDone = tempCompleted / tempGoal;
    		percentageDone = percentageDone * 100;
    	}
    	
    	DecimalFormat dFormat = new DecimalFormat(".00");
        
        System.out.println(dFormat.format(percentageDone));
	}
}
