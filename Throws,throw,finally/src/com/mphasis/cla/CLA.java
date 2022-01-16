package com.mphasis.cla;
import com.mphasis.displaymethod.*;


public class CLA {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		AgeValidation agevalidate = new AgeValidation();
		try {
		agevalidate.AgeValidator(14);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block Executed");
		}
		System.out.println("programm terminated");
	}

}


