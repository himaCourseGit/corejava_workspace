package collectionInterface;

import java.util.ArrayList;

public class EmployeeStudentFacultyArrayList {
public static void main(String[] args) {
	Employee employeeObject=new Employee(101,"hyderabad",45000);
	Student studentObject=new Student(100,"sai","Mechanical");
	Faculty facultyObject=new Faculty(56000.50,"corejava");
	
			
	ArrayList alObject=new ArrayList();
	alObject.add(employeeObject);
	alObject.add(studentObject);
	alObject.add(facultyObject);
	
	Employee downCastedEmployee=(Employee) alObject.get(0);
	System.out.println(downCastedEmployee.employeeSalary);
	
	Student downCastedStudent=(Student) alObject.get(1);
	System.out.println(downCastedStudent.studentRollNo);
	
	Faculty downCastedFaculty=(Faculty) alObject.get(2);
	System.out.println(downCastedFaculty.facultySubjectName);
	
}
}
class Employee{
	public int employeeId;
	public String employeeJobLocation;
	public double employeeSalary;
	public Employee(int employeeId, String employeeJobLocation, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeJobLocation = employeeJobLocation;
		this.employeeSalary = employeeSalary;
	}
	
}

class Student{
	public int studentRollNo;
	public String studentName;
	public String studentBranch;
	public Student(int studentRollNo, String studentName, String studentBranch) {
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
	}
}
class Faculty{
	public double facultySalary;
	public String facultySubjectName;	
	public Faculty(double facultySalary, String facultySubjectName) {
		this.facultySalary = facultySalary;
		this.facultySubjectName = facultySubjectName;
	}
}
