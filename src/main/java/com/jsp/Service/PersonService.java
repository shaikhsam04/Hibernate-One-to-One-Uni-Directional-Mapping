package com.jsp.Service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {
	PersonDao personDao = new PersonDao();

	public Person createPerson(Person person) {
		return personDao.createPerson(person);
	}

	public Person deletePersonById(int id) {
		return personDao.deletePersonById(id);
	}

	public Person updatePersonById(int id, String name, String gmail) {

		return personDao.updatePersonById(id, name, gmail);
	}

	public Person getPersonById(int id) {

		return personDao.getPersonById(id);
	}

	public List<Person> getAllPersons() {

		return personDao.getAllPersons();
	}
}
