package com.xinguan14;
import com.xinguan14.zidingyiProperties.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestDemo1Application.class)
@WebAppConfiguration
public class TestDemo1ApplicationTests {
	@Test
	public void contextLoads() {
	}
	@Autowired
	private BlogProperties blogProperties;
	@Test
	public void getHello()throws  Exception{
		Assert.assertEquals(blogProperties.getName(),"admin");
		Assert.assertEquals(blogProperties.getTitle(),"Spring Boot");
	}


}
