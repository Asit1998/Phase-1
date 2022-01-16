import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Write a program to read, write, and append a file 

public class Abc {
	
	public static void main (String[] args) throws IOException
	{
		
		@SuppressWarnings("unused")
		
		FileWriter file = new FileWriter("E://Java//Asit//Writer.txt",true );
		BufferedWriter Bw= new BufferedWriter(file);
		Bw.write("Is my contry");
		@SuppressWarnings("resource")
		BufferedReader Br = new BufferedReader(new FileReader ("E://Java//Asit//Writer.txt"));
		Bw.newLine();
		Bw.close();
		Br.read();
		file.close();
		System.out.println("File Created");
		System.out.println("Program Completed");
	}

}