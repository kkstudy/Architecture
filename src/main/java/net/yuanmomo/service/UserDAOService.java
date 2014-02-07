/**
 * Project Name : Architecture
 * File Name    : UserDAOService.java
 * Package Name : net.yuanmomo.dao.proxy
 * Created on   : 2014-2-7下午3:06:49
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.service;

import java.util.List;

import net.yuanmomo.dao.mapper.UserDAO;
import net.yuanmomo.dao.vo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserDAOService 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-2-7 下午3:06:49 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
@Service
public class UserDAOService {
	@Autowired
	private UserDAO userDAOImpl;

	/**
	 * insertBatch: 批量插入用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param userList
	 * @return
	 * @since JDK 1.6
	 */
	public int insertBatch(List<User> userList) {
		return this.userDAOImpl.insertBatch(userList);
	}
	
	/**
	 * getUser: 查找指定用户名的用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param name
	 * @return
	 * @since JDK 1.6
	 */
	public User getUser(String name) {
		System.out.println("Service层，包含简单的业务逻辑，同时简单封装DAO层，不允许Service层之间调用，向上封装Business来组合复杂业务逻辑。");
		return this.userDAOImpl.getUserByName(name);
	}
	
	/**
	 * userDAOImpl.
	 *
	 * @param   userDAOImpl    the userDAOImpl to set
	 * @since   JDK 1.6
	 */
	public void setUserDAOImpl(UserDAO userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}
}
