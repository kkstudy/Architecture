
/**
 * Project Name : Architecture
 * File Name    : UserImplProxy.java
 * Package Name : net.yuanmomo.service
 * Created on   : 2014-1-23下午6:09:17
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.dao.proxy;

import java.util.List;

import net.yuanmomo.dao.mapper.UserMapper;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.dao.vo.UserCriteria;
import net.yuanmomo.exception.ProxyException;
import net.yuanmomo.resource.ResourceParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserImplProxy 
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
public class UserImplProxy {
	@Autowired
	private UserMapper userDAOImpl;
	
	/**
	 * getUser: 查找指定用户名的用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param name
	 * @return
	 * @throws ProxyException
	 * @since JDK 1.6
	 */
	public User getUser(String name) throws ProxyException,Exception{
		System.out.println("Proxy层，包含简单的业务逻辑，同时简单封装DAO层，不允许Proxy层之间调用，向上封装Business来组合复杂业务逻辑。");
		UserCriteria params = new UserCriteria();
		params.createCriteria().andNameEqualTo(name);
		List<User> userList = this.userDAOImpl.selectByExample(params);
		if(userList == null || userList.size() == 0 ){
			return null;
		}else if(userList.size() >1){
			throw new ProxyException(ResourceParam.PROXY_MULTI_OBJECT_FOUND,"The result size is "+userList.size());
		}
		return userList.get(0);
	}
	
	/**
	 * insert: 插入一个新的用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param user
	 * @throws ProxyException 
	 * @since JDK 1.6
	 */
	public boolean insert(User user) throws Exception{
		int count = this.userDAOImpl.insert(user);
		return count  == 1 ? true : false;
	}

	/**
	 * userDAOImpl.
	 *
	 * @param   userDAOImpl    the userDAOImpl to set
	 * @since   JDK 1.6
	 */
	public void setUserDAOImpl(UserMapper userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}
}
