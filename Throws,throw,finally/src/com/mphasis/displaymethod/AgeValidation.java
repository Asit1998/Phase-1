package com.mphasis.displaymethod;
import com.mphasis.exception.*;

public class AgeValidation {
	public void AgeValidator(int age) throws Exception{
		// TODO Auto-generated method stub
		if(age>=18)
		{
			System.out.println("Right to Vote");
		}
		else
		{
			throw new InvalidAgeException("Dont Right to Vote");
		}
	}

}

