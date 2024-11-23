package com.javaconcepts;

public class DataTypes {
	
	public void verifyPrimitiveTypes() {
		
		byte s_no = 29;
		System.out.println("The S.No is : "  + s_no);
		
		short age = 30;
		System.out.print("The S.No is :" + s_no + "  The Age is : "+age);// "The data are :"+29 => "The data are :29"
	
		int salary = 25000;
		System.out.println("The Salary is : "+salary);
		
		long contact = 9876543210L;
		System.out.println("Contact is :"+contact);
		
		float percentage = 23345.5667F;
		System.out.println("Percentage is :"+percentage);
		
		double interest = 53265456.25445;
		System.out.println("Interest is : "+interest);
		
		char c = 'v';
		System.out.println(c+" "+age);
		
		String name = "Navin";
		System.out.println(name+age);
	
	}
	
	public static void main(String[] args) {
		DataTypes data_types = new DataTypes();
		data_types.verifyPrimitiveTypes();
	}

}
