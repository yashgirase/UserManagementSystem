package com.example.UserManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor   // It is creating parameterized constructor automatically
@NoArgsConstructor
@Data   // used to create getters and setters for each property
public class User {

    Integer userId;
    String name;
    String userName;
    String address;
    String phoneNo;


}