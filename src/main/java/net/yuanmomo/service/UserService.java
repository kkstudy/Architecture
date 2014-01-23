
/**
 * Project Name : Architecture
 * File Name    : UserService.java
 * Package Name : net.yuanmomo.service
 * Created on   : 2014-1-23下午6:09:17
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.service;

import java.util.List;

import net.yuanmomo.dao.mapper.UserMapper;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.dao.vo.UserCriteria;
import net.yuanmomo.service.exception.ItemNotUniqueDAOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserService 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午6:09:17 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
@Service
public class UserService {
	@Autowired
	private UserMapper UserDAOImpl;
	
	public User getUser(String name){
		try {
			UserCriteria params = new UserCriteria();
			params.createCriteria().andNameEqualTo(name);
			List<User> userList = this.UserDAOImpl.selectByExample(params);
			if(userList != null && userList.size() >1){
				throw new ItemNotUniqueDAOException("");
			}
		} catch (Exception e) {
			
		}
	}
	
	public void insert(User user){
		try {
			
		} catch (Exception e) {

		}
	}
	/**
	 * userDAOImpl.
	 *
	 * @param   userDAOImpl    the userDAOImpl to set
	 * @since   JDK 1.6
	 */
	public void setUserDAOImpl(UserMapper userDAOImpl) {
		UserDAOImpl = userDAOImpl;
	}
}
