package com.techproject.app;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.techproject.app.model.Member;
import com.techproject.app.repo.MemberRepo;

@SpringBootTest
class TechnicalAssessment1ApplicationTests {
	
	@Autowired
	private MemberRepo memberRepo;
	
	@Test //testing using jnit
	@Order(1)
	public void findByNameTest() {
		
		List<Member> membersList = memberRepo.findByName("di");
		assertThat(membersList).size().isEqualTo(1);
	}
	
	@Test
	@Order(2)
	public void findByNameNegativeTest() {
		
		List<Member> membersList = memberRepo.findByName("di");
		assertThat(membersList).size().isEqualTo(2);
	}
}