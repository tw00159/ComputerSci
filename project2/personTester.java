/*
 * This program incorporates different java objects into several java classes
 * This is the test class for the java program that instantiates three new objects Person,Student,Instructor
 * Along with printing out all stipulations that are asked within the assignment.
 */
package project2;
import java.util.*;
import java.util.Date;
public class personTester 
{
	/*
	 * Main method titled Tester which instantiates three objects 
	 * Then states the perameters for each object are fufilled ie Birthday, Major, Salary
	 * This method also prints out the results for entire program.
	 */
	public static void main (String [] args)
	{
		
		System.out.println("1. Programmer's Name: Taylor Wilson");
		System.out.println("2. "+new Date());
		System.out.println("3. Project name: Project 2");
		Person JohnObj = new Person("John",1957);
		Student KimObj = new Student("Kim",1966,"Biology");
		Instructor PeterObj = new Instructor("Peter",2000, "$40,000.25"+"]");
		System.out.println("4. "+JohnObj);
		System.out.println("5. "+KimObj);
		System.out.println("6. "+PeterObj);
		
		}
		
	
	}







	
