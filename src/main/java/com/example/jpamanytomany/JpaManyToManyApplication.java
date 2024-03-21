package com.example.jpamanytomany;

import com.example.jpamanytomany.entities.Role;
import com.example.jpamanytomany.entities.User;
import com.example.jpamanytomany.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JpaManyToManyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaManyToManyApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserService userService){
         return args -> {
             User u = new User();
             u.setUsername("user1");
             u.setPassword("12345678");
            userService.addNewUser(u);

             User u2 = new User();
             u2.setUsername("admin");
             u2.setPassword("12345678");
             userService.addNewUser(u2);

             Stream.of("student","user","admin").forEach(r->{
                 Role role = new Role();
                 role.setRoleName(r);
                 userService.addNewRole(role);
             });

             userService.addRoleToUser("user1","student");
             userService.addRoleToUser("user1","user");
             userService.addRoleToUser("admin","admin");
             userService.addRoleToUser("admin","user");


             try{
                 User user = userService.authenticate("user1","12345678");
                 System.out.println("user authentifié");
                 System.out.println(user.getUserId());
                 System.out.println(user.getUsername());
                 System.out.println("roles =>");
                 user.getRoles().forEach(r->{
                     System.out.println("role=>"+r.toString());
                 });
             }
             catch (Exception exception){
                 exception.printStackTrace();
             }

         };
    }
}
