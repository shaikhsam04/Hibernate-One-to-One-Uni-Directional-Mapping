package com.jsp.controller;

import com.jsp.Service.PersonService;

public class PersonRead {
public static void main(String[] args) {
		
		PersonService personService = new PersonService();
		personService.getPersonById(1);
		
	}
}
