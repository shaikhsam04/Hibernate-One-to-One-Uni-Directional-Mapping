package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Pan;

public class PanDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Pan createPan(Pan pan1) {
        
		entityTransaction.begin();
		entityManager.persist(pan1);
		entityTransaction.commit();

		System.out.println("Pan details were saved");
		return pan1;
	}

	public Pan deletePanById(int id) {

		Pan p1 = entityManager.find(Pan.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Data got deleted");
		return p1;
	}

	public Pan updatePanById(int id, String name, int pan_no) {

		Pan p1 = entityManager.find(Pan.class, id);

		if (p1 != null) {
			p1.setName(name);
			p1.setId(id);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();
		} else {
			System.out.println("Pan Details not found");
		}
		return p1;
	}

	public Pan getPanById(int id) {

		Pan p1 = entityManager.find(Pan.class, id);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		return p1;

	}

	public List<Pan> getAllPans() {

		String sql = "select s from Pan s";
		Query query = entityManager.createQuery(sql);

		@SuppressWarnings("unchecked")
		List<Pan> pans = query.getResultList();

		return pans;
	}
}
