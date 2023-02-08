package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person createPerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();

		System.out.println("Person Details were saved");
		return person;
	}

	public Person deletePersonById(int id) {
		Person p1 = entityManager.find(Person.class, id);
		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Person Details were deleted");
		return p1;

	}

	public Person updatePersonById(int id, String name, String email) {
		Person p1 = entityManager.find(Person.class, id);
		if (p1 != null) {
			p1.setName(name);
			p1.setEmail(email);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();
			System.out.println("Person Details were updated");
		}
		return p1;
	}

	public Person getPersonById(int id) {
		Person p1 = entityManager.find(Person.class, id);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getEmail());
		return p1;

	}

	@SuppressWarnings("unchecked")
	public List<Person> getAllPersons() {
		String sql = "select s from Person s ";
		Query query = entityManager.createQuery(sql);
		List<Person> persons = query.getResultList();
		return persons;

	}
}
