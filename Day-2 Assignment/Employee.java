public class Employee {
	String name="Saurabh";
	String city="Chennai";
	int age=23;
  
	public void displayemp()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.displayemp();

	}

}
