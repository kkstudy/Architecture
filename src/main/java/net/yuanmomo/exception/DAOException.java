
/**
 * Project Name : Architecture
 * File Name    : DAOException.java
 * Package Name : net.yuanmomo.dao.exception
 * Created on   : 2014-1-23下午5:47:12
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.exception;

import net.yuanmomo.exception.base.NestedUncheckedException;


/**
 * ClassName : DAOException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:47:12 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class DAOException extends NestedUncheckedException{

	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = -7880895775084353070L;

	/**
	 * Creates a new instance of DAOException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 * @param cause
	 */
	public DAOException(String code, String message, Throwable cause) {
		super(code, message, cause);
	}

	/**
	 * Creates a new instance of DAOException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 */
	public DAOException(String code, String message) {
		super(code, message);
	}
}
