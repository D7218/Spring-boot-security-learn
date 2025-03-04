package com.learn.controller;

import com.learn.models.User;
import com.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	
    @Autowired
    private UserService userService;

    // all users
    @GetMapping("/")
    public List<User> getAllUsers(){
    	System.out.println("hello sequrity");
        return this.userService.getAllUsers();
    }
    
  
    //return single user
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username){
        
        return this.userService.getUser(username);
    }
    @PostMapping("/")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
