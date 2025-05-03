package com.wtp.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtp.entity.User;
import com.wtp.repository.UserRepository;
import com.wtp.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	 @Autowired
	    private UserRepository repository;

	    @Override
	    public String addUser(User user) {
	        User userDetails = new User();
	        userDetails.setName(user.getName());
	        userDetails.setEmail(user.getEmail());
	        userDetails.setIssue(user.getIssue());
	        repository.save(userDetails);
	        return "user added successfully!!!!";
	    }

	    @Override
	    public String addUsers(List<User> users) {
	        List<User> userList = users.stream().map(user -> {
	            User newUser = new User();
	            newUser.setName(user.getName());
	            newUser.setEmail(user.getEmail());
	            newUser.setIssue(user.getIssue());
	            return newUser;
	        }).collect(Collectors.toList());

	        repository.saveAll(userList);
	        return userList.size() + " users added successfully!!!!";
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return repository.findAll();
	    }

}
