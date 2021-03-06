package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class getInstructorDetailDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 2);
			System.out.println(instructorDetail);
			System.out.println(instructorDetail.getInstructor());
			session.getTransaction().commit();
			
			
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
		
	}

}
