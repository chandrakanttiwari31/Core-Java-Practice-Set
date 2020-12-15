package objectSerialization;

import java.io.Serializable;

public class Employee  implements Serializable{

	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
