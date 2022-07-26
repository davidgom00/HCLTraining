package com.hcl;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
	int id;
	int age;
	int yearOfJoining;
	int salary;
	String name;
	String gender;
	String dept;

}

class CompareSalary implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if(e1.salary> e2.salary) {
			return 1;
		}
		else if (e1.salary <e2.salary) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

class CompareAge implements Comparator{
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if(e1.age> e2.age) {
			return 1;
		}
		else if (e1.age <e2.age) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
public class Assignment5 {

	static int FemaleAge=0;
	static int MaleAge=0;
	static double AvgMaleAge;
	static double AvgFemaleAge;
	static double MaleSalary;
	static double FemaleSalary;
	static double AvgSalaryMale;
	static double AvgSalaryFemale;
	
/*i) How many male and female employees are there in this organization?
ii) Find out Average age of male and female emps?
iii) Find the highest paid employee in this org?
iv) List all te names of employee who has joined after 2015?
v) Find out the senior most employee in this org?
vi)Count the number of emps in each department?
vii)Find male and female employees are in Maintenance department?
viii) Find  the average slary of male and female employees?
ix) Differentiat eht the employees who are younger or equal to 30 yrs from those who older than 25 years
x) List down the names of all employees in each department?*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, Integer> map= new HashMap<>();
		map.put(new Employee(1, 36, 2022, 35000, "Brendan", "male", "Finance"), 1);
		map.put(new Employee(2, 29, 2019, 46000, "Denilson", "male", "Finance"),20);
		map.put(new Employee(3, 42, 2012, 86000, "Jess", "female", "Maintenance"),56);
		map.put(new Employee(4, 31, 2011, 153000, "David", "male", "Maintenance"),100);
		map.put(new Employee(5, 23, 2013, 67000, "Claudia", "female", "IT"),25);
		map.put(new Employee(6, 26, 2012, 56000, "Juan", "male", "Board"),27);
		map.put(new Employee(7, 32, 2015, 54000, "Jules", "female", "HR"),34);
		
		
	//i) How many male and female employees are there in this organization?
		long males = map.keySet().stream().filter(s->s.gender=="male").count();
		long females =map.keySet().stream().filter(s->s.gender=="female").count();
		
		
		System.out.println("Number of males = " + males);
		System.out.println("Number of females = " + females);
		System.out.println();
		
		//ii) Find out Average age of male and female emps?
	
		
		map.forEach((employee, x)->{
			if(employee.gender == "female") {
				FemaleAge += employee.age;
			}
			else {
				MaleAge+=employee.age;
			}
		});
		AvgFemaleAge = FemaleAge/(females);
		AvgMaleAge = MaleAge/(males);
		
		System.out.println("The average age of females are : "+ AvgFemaleAge+ 
				"The average for male employees are: "+ AvgMaleAge);
		
		//iii) Find the highest paid employee in this org?
		//Employee rich = new Employee();
		String rich;
		rich= map.keySet().stream().max((emp1, emp2) -> emp1.salary>emp2.salary ? 1:-1).get().getName();
		System.out.println(rich);
		
		//iv) List all te names of employee who has joined after 2015?
		System.out.println("List of employees who joined after 2015: ");
		map.keySet().stream().filter(employee -> employee.yearOfJoining >2015).
		forEach((employee)->System.out.println(employee.name));
		System.out.println();
		
		//v) Find out the senior most employee in this org?
		String senior;
		senior = map.keySet().stream().min((emp1, emp2) -> emp1.yearOfJoining>emp2.yearOfJoining ? 1:-1).get().getName();
		System.out.println(senior);
		
		//vi) Count the number of emps in each department?
		long mncCount = map.keySet().stream().filter(s->s.dept=="Maintenance").count();
		long FinCount = map.keySet().stream().filter(s->s.dept=="Finance").count();
		long ITCount = map.keySet().stream().filter(s->s.dept=="IT").count();
		long BoardCount = map.keySet().stream().filter(s->s.dept=="Board").count();
		long HRCount = map.keySet().stream().filter(s->s.dept=="HR").count();
		
		System.out.println("Maintenance Dept employee count: " + mncCount);
		System.out.println("Finance Dept employee count: " + FinCount);
		System.out.println("IT Dept employee count: " + ITCount);
		System.out.println("Board Dept employee count: " + BoardCount);
		System.out.println("HR Dept employee count: " + HRCount);
		
		
		//vii) Find male and female employees are in Maintenance department?
		
		long mncMaleCount = map.keySet().stream().filter(s->s.dept=="Maintenance" && s.gender=="male").count();
		long mncFemaleCount = map.keySet().stream().filter(s->s.dept=="Maintenance" && s.gender=="female").count();
		
		System.out.println("Maintenance Dept male employee count: " + mncMaleCount);
		System.out.println("Maintenance Dept male employee count: " + mncFemaleCount);
		
		//viii) Find  the average slary of male and female employees?
		map.forEach((employee, x)->{
			if(employee.gender == "male") {
				MaleSalary += employee.salary;
			}
			else {
				FemaleSalary += employee.salary;
			}
			
		});
		
		AvgSalaryMale = MaleSalary/males;
		AvgSalaryFemale = FemaleSalary/males;
		
		System.out.println("The average salary for females is : " + AvgSalaryFemale + "The average salary for males is: " + AvgSalaryMale);
		
		//ix) Differentiat eht the employees who are younger or equal to
		//	  30 yrs from those who older than 25 years
		System.out.println("Employees younger than 30 and not older than 25");
		
		map.keySet().stream().filter(s->s.age<=30 && s.age <25).forEach((employee)->System.out.println(employee.name));
		
		//x)List down the names of all employees in each department?
		System.out.println();
		System.out.println("Employees in Maintenance Department: ");
		
		map.keySet().stream().filter(employee->employee.dept == "Maintenance").forEach((employee)->System.out.println(employee.name));
		
		System.out.println("Employees in IT Department: ");
		
		map.keySet().stream().filter(employee->employee.dept == "IT").forEach((employee)->System.out.println(employee.name));
		
		System.out.println("Employees in Finance Department: ");
		
		map.keySet().stream().filter(employee->employee.dept == "Finacne").forEach((employee)->System.out.println(employee.name));
		
		System.out.println("Employees in Board Department: ");
		
		map.keySet().stream().filter(employee->employee.dept == "Board").forEach((employee)->System.out.println(employee.name));
		
		System.out.println("Employees in HR Department: ");
		
		map.keySet().stream().filter(employee->employee.dept == "HR").forEach((employee)->System.out.println(employee.name));
		
	}
	

}
