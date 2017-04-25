package surprise;

import java.util.Scanner;

public class University {
	static int count=0;
	private static Professor professor;
	Exam exam;
	static Course course;
	
	public boolean StudentVerificationProcess(Student student)
	{
		System.out.println(student+" Applied for university.");
		return true;
	}
	public void writeExamGetResult(Exam exam)
	{
		
	}
	public void studentAdmission(Student student, Course course)
	{
		System.out.println(student.getName()+"you are registered successfully, welcome to our university");
	}
	public void studentCertificationProcesses(Student student, Course course){
		System.out.println("congratulations your % is 80 above");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		
		System.out.println("enter student name");
		s.setName(sc.next());
		System.out.println("enter student age");
		s.setAge(sc.nextInt());
		System.out.println("enter previous marks");
		s.setPreviousMarks(sc.nextInt());
		
		Course c=new Course();
		System.out.println("enter course name");
		c.setName(sc.next());
		System.out.println("enter course id");
		c.setId(sc.nextInt());
		System.out.println("enter course duration");
		c.setDuration(sc.nextInt());
		
		
		Professor p=new Professor();
		System.out.println("enter professor name");
		p.setName(sc.next());
		
		Exam e=new Exam();
		System.out.println("enter exam marks");
		e.setMarks(sc.nextInt());
		
		University u=new University();
		u.StudentVerificationProcess(s);
		
		Registrar r=new Registrar();
		r.registerStudent(s);
		
		Validator v=new Validator();
		v.ValidateStudent(s);
		
		u.studentAdmission(s, c);
		count++;
		System.out.println("your student id = "+count);
		System.out.println(p.getName()+" is teaching "+c.getName()+" to "+s.getName());
		System.out.println(p.getName()+" is conducting "+c.getName()+" to "+s.getName());
		System.out.println(p.getName()+" is evaluating "+s.getName()+c.getName()+" Exam paper");
		System.out.println("Marks----->"+e.getMarks());
		
		if (e.getMarks()>80)
		{
			u.studentCertificationProcesses(s, c);
			System.out.println(s.getName()+" you are "+c.getName()+" professional certified");
		}
		else
			System.out.println("sorry u failed in the exam");
		
	}
}
