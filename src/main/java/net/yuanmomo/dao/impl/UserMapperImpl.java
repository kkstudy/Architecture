
/**
 * Project Name : Architecture
 * File Name    : UserDAOImpl.java
 * Package Name : net.yuanmomo.dao.impl
 * Created on   : 2014-1-23下午5:44:55
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.dao.impl;

import java.util.List;

import net.yuanmomo.dao.mapper.UserMapper;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.dao.vo.UserCriteria;
import net.yuanmomo.exception.DAOException;
import net.yuanmomo.resource.ResourceParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserDAOImpl 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:44:55 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
@Service
public class UserMapperImpl implements UserMapper{
	@Autowired
	private UserMapper userMapper;

	/**
	 * insert:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param record
	 * @return
	 * @throws DAOException
	 * @since JDK 1.6
	 */
	public int insert(User user) throws DAOException  {
		System.out.println("Mapper的实现层，简单的数据库读取和写入操作");
		System.out.println("Mapper的实现层，可能抛出sql默认异常");
		System.out.println("Mapper的实现层，可能抛出自定义的dao异常");
		int count = 0;
		try {
			count = this.userMapper.insert(user);
		} catch (Exception e) {
			throw new DAOException(ResourceParam.MAPPER_INSERT_EXCEPTION,
					"Insert Object Error, the Object User is "+ user ,e);
		}
		return count;
	}

	/**
	 * selectByExample:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param example
	 * @return
	 * @throws DAOException
	 * @since JDK 1.6
	 */
	public List<User> selectByExample(UserCriteria example) throws DAOException {
		System.out.println("MAPPER的实现层，简单的数据库读取和写入操作");
		System.out.println("MAPPER的实现层，可能抛出sql默认异常");
		System.out.println("MAPPER的实现层，可能抛出自定义的dao异常");
		try {
			return this.userMapper.selectByExample(example);
		} catch (Exception e) {
			throw new DAOException(ResourceParam.MAPPER_SELECT_EXCEPTION,e.getMessage(),e);
		}
	}


	/**
	 * userMapper.
	 *
	 * @param   userMapper    the userMapper to set
	 * @since   JDK 1.6
	 */
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	/**
	 * insertSelective:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param user
	 * @return
	 * @throws DAOException
	 * @see net.yuanmomo.dao.mapper.UserMapper#insertSelective(net.yuanmomo.dao.vo.User)
	 */
	@Override
	public int insertSelective(User user) throws DAOException {
		int count = 0;
		try {
			count = this.userMapper.insertSelective(user);
		} catch (Exception e) {
			throw new DAOException(ResourceParam.MAPPER_INSERT_EXCEPTION,
					"Insert Object Error, the Object User is "+ user ,e);
		}
		return count;
	}
}
