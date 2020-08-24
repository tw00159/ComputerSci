package project2;
/*
 * The instructor class extends the person object and passes through the perameters name, YOB, and salary through the instructor class
 * it also builds the method getSalary() and then concatenates the results of the getters getName, getSalary()
 * with the string toString()
 */
public class Instructor extends Person
{

	private String salary;//Private Data Type
	public Instructor(String name, int YOB, String salary)
	{
		super(name,YOB);
		this.salary=salary;
	}
	public String getSalary() {return salary;}//Getter
	public void setSalary(String salary) {//Setter
		this.salary = salary;
	}
	public String toString()
	{
		return "Instructor[Name = "+getName()+", Year of Birth = "+getYOB()+", Salary = "+getSalary();
	}
	

	}
