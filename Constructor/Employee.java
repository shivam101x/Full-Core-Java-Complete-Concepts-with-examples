package Constructor;

public class Employee {
	
	int id;
	String name;
	int sal;
	
	

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public Employee(Employee emp) { //Copy Constructor
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.sal);
	}
	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Abc",60000);
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.sal);

		Employee ob=new Employee(emp1);

	}

}
