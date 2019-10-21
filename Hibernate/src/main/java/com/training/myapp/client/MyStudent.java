package com.training.myapp.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.myapp.model.Student;
import com.training.myapp.util.HibernateUtil;

public class MyStudent {
public static void main(String[] args) {
//	Session session=HibernateUtil.getSession();
//	Transaction transaction=session.beginTransaction();
//	Student student=new Student("ram",20,"Full Stack");
//	
//	session.persist(student);
//	transaction.commit();
//	session.close();
//	HibernateUtil.closeSessionFactory();
//	Session session=HibernateUtil.getSession();

//	Student student=(Student) session.get(Student.class, 2);
//	System.out.println(student);

//	session.close();
//	Session session=HibernateUtil.getSession();
//	Transaction transaction=session.beginTransaction();
//	Student student=(Student) session.get(Student.class, 2);
//	if(student!=null)
//		student.setStudentCourse("AWS");
//	System.out.println(student);
//	transaction.commit();
//	session.close();
	Session session=HibernateUtil.getSession();
	Transaction transaction=session.beginTransaction();
	Student student=(Student) session.get(Student.class, 4);
	if(student!=null)
	session.delete(student);
	System.out.println(student);
	transaction.commit();
	session.close();
	
	
	
	
}
}
