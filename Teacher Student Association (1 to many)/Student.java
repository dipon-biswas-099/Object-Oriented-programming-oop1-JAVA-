import java.lang.*;

public class Student
{
	private String studentName;
	private long studentId;
	private String department;

	public Student()
	{
		System.out.println("This is empty for Student");
	}

	public Student(String studentName, long studentId, String department)
	{
		this.studentName = studentName;
		this.studentId = studentId;
		this.department = department;
		System.out.println("This is parameterized for Student");
	}

	public void setStudentName(String studentName)
	{ 
		this.studentName = studentName;
	}

	public void setStudentId(long studentId)
	{
		this.studentId = studentId;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public long getStudentId()
	{
		return studentId;
	}

	public String getDepartment()
	{
		return department;
	} 

	public void showDetails()
	{
		System.out.println("The name of the Student is: "+studentName);
		System.out.println("The ID of the Student is: "+studentId);
		System.out.println("The department is: "+department);

	}


}