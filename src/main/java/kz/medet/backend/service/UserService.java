package kz.medet.backend.service;

import kz.medet.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //create, read and delete users------


    //create
    public User createUser(User user);

    //read users
    public List<User> getUsers();


    //read users by ID;
    public User getUserById(long id);

    //delete user by id
    public void deleteUser(long id);

    //update user by id
    public User updateUser(User user, long id);

    String getText(String text);

}
