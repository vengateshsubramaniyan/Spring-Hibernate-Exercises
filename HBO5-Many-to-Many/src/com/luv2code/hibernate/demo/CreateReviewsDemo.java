package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class CreateReviewsDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure()
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Review.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Course course = new Course("Testing reviews");
			Review review1 = new Review("object 1");
			Review review = new Review("object 2");
			course.addReview(review);
			course.addReview(review1);
			session.save(course);
			System.out.println("---------------------------");
			System.out.println(course.getReviews());
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
		
	}

}
