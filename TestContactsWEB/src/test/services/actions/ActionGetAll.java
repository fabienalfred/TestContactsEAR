package test.services.actions;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.ContactDAO;
import test.entities.Contact;

public class ActionGetAll implements Action {

	@EJB
	private ContactDAO dao;
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Contact> contacts = dao.getAll();
		request.setAttribute("contacts", contacts);
		return "/contacts.jsp";
	}

}
