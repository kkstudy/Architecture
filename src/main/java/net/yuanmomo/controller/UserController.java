package net.yuanmomo.controller;

import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.business.UserBusiness;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.exception.GlobleException;
import net.yuanmomo.resource.ResourceParam;
import net.yuanmomo.resource.ResourceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/result.do")
public class UserController {
	private static Logger logger  = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserBusiness userBusiness = null;

	@RequestMapping
	public String insert(HttpServletRequest request, ModelMap map){
		User user = new User();
		user.setName("yuanmomo");
		user.setAge((short)20);
		System.out.println("Controller层，主要装配请求数据，以及返回数据，处理异常");
		try {
			boolean flag = this.userBusiness.addUser(user);
			if(flag){
				map.put("message", ResourceUtil.getString(ResourceParam.USER_REGISTER_SUCCESS));
			}else{
				map.put("message", ResourceUtil.getString(ResourceParam.USER_REGISTER_FAILED));
			}
		} catch (GlobleException globleE) {
			// 自定义业务逻辑异常
			map.put("message", ResourceUtil.getString(globleE.getCode()));
			logger.error("执行用户添加失败-----"+globleE.getCode()+","+globleE.getDetail());
		} catch (Exception e) {
			// 第三方异常，返回默认的描述信息
			map.put("message", ResourceUtil.getString(ResourceParam.SERVER_ERROR));
			logger.error("执行用户添加，发生异常-----"+e.getLocalizedMessage());
		} 
		return "result";
	}

	/**
	 * userBusiness.
	 *
	 * @param   userBusiness    the userBusiness to set
	 * @since   JDK 1.6
	 */
	public void setUserBusiness(UserBusiness userBusiness) {
		this.userBusiness = userBusiness;
	}
}