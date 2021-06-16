package com.matthew.dogs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthew.dogs.models.Dog;
import com.matthew.dogs.models.User;
import com.matthew.dogs.repositories.DogRepository;
import com.matthew.dogs.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	@Autowired
	private DogRepository dRepo;
	
	// Get All Users
	public List<User> getAllUsers(){
		return this.uRepo.findAll();
	}
	
	public User getSingleUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	// Like
	public void likeDog(User user, Dog dog) {
		List<User> usersWhoHaveLiked = dog.getLikers();
		usersWhoHaveLiked.add(user);
		this.dRepo.save(dog);
	}
	
	// UnLike
	public void unlikeDog(User user, Dog dog) {
		List<User> usersWhoHaveLiked = dog.getLikers();
		usersWhoHaveLiked.remove(user);
		this.dRepo.save(dog);
	}
}
