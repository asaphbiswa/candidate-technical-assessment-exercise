package com.techproject.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.techproject.app.model.Member;

@Repository //telling spring I am using spring data repository. 
//this jpa repository which helps to perform advanced features or methods.
public interface MemberRepo extends JpaRepository<Member, Integer>{

	@Query("select n from Member n where n.name like %?1%") //JPQL for customize method
	List<Member> findByName(String name);
}
