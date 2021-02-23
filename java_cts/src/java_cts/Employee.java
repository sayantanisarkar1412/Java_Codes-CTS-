package java_cts;
import java.lang.String;
public class Employee implements Comparable<Employee>{
	String name;
	String dept;
	public Employee(String name,String dept) {
		this.name=name;
		this.dept= dept;
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.name);
	}
	
}
