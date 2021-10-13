package com.markjeffrey.controllerview.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.controllerview.models.User;
import com.markjeffrey.controllerview.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public List<User> getAllUsers(){
		return this.uRepo.findAll();
	}
	
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	

	
	public User createUser(User user) {
		return this.uRepo.save(user);
	}
	
	public User editUser(User user) {
		return this.uRepo.save(user);
	}
	
	public void deleteUser(Long id) {
		this.uRepo.deleteById(id);
	}
	
	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.uRepo.save(user);
	}
	
	public boolean authenticateUser(String email, String password) {
		User user = this.uRepo.findByEmail(email);
		
		if(user == null) {
			return false;
		}
		
		return BCrypt.checkpw(password, user.getPassword());
	}
		
	public User getUserByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}

}
