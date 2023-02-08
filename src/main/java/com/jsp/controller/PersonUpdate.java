package com.jsp.controller;

import com.jsp.Service.PersonService;

public class PersonUpdate {
	public static void main(String[] args) {

		PersonService personService = new PersonService();
		personService.updatePersonById(1, "sumit", "sumit@gmail.com");
	}
}
