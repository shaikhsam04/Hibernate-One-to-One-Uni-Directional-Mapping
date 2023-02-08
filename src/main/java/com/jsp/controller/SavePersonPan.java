package com.jsp.controller;

import com.jsp.Service.PanService;
import com.jsp.Service.PersonService;
import com.jsp.dto.Pan;
import com.jsp.dto.Person;

public class SavePersonPan {
	public static void main(String[] args) {

		PanService panService = new PanService();
		PersonService personService = new PersonService();
		Pan pan1 = new Pan();
		pan1.setName("viakash");
		panService.createPan(pan1);

		Person p1 = new Person();
		p1.setName("viakash");
		p1.setEmail("viakash@gmail.com");
		p1.setPan(pan1);
		personService.createPerson(p1);

	}
}
