package com.matheussilvestre.javacourse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheussilvestre.javacourse.domain.Post;
import com.matheussilvestre.javacourse.repository.PostRepository;
import com.matheussilvestre.javacourse.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
		
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
	}
	
	
	public List<Post> findByTitle(String txt){
		return repo.findByTitleContainingIgnoreCase(txt);
	}
	
	
}
