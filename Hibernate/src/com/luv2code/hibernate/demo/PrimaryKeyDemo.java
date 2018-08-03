package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Student student1 = new Student("kiruth1ika", "madheshwarna", "kiruthikamadhu@gmail.com");
			session.beginTransaction();
			Student student2 = new Student("vijay1", "pakrisamy", "vijay@gmail.com");
			session.save(student1);
			session.save(student2);
			session.getTransaction().commit();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
