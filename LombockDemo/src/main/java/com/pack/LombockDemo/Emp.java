package com.pack.LombockDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;


/*@Getter
@Setter
@ToString
*/
//@RequiredArgsConstructor
//@EqualsAndHashCode
//@NoArgsConstructor
@AllArgsConstructor
@Data
@Value
public class Emp {

//	@Getter
//	@Setter
	final private String name;
	private int age;
	private int salary;
	private int designation;
	public static void display(@NonNull Emp e) {
    	System.out.println("=====print=====");
    	
    }
    
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDesignation() {
		return designation;
	}
	public void setDesignation(int designation) {
		this.designation = designation;
	}*/
	
	
	
}
