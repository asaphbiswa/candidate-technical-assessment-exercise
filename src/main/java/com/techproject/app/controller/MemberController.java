package com.techproject.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.techproject.app.model.Member;
import com.techproject.app.repo.MemberRepo;


@RestController // telling spring this is restful service//it receives the http request.
public class MemberController {

	@Autowired
	private MemberRepo repo; //this is dependency injection using autowired.
	
	//this method allows us to search member using id
	@GetMapping(path="/getMemberById/{id}")
	public Optional<Member> getMemberById(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
	
	//this method allows us to search member using their incomplete names. returns list of members if their names contains similar letter. 
	@GetMapping(path="/getMemberByName/{name}")
	public List<Member> getMemberByName(@PathVariable("name") String name)
	{
		return repo.findByName(name);
	}
}
