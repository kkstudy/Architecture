
/**
 * Project Name : Architecture
 * File Name    : UserDAO.java
 * Package Name : net.yuanmomo.dao.mapper
 * Created on   : 2014-2-7下午2:59:33
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.dao.mapper;

import java.util.List;

import net.yuanmomo.dao.vo.User;
import net.yuanmomo.exception.DAOException;

import org.apache.ibatis.annotations.Param;

/**
 * ClassName : UserDAO 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-2-7 下午2:59:33 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public interface UserDAO {
	
	/**
	 * insertBatch: 批量插入用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param userList
	 * @return
	 * @since JDK 1.6
	 */
	public int insertBatch(@Param("userList")List<User> userList) throws DAOException;
	
	/**
	 * getUserByName: 根据用户名查询用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param userList
	 * @return
	 * @since JDK 1.6
	 */
	public User getUserByName(String userName) throws DAOException;
	
}
