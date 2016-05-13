package com.ssm.showcase.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-mvc.xml","/applicationContext-test.xml"})
public class AbstractContextControllerTests {

	@Autowired
	protected WebApplicationContext wac;

}
