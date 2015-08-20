package com.allianz.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.allianz.bean.Employee;
import com.allianz.bean.ITEmployee;


public class MainExecution {

	public static void main(String[] args) throws IOException, ClassNotFoundException {		
		
		ITEmployee itEmployee =new ITEmployee("AGCS", "Kunal Sehgal");
		//Employee emp = new Employee("shailesh", "All205", "AD&M");
		//itEmployee.setName("Shaileh");
		System.out.println( "****************"+ itEmployee.getName() +"****************" );
		
		
		List<Object> list=new ArrayList<Object>();
		MainExecution main=new  MainExecution();
		System.out.println("############## Serelization Starts ######################");
		//list.add(emp);
		list.add(itEmployee); 
		main.serelizationMethod(list);
		System.out.println("############### DeSerelization Starts ######################");
		    List deserelizedList =(ArrayList<Object>)main.deserelizationMethod("file.ser");
		    for(Object obj : deserelizedList){
		    	if(obj instanceof ITEmployee){
		    		System.out.println("ITEmpolyee project " + ((ITEmployee)obj).getProject());
		    	    System.out.println("ITEmpolyee Name " + ((ITEmployee)obj).getName());
		    	}
		    	else
		    		System.out.println("Empolyee name " + ((Employee)obj).getName());
		    	
		    }
		    
		//ITEmployee deserelizedITEmployee=(ITEmployee)main.deserelizationMethod("ITemp.ser");
		//System.out.println("Empolyee name " + deserelizedEmployee.getName());
		//System.out.println("ITEmpolyee project " + deserelizedITEmployee.getProject());
		
	}
	
	public void serelizationMethod(Object obj) throws IOException{
		FileOutputStream fio= new FileOutputStream("file.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fio);
		oos.writeObject(obj);
	}
	
	public Object deserelizationMethod(String fileName) throws IOException, ClassNotFoundException{
		FileInputStream fio= new FileInputStream("file.ser");
		ObjectInputStream ois= new ObjectInputStream(fio);
		 return ois.readObject();
	}
	

}
