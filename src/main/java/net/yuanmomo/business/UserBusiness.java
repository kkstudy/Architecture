package net.yuanmomo.business;

import net.yuanmomo.business.exception.DefaultBusinessException;
import net.yuanmomo.business.exception.ObjectExistsException;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserBusiness{
	
	@Autowired
	private UserService userService=null;

	/**
	 * addUser: 插入一个用户. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param user
	 * @return
	 * @throws Exception
	 * @since JDK 1.6
	 */
	@Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
	public boolean addUser(User user) throws Exception {
		try {
			// 先判断用户名是否已经存在
			User u = this.userService.getUser(user.getName());
			
			if(u!=null){
				throw new ObjectExistsException("OBJECT_EXISTS", "This objec of "+ user.getName() +" exists.");
			}
			return this.userService.insert(user);
		} catch (Exception e) {
			throw new DefaultBusinessException(e);
		}
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
