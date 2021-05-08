package com.tech.javabasics.step10referencetypes;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder message = new StringBuilder("I love to write programs");

		System.out.println("\nmessage : " + System.identityHashCode(message));

		message.append(" in Java");

		System.out.println(message);
		System.out.println(System.identityHashCode(message));

		StringBuilder query = new StringBuilder("");
		String namePredicate = "A%";
		String datePredicate = "01-Jan-2021";
		query.append("select * from employees where emoloyee_name like");
		query.append(" '" + namePredicate + "'");
		query.append(" and hire_dt < '" + datePredicate + "'");
		System.out.println(query);

	}
}
// select * from employees where emoloyee_name like 'A%' and hire_dt < '01-Jan-2021';
