package com.werum.hibtst;

import java.util.List;

import org.hibernate.*;

public class HibernateTest {
	public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        session.beginTransaction();
        for (int i = 1000; i < 5_000; i++) {
        	Employee emp = new Employee(i, "FirstName" + i, "LastName" + i);
        	session.save(emp);
        }
      
        session.getTransaction().commit();
 
//        Query q = session.createQuery("From Employee ");
//                 
//        List<Employee> resultList = q.list();
//        System.out.println("num of employess:" + resultList.size());
//        for (Employee next : resultList) {
//            System.out.println("next employee: " + next);
//        }
 
    }
}
