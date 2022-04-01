package com.comcast.fundamental;

public class EncapsDemo {

	public static void main(String[] args) {
		
		Facebook fb = new Facebook();
		fb.setAge(21);
		fb.setContactNumber(9841012345L);
		fb.setMaritalStatus("single");
		
		System.out.println("Age: "+fb.getAge());
		System.out.println("Contact Number: "+fb.getContactNumber());
		System.out.println("Marital Status: "+fb.getMaritalStatus());

	}

}
