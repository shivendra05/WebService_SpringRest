package com.injection;

import java.util.Random;

public class StudentResult{

	public String getResult(){
		int p=new Random().nextInt(100);
		int c=new Random().nextInt(100);
		int m=new Random().nextInt(100);
		if(p>60 && c>60 && m>60)
			return "First Division Passed:: "+p+" "+c+" "+m;
		else if(p>55 && c>55 && m>55)
			return "Second Division Passed:: "+p+" "+c+" "+m;
		else if(p>45 && c>45 && m>45)
			return "Third Division Passed:: "+p+" "+c+" "+m;
		else 
			return "Failed:: "+p+" "+c+" "+m;
	}
	
}