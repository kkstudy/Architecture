
/**
 * Project Name : Architecture
 * File Name    : DefaultDAOException.java
 * Package Name : net.yuanmomo.dao.exception
 * Created on   : 2014-1-23下午5:47:12
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.dao.exception;

import net.yuanmomo.globle.exception.GlobleDefaultException;

/**
 * ClassName : DefaultDAOException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:47:12 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class DefaultDAOException extends GlobleDefaultException{

	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = -7880895775084353070L;

	/**
	 * Creates a new instance of DefaultDAOException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param id
	 * @param code
	 * @param message
	 */
	public DefaultDAOException(Exception exception,String detail) {
		super(exception.getMessage(), detail);
	}

	/**
	 * Creates a new instance of DefaultDAOException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public DefaultDAOException(String code, String detail) {
		super(code, detail);
	}
}
