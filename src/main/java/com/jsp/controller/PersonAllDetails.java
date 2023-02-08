package com.jsp.controller;

import com.jsp.Service.PersonService;
import com.jsp.dto.Person;

public class PersonAllDetails {
	public static void main(String[] args) {

		PersonService personService = new PersonService();

		for (Person p : personService.getAllPersons()) {
			System.out.println("------------");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getEmail());
		}
	}
}
