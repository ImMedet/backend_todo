package kz.medet.backend.controller;

import kz.medet.backend.model.User;
import kz.medet.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    //REST API - Create User - Post
    //Read User - Get
    //Delete User - Delete
    //Update User - Put

    //Create User
    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        return user1;
    }

    //Read Users
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //Update Users by ID
    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") long id ){
        return userService.updateUser(user, id);
    }


    //Delete Users by ID
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return "User deleted successfully...";
    }

    //Get User by ID

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }

}
