package project2;
/*
 * This java class titled Person extends the object Person and sets perameters on name and Year of Birth and then returns
 * those two perameters to the caller.
 */
	public class Person
	{
		private String name;
		private int YOB;
		public Person(String name, int YOB)//Parameterized Constructor
		{
			this.name=name;
			this.YOB=YOB;
		}
	
	public String getName() {//Getter
			return name;
		}

		public void setName(String name) {//Setter
			this.name = name;
		}

		public int getYOB() {//Getter
			return YOB;
		}

		public void setYOB(int yOB) {//Setter
			YOB = yOB;
		}

	public String toString()// To string Statement
	{
		return "Person[Name = "+name+", Year of Birth = "+YOB+"]";}
	}

