
/**
 * Project Name : Architecture
 * File Name    : UserImplService.java
 * Package Name : net.yuanmomo.service
 * Created on   : 2014-1-23下午6:09:17
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.service;

import net.yuanmomo.dao.mapper.UserMapper;
import net.yuanmomo.dao.vo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserImplService 
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
public class UserMapperService {
	@Autowired
	private UserMapper userMapperImpl;
	
	/**
	 * insert: 插入一个新的用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param user
	 * @since JDK 1.6
	 */
	public boolean insert(User user){
		int count = this.userMapperImpl.insertSelective(user);
		return count  == 1 ? true : false;
	}

	/**
	 * userMapperImpl.
	 *
	 * @param   userMapperImpl    the userMapperImpl to set
	 * @since   JDK 1.6
	 */
	public void setUserMapperImpl(UserMapper userMapperImpl) {
		this.userMapperImpl = userMapperImpl;
	}
}
