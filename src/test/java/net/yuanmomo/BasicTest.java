package net.yuanmomo;

import net.yuanmomo.business.UserBusiness;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicTest {
	protected BeanFactory beanFactory = null;
	protected UserBusiness testBusiness = null;

	@Before
	public void setUp() throws Exception {
		// 绝对路径
		// beanFactory=new
		// ClassPathXmlApplicationContext("file:E:\\workspace\\7e-NewPlatform2.0\\WebContent\\WEB-INF\\applicationContext.xml"
		// );
		// 相对路径
		beanFactory = new ClassPathXmlApplicationContext(
				"config/ApplicationContext.xml");
		testBusiness = beanFactory.getBean(UserBusiness.class);
	}

	@After
	public void tearDown() throws Exception {
		testBusiness = null;
		beanFactory = null;
	}
	@Test
	public void test() {
		try {
		} catch (Exception e) {
			System.out.println("插入异常" + e.getMessage());
			e.printStackTrace();
		}
	}
}
