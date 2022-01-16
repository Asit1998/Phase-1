package com.abc13;

class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}
public class accessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}

}

