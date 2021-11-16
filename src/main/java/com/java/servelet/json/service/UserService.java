package com.java.servelet.json.service;

import java.util.List;
import java.util.Arrays;

import com.java.servelet.json.model.User;

public class UserService {
public List<User> getUsers(){
	return Arrays.asList(new User(1001L, "Nahom", "Abebe", "nahom@gmail.com"),
			new User(10001L, "Michael", "Abebe", "michael@gmail.com"),
			new User(101L, "Elisa", "Chekole", "elsa@gmail.com")
			
			
			);
}
}
