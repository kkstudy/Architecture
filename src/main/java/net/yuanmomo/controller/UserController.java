package net.yuanmomo.controller;

import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.bean.ResponseMessage;
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
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/result.do")
public class UserController {
	private static Logger logger  = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserBusiness userBusiness = null;

	@RequestMapping
	@ResponseBody
	public ResponseMessage insert(HttpServletRequest request, ModelMap map){
		User user = new User();
		user.setName("yuanmomo2");
		user.setAge((short)20);
		System.out.println("Controller层，主要装配请求数据，以及返回数据，处理异常");
		try {
			boolean flag = this.userBusiness.addUser(user);
			if(flag){
				return ResponseMessage.getSuccessResponseMessage(ResourceUtil.getString(ResourceParam.USER_REGISTER_SUCCESS));
			}else{
				return ResponseMessage.getFailedResponseMessage(ResourceUtil.getString(ResourceParam.USER_REGISTER_FAILED));
			}
		} catch (GlobleException globleE) {
			// 自定义业务逻辑异常
			logger.error("执行用户添加失败-----"+globleE.getCode()+","+globleE.getDetail());
			return ResponseMessage.getFailedResponseMessage(ResourceUtil.getString(globleE.getCode()));
		} catch (Exception e) {
			// 第三方异常，返回默认的描述信息
			logger.error("执行用户添加，发生异常-----"+e.getLocalizedMessage());
			return ResponseMessage.getFailedResponseMessage(ResourceUtil.getString(ResourceParam.SERVER_ERROR));
		} 
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