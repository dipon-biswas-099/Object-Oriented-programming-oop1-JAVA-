import java.lang.*;

public class Start
{
	public static void main(String []args)
	{
		//Teacher tc1 = new Teacher("Electrical Circuit", 3);


		Student st = new Student();   //object definiition 
		st.setStudentName("Zahid Al Kabir");
		st.setStudentId(1738471);
		st.setDepartment("CSE");
		st.showDetails();

		Student st2 = new Student();
		st2.setStudentName("Farid Al Kabir");
		st2.setStudentId(1738470);
		st2.setDepartment("SE");

		Student st3 = new Student();
		st3.setStudentName("Asif Al Kabir");
		st3.setStudentId(1738890);
		st3.setDepartment("EEE");

		Student st4 = new Student();
		st4.setStudentName("Masif Al Kabir");
		st4.setStudentId(1756890);
		st4.setDepartment("ETE");
		st4.showDetails();

		System.out.println("----------------------------------");

	    //association
       /*tc1.insertStudent(st);
       tc1.insertStudent(st2);
       tc1.insertStudent(st3);

       tc1.showAllDetails();

       tc1.removeStudent(st);
       tc1.showAllDetails();

       if(tc1.getStudent(1738449) != null)
       {
       		System.out.println("Found/ exists");
       }

       else
       {
       		System.out.println("Does not exist / not found");
       }*/



	}
}