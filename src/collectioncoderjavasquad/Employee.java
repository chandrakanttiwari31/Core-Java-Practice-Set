package collectioncoderjavasquad;

import java.util.Comparator;

//Compparator is interface used to sort userdefined class
// it is use  for multiple sorting
//
public class Employee  implements Comparator<Employee>{
	
	private  int id;
	private String name;
	 private int sal;
	 private int phnno;
	 
	 
	 
	 
	public Employee(int id, String name, int sal, int phnno) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.phnno = phnno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getPhnno() {
		return phnno;
	}
	public void setPhnno(int phnno) {
		this.phnno = phnno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", phnno=" + phnno + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class idCompare implements Comparator<Employee>

{	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
}

class nameCompare implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}}