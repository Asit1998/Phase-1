//1. Class is having Default access modifier 
class PubAccessSpecifier
{ 
  public void display() 
     { 
         System.out.println("You are using public access specifier"); 
     } 
} 

public class accessSpecifiers 
{
	public static void main(String[] args) {
		//default
		System.out.println("public Access Specifier");
		PubAccessSpecifier obj = new PubAccessSpecifier(); 		  
        obj.display(); 

	}
}
