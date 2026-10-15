package com.inheritance;

public class Employee {
	String name = "Jatin";
	String address = "blr";

	public void markIn(String empId) {
		System.out.println("Marking In: " + empId);
	}

	public static void main(String[] args) {

		Manager m1 = new Manager();

		m1.doSomething();

	}

}

class Manager extends Employee {
	public void doSomething() {
		System.out.println(name);
		System.out.println(address);
		markIn(address);

	}
}
