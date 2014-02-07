package net.yuanmomo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.bean.ResponseMessage;
import net.yuanmomo.business.UserBusiness;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.exception.base.NestedCheckedException;
import net.yuanmomo.exception.base.NestedUncheckedException;
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
		User user = null;
//		User user = new User();
//		user.setName("yuanmomo2");
//		user.setAge((short)20);
//		return ResponseMessage.getOptionUnauthorizedResponseMessage();
		System.out.println("Controller层，主要装配请求数据，以及处理异常,返回操作结果，以及数据结果，");
		try {
			boolean flag = this.userBusiness.addUser(user);
			if(flag){
				return ResponseMessage.getSuccessResponseMessage(ResourceUtil.getDescription(ResourceParam.USER_REGISTER_SUCCESS));
			}else{
				return ResponseMessage.getFailedResponseMessage(ResourceUtil.getDescription(ResourceParam.USER_REGISTER_FAILED));
			}
		} catch (NestedCheckedException checkedException) {
			// 自定义业务逻辑异常
			logger.error("执行用户添加失败-----"+ checkedException.getCode() + "," + checkedException.getMessage());
			return ResponseMessage.getFailedResponseMessage(ResourceUtil.getDescription(checkedException.getCode()));
		} catch (NestedUncheckedException uncheckedException) {
			// 系统非检查异常异常，比如SQLException
			logger.error("执行用户添加失败-----"+ uncheckedException.getCode() + "," + uncheckedException.getMessage());
			uncheckedException.printStackTrace();
			return ResponseMessage.getFailedResponseMessage(ResourceUtil.getDescription(uncheckedException.getCode()));
		}
	}

	@RequestMapping(params = "mode=batch")
	@ResponseBody
	public ResponseMessage insertBatch(HttpServletRequest request, ModelMap map){
		User user1 = new User("yuanmomo101", (short)101, new Date());
		User user2 = new User("yuanmomo102", (short)102, new Date());
		User user3 = new User("yuanmomo103", (short)103, new Date());
		User user4 = new User("yuanmomo104", (short)104, new Date());
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		try {
			int count = this.userBusiness.insertBatch(userList);
			if(count > 0){
				return ResponseMessage.getSuccessResponseMessage(ResourceUtil.getDescription(ResourceParam.USER_BATCH_INSERT_SUCCESS));
			}else{
				return ResponseMessage.getFailedResponseMessage(ResourceUtil.getDescription(ResourceParam.USER_BATCH_INSERT_FAILED));
			}
		} catch (NestedUncheckedException uncheckedException) {
			// 系统非检查异常异常，比如SQLException
			logger.error("批量添加用户失败-----"+ uncheckedException.getCode() + "," + uncheckedException.getMessage());
			uncheckedException.printStackTrace();
			return ResponseMessage.getFailedResponseMessage(ResourceUtil.getDescription(uncheckedException.getCode()));
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