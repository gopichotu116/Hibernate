package com.gopi.HibernateProject1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.gopi.HibernateProject1.entity.BankAccount;
import com.gopi.HibernateProject1.entity.Customer;
import com.gopi.HibernateProject1.entity.OrderData;
import com.gopi.HibernateProject1.entity.Person;
import com.gopi.HibernateProject1.repository.CustomerRepository;
import com.gopi.HibernateProject1.repository.PersonRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 /**    Person person = new Person("Gopi", "Male", 20, "8032574638");
    	OrderData orderData = new OrderData("Bun",5,"eatable");
    	PersonRepository repository = new PersonRepository();
//    	orderData.setId(4);
    	person.setOrderData(orderData);
    	System.out.println(orderData);
    	orderData.setPerson(person);
    	System.out.println(repository.savePerson(person));
//    	System.out.println(repository.getAllData());
//    	System.out.println(repository.getPhoneNumByName("Gopi"));
//    	System.out.println(repository.personDataByPersonNameAndAge("Gopi",20));
    	
*/
    	
/**    	
        BankAccount account1 = new BankAccount("Andhra", "200283739473");
    	BankAccount account2 = new BankAccount("SBI", "100283734473");
    	BankAccount account3 = new BankAccount("BOB", "5300283739473");
    	BankAccount account4 = new BankAccount("AXIS", "54000283739473");
    	BankAccount account5 = new BankAccount("Union", "45000283739473");
    	List<BankAccount> list=new ArrayList<>();
    	list.add(account1);
    	list.add(account2);
    	list.add(account3);
    	list.add(account4);
    	
    	Customer customer2 = new Customer("Thimma Reddy", "Ananthapur",list);
    	CustomerRepository repository = new CustomerRepository();
    	repository.saveCustormer(customer2);
    	
//    	Customer customer = repository.getCustomerById(1);
//    	List<BankAccount> accounts = customer.getAccounts();
    	
//    	accounts.forEach(System.out::println);
  
 */   		
    	
    	
    	
    	
    	
    	
    	
    	
/**    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
    			addAnnotatedClass(Person.class).buildSessionFactory();
    	Session session=factory.getCurrentSession();
    	
    	try {
    		// creating new Person
    		System.out.println("Creating new person object");
    		Person person = new Person(2,"Bhaskar", "Male", 21, "984084743");
    		
    		// start transaction
    		session.beginTransaction();
    		
    		// save student
    		session.save(person);
    		
    		// commit transaction
    		session.getTransaction().commit();
    		
    		System.out.println("done");
			
		} finally {
			factory.close();
		}
*/
    }
}
