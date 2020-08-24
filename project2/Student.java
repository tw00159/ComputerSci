package project2;
/*This java class Student extends the person object and builds the method getMajor. It also sets perameters for the public student class
 * such as name, Year of birth, and major and then returns these perameters to the caller.
 * 
 */
	public class Student extends Person
	{
		private String major;
		public Student(String name, int YOB, String major)
		{
			super(name,YOB);
			this.major=major;
		}
		public String getmajor() {return major;}
		public String toString() {return "Student[Name = "+getName()+", Year of Birth = "+getYOB()+ ", Major = "+major+"]";
		}
	}

