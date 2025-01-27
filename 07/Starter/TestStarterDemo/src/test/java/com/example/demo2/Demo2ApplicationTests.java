package com.example.demo2;

import com.example.demo.MyStarter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class Demo2ApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private MyStarter myStarterService;

	@Test
	public void hello() {
		System.out.println(myStarterService.print());
	}
}
