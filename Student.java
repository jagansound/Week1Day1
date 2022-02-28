package week1.day1.assignments;

public class Student {
	int rollNumber = 10001; 
	String name = "Anthony";	
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.college();
		System.out.println("This is Public Roll Number");
		System.out.println(stud.rollNumber);
		System.out.println("This is Public name");
		System.out.println(stud.name);
		}
	
	public void college() {
		System.out.println("This is Private name");
		String name1= "kumar";
		System.out.println(name1); 
	}
		}

	
	
	
	
	


