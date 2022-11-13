/*import java.lang.*;

public class Teacher
{
	private String course;  // variable declared
	Student students[]; //object defined like variable array

	public Teacher()
	{
		System.out.println("This is empty for Teacher");
	}

	public Teacher(String course, int sizeOfArray)
	{
		this.course = course;
		students = new Student[sizeOfArray];  // set the size of the Array
		System.out.println("This is parameterized for Teacher");
	}

	public void setCourse(String course)
    {
    	this.course = course;
    }

    public String getCourse()
    {
    	return course;
    }

    public void showAllDetails()
    {
    	for(int i=0; i<students.length; i++)
    	{
    		if(students[i] != null)
    		{
    			System.out.println("***********************");
    			System.out.println("The Student Name: ["+i+"]: "+students[i].getStudentName());
    			System.out.println("The Student ID: ["+i+"]: "+students[i].getStudentId());
    			System.out.println("The Student Department: ["+i+"]: "+students[i].getDepartment());
    			System.out.println("***********************");
    		}
    	}
    }

    public void insertStudent(Student s)
	{
		int flag = 0;      //flag initiate
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == null)    //check if null or empty
			{
				students[i] = s;     //assigned and inserted 
				flag = 1;    //flag change
				break;
			}
		}
		if(flag == 1){System.out.println("----Inserted----");}     //flag check
		else {System.out.println("----CanNot Insert----");}
	}

	 public void removeStudent(Student s)
	{
		int flag = 0;      //flag initiate
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == s)    //check if object is there
			{
				students[i] = null;     //deleted or removed  
				flag = 1;    //flag change
				break;
			}
		}
		if(flag == 1){System.out.println("----removed----");}     //flag check
		else {System.out.println("----cant remove----");}
	}
	
    
    public Student getStudent(long studentId)
    {
    	Student s = null;    // emptying the object to null
    	for(int i=0; i<students.length; i++)
    	{
    		if(students[i] != null) //if not null (if there is someone)
    		{
    			if(students[i].getStudentId() == studentId)   //check the availability of ID
    			{
    				s = students[i];
    				break;
    			}
    		}
    	}

    	return s;
    } 

	 
}