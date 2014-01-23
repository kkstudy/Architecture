/** 
 * Project Name : Architecture
 * Package Name : net.yuanmomo.client.validation.exception
 * Created on   : 2014-1-23下午10:37:01
 * File Name    : ValidationFailedException.java
 *
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */
/**
 * Project Name : Architecture
 * File Name    : ValidationFailedException.java
 * Package Name : net.yuanmomo.client.validation.exception
 * Created on   : 2014-1-23下午10:37:01
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.client.validation.exception;

import net.yuanmomo.globle.exception.GlobleDefaultException;

/**
 * ClassName : ValidationFailedException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午10:37:01 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class ValidationFailedException extends GlobleDefaultException{
	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 6840626929150637640L;
	
	/**
	 * Creates a new instance of ValidationFailedException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public ValidationFailedException(String code, String detail) {
		super(code, detail);
	}
}
