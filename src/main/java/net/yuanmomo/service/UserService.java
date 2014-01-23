
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
import net.yuanmomo.service.exception.DefaultServiceException;
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
	
	/**
	 * getUser: 查找指定用户名的用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param name
	 * @return
	 * @throws DefaultServiceException
	 * @since JDK 1.6
	 */
	public User getUser(String name) throws DefaultServiceException{
		try {
			UserCriteria params = new UserCriteria();
			params.createCriteria().andNameEqualTo(name);
			List<User> userList = this.UserDAOImpl.selectByExample(params);
			if(userList != null && userList.size() >1){
				throw new ItemNotUniqueDAOException("MULTI_OBJECT_FOUND","The result size is "+userList.size());
			}
			return userList.get(0);
		} catch (Exception e) {
			throw new DefaultServiceException(e);
		}
	}
	
	/**
	 * insert: 插入一个新的用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param user
	 * @throws DefaultServiceException 
	 * @since JDK 1.6
	 */
	public boolean insert(User user) throws DefaultServiceException{
		try {
			int count = this.UserDAOImpl.insert(user);
			return count  == 1 ? true : false;
		} catch (Exception e) {
			throw new DefaultServiceException(e);
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
