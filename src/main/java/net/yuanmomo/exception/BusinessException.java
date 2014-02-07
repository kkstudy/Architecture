/** 
 * Project Name : Architecture
 * Package Name : net.yuanmomo.business.exception
 * Created on   : 2014-1-23下午10:08:15
 * File Name    : BusinessException.java
 *
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */
/**
 * Project Name : Architecture
 * File Name    : BusinessException.java
 * Package Name : net.yuanmomo.business.exception
 * Created on   : 2014-1-23下午10:08:15
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.exception;

import net.yuanmomo.exception.base.NestedCheckedException;


/**
 * ClassName : BusinessException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午10:08:15 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class BusinessException extends NestedCheckedException {

	/**
	 * serialVersionUID:TODO.
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 2678899844315428999L;

	/**
	 * Creates a new instance of BusinessException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 * @param cause
	 */
	public BusinessException(String code, String message, Throwable cause) {
		super(code, message, cause);
	}

	/**
	 * Creates a new instance of BusinessException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 */
	public BusinessException(String code, String message) {
		super(code, message);
	}
}
