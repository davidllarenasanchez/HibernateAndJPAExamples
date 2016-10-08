package com.hibernate.example.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.example.Contacts;
import com.hibernate.example.util.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args) {
		Contacts contact = new Contacts();
		contact.setFirstname("NameFromHibernateEx");
		contact.setEmail("email@email.com");
		
		//Get Session
		SessionFactory sessionFactory = HibernateUtil.getSessionJavaConfigFactory();
		Session session = sessionFactory.getCurrentSession();
		//start transaction
		session.beginTransaction();
		//Save the Model object
		session.save(contact);
		//Commit transaction
		session.getTransaction().commit();
		System.out.println("contact ID="+contact.getId());
		
		//terminate session factory, otherwise program won't end
		sessionFactory.close();
	}
}
