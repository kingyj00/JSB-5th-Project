package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 10; i++) {
			String subject = String.format("치킨먹을까?피자먹을까?:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}
}