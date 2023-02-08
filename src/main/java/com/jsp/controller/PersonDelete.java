package com.jsp.controller;

import com.jsp.Service.PersonService;

public class PersonDelete {
	public static void main(String[] args) {

		PersonService personService = new PersonService();

		personService.deletePersonById(2);
	}
}
