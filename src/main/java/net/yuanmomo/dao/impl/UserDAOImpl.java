
/**
 * Project Name : Architecture
 * File Name    : UserDAOImpl.java
 * Package Name : net.yuanmomo.dao.impl
 * Created on   : 2014-2-7下午3:09:56
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.dao.impl;

import java.util.List;

import net.yuanmomo.dao.mapper.UserDAO;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.exception.DAOException;
import net.yuanmomo.resource.ResourceParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserDAOImpl 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-2-7 下午3:09:56 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
@Service
public class UserDAOImpl implements UserDAO{
	@Autowired
	private UserDAO userDAO;

	/**
	 * insertBatch:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param userList
	 * @return
	 * @throws DAOException
	 * @since JDK 1.6
	 */
	public int insertBatch(List<User> userList) throws DAOException{
		System.out.println("DAO的实现层，简单的数据库读取和写入操作");
		System.out.println("DAO的实现层，可能抛出sql默认异常");
		System.out.println("DAO的实现层，可能抛出自定义的dao异常");
		int count = 0;
		try {
			count = this.userDAO.insertBatch(userList);
		} catch (Exception e){
			throw new DAOException(ResourceParam.DAO_INSERT_BATCH_EXCEPTION,"Batch Insert User.class List Error",e);
		}
		return count;
	}

	/**
	 * getUserByName:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param userName
	 * @return
	 * @throws DAOException
	 * @since JDK 1.6
	 */
	public User getUserByName(String userName) throws DAOException {
		try {
			return this.userDAO.getUserByName(userName);
		} catch (Exception e) {
			throw new DAOException(ResourceParam.DAO_SELECT_EXCEPTION,"Select User by name failed, userName = "+userName,e);
		}
	}
	
	/**
	 * userDAO.
	 *
	 * @param   userDAO    the userDAO to set
	 * @since   JDK 1.6
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
