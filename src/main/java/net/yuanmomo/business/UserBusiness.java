package net.yuanmomo.business;

import net.yuanmomo.dao.proxy.UserImplProxy;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.exception.BusinessException;
import net.yuanmomo.exception.ValidationException;
import net.yuanmomo.resource.ResourceParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserBusiness{
	
	@Autowired
	private UserImplProxy userImplProxy=null;

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
	public boolean addUser(User user) throws ValidationException,BusinessException,Exception {
		System.out.println("Business层，首先进行数据校验，感觉也行可以单独抽象为一个新的validation层。");
		System.out.println("Business层然后处理业务逻辑，通过组合调用Proxy层中简单的业务逻辑来处理复杂的业务逻辑。");
		
		// 校验用户数据
		if(user == null){
			throw new ValidationException(ResourceParam.VALIDATION_USER_NULL,"User");
		}
		if(user.getName() == null || "".equals(user.getName().trim())){
			throw new ValidationException(ResourceParam.VALIDATION_USER_NAME_ILLEGAL,"user.name="+user.getName());
		}
		if(user.getAge() == null || user.getAge()<=0 || user.getAge()>=200){
			throw new ValidationException(ResourceParam.VALIDATION_USER_AGE_ILLEGAL,"user.age="+user.getAge());
		}
		
		// 判断用户名是否已经存在
		User u = this.userImplProxy.getUser(user.getName());
		
		if(u!=null){
			throw new BusinessException(ResourceParam.BUSINESS_USER_NAME_EXISTS, "user.getName=" + user.getName());
		}
		return this.userImplProxy.insert(user);
	}

	/**
	 * userImplProxy.
	 *
	 * @param   userImplProxy    the userImplProxy to set
	 * @since   JDK 1.6
	 */
	public void setUserImplProxy(UserImplProxy userImplProxy) {
		this.userImplProxy = userImplProxy;
	}
}
