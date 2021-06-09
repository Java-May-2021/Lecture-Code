package com.matthew.dogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthew.dogs.models.Tag;
import com.matthew.dogs.repositories.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository tRepo;
	
	// Create
	public Tag createTag(Tag newTag) {
		return this.tRepo.save(newTag);
	}
}
