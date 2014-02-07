/** 
 * Project Name : Architecture
 * Package Name : net.yuanmomo.client.validation.exception
 * Created on   : 2014-1-23下午10:37:01
 * File Name    : ValidationException.java
 *
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */
/**
 * Project Name : Architecture
 * File Name    : ValidationException.java
 * Package Name : net.yuanmomo.client.validation.exception
 * Created on   : 2014-1-23下午10:37:01
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.exception;


/**
 * ClassName : ValidationException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午10:37:01 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class ValidationException extends BusinessException{
	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 6840626929150637640L;

	/**
	 * Creates a new instance of ValidationException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 */
	public ValidationException(String code, String message) {
		super(code, message);
	}

	/**
	 * Creates a new instance of ValidationException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 * @param cause
	 */
	public ValidationException(String code, String message, Throwable cause) {
		super(code, message, cause);
	}
}
