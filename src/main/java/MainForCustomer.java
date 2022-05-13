import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainForCustomer {

	public static void main(String[] args) {

		
		//EntityManagerFactory is an interface which proived the method to create entityManager object
		//EntityManagerFactory object can be instantiated by invoking createEntityManagerFactory(String ars) of Persistence
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
		//I want to start transaction with database
		//saving
		//fetching
		//I need the object EntityManager ...just connetion
		EntityManager em=factory.createEntityManager();
		Customer customer=new Customer();
		customer.setCustId(11);
         customer.setCustomerName("ABC");
         customer.setCustomerPhone(86635533);
         customer.setCustomerEmail("dsfe@gmail.com");
         //EntityManager object provides method called getTransaction()
         //to start transaction we begin()
		em.getTransaction().begin();
		//I have to save customer object into DB
		//persist(Object entity)-
		//Persistence
		//save the entity into database
		em.persist(customer);
		em.getTransaction().commit();
		 Scanner scanner =new Scanner(System.in);
		 System.out.println("Enter the id of customer");
		 int id=Integer.parseInt(scanner.nextLine());
		 //Entity find(Entity name, primary key)
	Customer cust=	 em.find(Customer.class, id);
	System.out.println(cust.getCustId() + ""+cust.getCustomerName()+ " "+cust.getCustomerPhone());	
		
		//em.remove(Object enity);
		//em.persist(Object ) for update
		
     
		System.out.println("inserted");
		
		
		

	}

}
