package com.crs;

//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.crs.entities.Role;
//import com.crs.entities.User;
//import com.crs.entities.UserRole;
//import com.crs.service.UserService;


@SpringBootApplication
public class Phase5ComplaintRedressalSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Phase5ComplaintRedressalSystemApplication.class, args);
	}
	
	/* To create an administrator: uncomment all the comments.  */
	
//	@Autowired
//	private UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		User admin = new User();
		admin.setUsername("crs-admin@abc.com");
		admin.setPassword("admin123");
		admin.setFirstName("Twarit");
		admin.setLastName("Soni");
		admin.setEmail("twarit.soni@gmail.com");
		admin.setPinCode(110001);
		admin.setPhone("+916265458854");
		admin.setRoleName("ADMIN");
		Role role = new Role();
		role.setRoleId(101);
		role.setRoleName(admin.getRoleName());
		Set<UserRole> userRole = new HashSet<>();
		UserRole uR = new UserRole();
		uR.setUser(admin);
		uR.setRole(role);
		userRole.add(uR);
		User userAdmin = this.userService.createUser(admin, userRole);
		System.out.println("Admin Username: "+userAdmin.getUsername()); 
		*/
		
	}

}
