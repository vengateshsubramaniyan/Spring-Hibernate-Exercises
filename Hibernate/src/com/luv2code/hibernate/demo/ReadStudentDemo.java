package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			Student readStudent = session.get(Student.class,1);
			System.out.println(readStudent);
			readStudent.setEmail("vengatesh");
			session.save(readStudent);
			System.out.println(readStudent);
			System.out.println("Done");
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
