package com.example.UserManagementSystem.Service;

import com.example.UserManagementSystem.Entity.User;
import com.example.UserManagementSystem.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;


    public String addUser(User user) {
        List <User> users = repository.getListOfUsers();

        users.add(user);
        return "User is successfully added..";
    }

    public User getUserById(Integer id) {
        List <User> users = repository.getListOfUsers();
        for(User user : users){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        List<User> users = repository.getListOfUsers();
        return users;
    }

    public String updateUserInfo(User user) {
        List<User> users = repository.getListOfUsers();

        for(User presentUser : users){
            if(presentUser.getUserId().equals(user.getUserId())){
                users.remove(presentUser);
                users.add(user);
                break;
            }
        }
        return "User Updated Successfully..";
    }

    public String deleteUser(Integer userId) {

        for(User user : repository.getListOfUsers()){

            if(user.getUserId().equals(userId)){
                repository.delete(user);
                break;
            }

        }
        return "User removed successfully..";
    }
}
