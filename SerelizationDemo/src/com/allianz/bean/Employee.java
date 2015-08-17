package com.allianz.bean;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	
	//private static final long serialVersionUID = -200341402493429661L;	
	private  String name="Khushboo";
	private String empId;
	private String depertment;
	private String age;
	
	public Employee(){
		System.out.println(" Inside default constructor of Employee ");
	}
	public Employee(String name, String empId, String depertment) {
		super();
		this.name = name;
		this.empId = empId;
		this.depertment = depertment;
		System.out.println(" Inside  argument constructor of Employee ");
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDepertment() {
		return depertment;
	}
	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException{
		os.defaultWriteObject();
		os.writeObject(name);
		System.out.println("Inside custom writeObject method");
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		in.defaultReadObject();
		name=(String) in.readObject();
		System.out.println("Inside custom readObject method");
	}
	
	
}
