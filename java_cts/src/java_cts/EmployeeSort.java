package java_cts;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {

	public static void main(String[] args) {
		ArrayList<Employee> emp= new ArrayList<Employee>();
		emp.add(new Employee("Sana","ADM"));
		emp.add(new Employee("Maddy","CDB"));
		emp.add(new Employee("Susan","ADM"));
		
		Collections.sort(emp);
		for(Employee o: emp) {
			System.out.println(o.name+" "+o.dept);
		}

	}

}
