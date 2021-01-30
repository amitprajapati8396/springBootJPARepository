package com.app.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.app.jpa.dao.UserRepository;
import com.app.jpa.entities.UserData;



@SpringBootApplication
public class JpaRepoProjectApplication {

	

	public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(JpaRepoProjectApplication.class, args);
	 UserRepository userRepo =context.getBean(UserRepository.class);
		
	   /*//creating a new user and save into DB
		 * UserData user=new UserData(); user.setName("vijay");
		 * user.setCity("Bangalore"); user.setStatus("looking for new job");
		 * 
		 * UserData user1= userDAO.save(user); System.out.println(user1);
		 */
	
		
		 //create multiple user and save them. 
//	       UserData user1=new UserData();
//		  user1.setName("Amit");
//		  user1.setCity("Bangalore"); 
//		  user1.setStatus("java developer");
//	 
//		   UserData user2=new UserData();
//		   user2.setName("chandu");
//		   user2.setCity("USA");
//		   user2.setStatus("java ");
//		  
//		  UserData user3=new UserData(); 
//		  user3.setName("root"); 
//		  user3.setCity("Bankock");
//		  user3.setStatus("project manager");
//		  
//		  List<UserData> userlist=new ArrayList<UserData>(); 
//		  userlist.add(user1);
//		  userlist.add(user2); 
//		  userlist.add(user3);
//		  
//		  Iterable<UserData> saveAll = userRepo.saveAll(userlist);
//		  System.out.println(saveAll);
		 
	// retrive user based on their id and update data.
		/*
		 * Optional optional = userRepo.findById(2); UserData users = (UserData)
		 * optional.get(); users.setName("Chandu"); userRepo.save(users);
		 * System.out.println(users);
		 */  
	 //find all the data from DB.
		/*
		 * Iterable<UserData> findAll = userDAO.findAll();
		 * findAll.forEach(System.out::println);
		 */
	 //delete operation
	   //userRepo.deleteById(2);
	 //delete All data from DB
		/*
		 * Iterable<UserData> findAll = userRepo.findAll();
		 * findAll.forEach(System.out::println); userRepo.deleteAll(findAll);
		 */
//Get User by using  user define method 
//	  List<UserData> names = userRepo.findUserByName("Amit");
//	   names.forEach(System.out::println);
//	 List<UserData> users = userRepo.nameStartingWith("A");
//	 users.forEach(System.out::println);
	 List<UserData> id = userRepo.idGreaterThan(24);
	 id.forEach(System.out::println);
	}

}
