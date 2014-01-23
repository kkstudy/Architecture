
/**
 * Project Name : Architecture
 * File Name    : Security.java
 * Package Name : net.yuanmomo.client
 * Created on   : 2014-1-23下午5:19:53
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.client.security;

import net.yuanmomo.client.security.exception.OptionUnauthorisedException;

/**
 * ClassName : Security 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:19:53 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class UserOptionSecurity {
	public boolean check(int optionId) throws OptionUnauthorisedException{
		System.out.println("Client 层中，先调用权限检查，没有权限将抛出异常");
		boolean flag = false;
		if(flag){
			throw new OptionUnauthorisedException("Option_"+optionId+"_Unauthorised","This option is Unauthorised" + optionId);
		}
		return true;
	}
}
