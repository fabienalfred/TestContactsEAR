package test.dao;

import java.util.List;

import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import test.entities.Contact;

@Stateless
public class ContactDAO {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Contact> getAll() {
		return em.createNamedQuery("Contact.getAll").getResultList();
	}
	
}
