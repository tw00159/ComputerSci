package final;
/* Taylor Wilson
 * 12/11/2019
 * 11Am Class
 * This program seeks to input a file hotel.txt and then calculate the total expenses for each category listed below 
 * based upon the service the individual used.
 * It then outputs the totals to a separate file in clean rows with format specifiers used
 * 
 * Below I name my package and import a wild card element to allow for the importation of multiple objects
 * needed to execute this program.
 */

//package FileIOFinal;
import  java.io.*;
import java.io.File;
import java.util.*;

public class finalFileO 
{

	public static void main(String [] args) throws FileNotFoundException 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input File: ");
		String inputfile = in.nextLine();
      System.out.print("Output File: ");
      String outputfile = in.nextLine();
		
		try
		{
		
			Scanner Keyboard = new Scanner (new File(inputfile));
			
			PrintStream diskWriter = new PrintStream(outputfile);
			
			/*
			 * Initializing the variables that are specified in the original .txt doc
			 */
				double Dinner = 0.0;
				double Conference= 0.0;
				double Lodging = 0.0;
				double RoomService = 0.0;
				double Spa = 0.0;
				
	/*
	 * This while statement goes through the document given "hotel.txt line by line seperating each bu the delemiter ;
	 */
		while(Keyboard.hasNextLine())
		{
			String string = Keyboard.nextLine();
			Scanner lineScanner = new Scanner(string);
			lineScanner.useDelimiter(";");
			String name = lineScanner.next();
			String hotelService= lineScanner.next();	
	
		/*Here begins the iteration phase of the program that decides what the service is and totals up the expenses
		 * per the type.
		 */
		if(hotelService.equals("Spa"))
		{
			Spa += Double.parseDouble(lineScanner.next());
				
		}
		else if(hotelService.equals("Room Service"))
		{
			RoomService += Double.parseDouble(lineScanner.next());
		}
		else if(hotelService.equals("Lodging"))
		{
			Lodging += Double.parseDouble(lineScanner.next());
		}
		else if(hotelService.equals("Conference"))
		{
			Conference += Double.parseDouble(lineScanner.next());
			
		}
		else if ( hotelService.equals("Dinner"))
		{
			Dinner += Double.parseDouble(lineScanner.next());
		}
		
		else 
		{
			throw new NoSuchElementException();
		}
		String date = lineScanner.next();
		lineScanner.close();
		}	
		
		Keyboard.close();
		diskWriter.close();
		
	/* Prints the totals of all the expenses listed in the hotel.txt file.
	 * Prints the totals to an output file that is output.txt 
	 */
			
		System.out.printf("Dinner Expenses: %11.2f\n", Dinner);
		System.out.printf("Conference Expenses: %8.2f\n", Conference);
		System.out.printf("Lodging Expenses: %11.2f\n",  Lodging);
		System.out.printf("Room Service Expenses: %.2f\n", RoomService);
		System.out.printf("Spa Expenses: %14.2f\n", Spa);
		diskWriter.print(outputfile);		
	
   /*Catches file not found exception and no such element exception below
	 * 
	 */
    finally
    {
		
			catch (FileNotFoundException e)
			{
				System.out.println("File Not Found: ");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Invalid Format: ");
			
		}
		

		}
}


				
				
			
	
			
			
			
			
			
	
		
		

	
	

	
	
			
			
			
			
		
		
		
			
			
		


