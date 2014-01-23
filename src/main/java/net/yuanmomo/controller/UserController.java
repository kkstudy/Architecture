package net.yuanmomo.controller;

import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.client.UserClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/result.do")
public class UserController {

	@Autowired
	private UserClient userClient = null;

	@RequestMapping
	public String insert(HttpServletRequest request, ModelMap map){
		System.out.println("Controller层，主要装配请求数据，以及返回数据，不做异常处理");
		
		return "result";
	}

	/**
	 * userClient.
	 *
	 * @param   userClient    the userClient to set
	 * @since   JDK 1.6
	 */
	public void setUserClient(UserClient userClient) {
		this.userClient = userClient;
	}
}