
//This program computes the caluculations of a circles radus//
//First off I imported a scanner to read keystrokes and declared my main class

import java.util.Scanner;
public class sphereCalculation
{  
 private static Scanner sc;
 public static void main(String[] args)
 {
    sc= new Scanner(System.in);
    System.out.print("Please Enter The Radius Of A Sphere: ");

//Prompting the user to input radius
//Declaring what the equations for radius,area,circumference,volume,and surface area
   
    double radius = sc.nextDouble();
    double area = Math.PI*(radius*radius);
    double circumference = Math.PI*2*radius;
    double volume = (4.0/3.0)*Math.PI*radius*radius*radius;
    double surfaceArea= 4*Math.PI*(radius*radius);

//After all of my variables are defined I prompted the program to begin the-
//output process with the specification that the output should be-
//for two decimal places of precision.
    
   
    System.out.printf("\n The circumference of the circle is: %.2f ", circumference);
    System.out.printf("\n The area of the circe is: %.2f ", area);
    System.out.printf("\n The surface area of a sphere: %.2f ", surfaceArea);
    System.out.printf("\n The volume of a sphere: %.2f ", volume);
      
 }
}
    
    
    
    
    
   
    