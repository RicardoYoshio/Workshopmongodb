package com.ryoshio.wsmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryoshio.wsmongodb.domain.User;
import com.ryoshio.wsmongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	

	public List<User> findAll() {
		return repo.findAll();
		
	}
}
