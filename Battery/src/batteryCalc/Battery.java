/*
 * A Program that contains a class battery a constructor and three methods.	
 */
package batteryCalc;
	import java.util.*;
	//define the class battery
	public class Battery
	{
		/*
		 * prints everything
		 */
	public static void main(String[] args)
	 	{
	      System.out.println("1. Project 1");
	      System.out.println("2. Programmer Taylor Wilson ");
	      System.out.printf("3."+ new Date());
	      Battery battery_AA = new Battery(2000, 0); //assume it is 2000 mAh AA battery
	      System.out.printf("\n4. The remaining battery_AA capacity after instantiation is %.2f", battery_AA.getRemainingCapacity());
	      battery_AA.drain(50);
	      System.out.printf("\n5. The remaining battery_AA capacity after draining 50 mAh is %.2f", battery_AA.getRemainingCapacity());
	      battery_AA.charge(batteryCapacity);
	      System.out.printf("\n6. The remaining battery_AA capacity after charging is %.2f", battery_AA.getRemainingCapacity());
		 }
		public static double batteryCharge, batteryCapacity;
		//initiates the battery 
		public Battery()
		{
			batteryCharge = 0;
			batteryCapacity=0;
		}
		//a data c all BatteryCapacity and batteryCharge
		public Battery(double batteryCapacity, double batteryCharge)
		{
			this.batteryCharge = batteryCharge;
			this.batteryCapacity = batteryCapacity;
		}
		//mutator to charge the battery
		public void charge(double pAmount)
		{
			this.batteryCapacity = batteryCharge;	
		}
		//mutator to drain the battery
		public double drain(double pAmount)
		{
			
			this.batteryCapacity -= pAmount;
			
	      if (batteryCapacity < 2000)
			{
				batteryCharge += 2000;
			}
			return pAmount;
		}
		/*an accessor getRemainingCapacity 
		*@ param none
		*@ return the remaining capacity
		*/
		public double getRemainingCapacity()
		{
			return batteryCapacity;    
		}
	}



