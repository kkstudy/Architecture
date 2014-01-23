
/**
 * Project Name : Architecture
 * File Name    : DefaultDAOException.java
 * Package Name : net.yuanmomo.dao.exception
 * Created on   : 2014-1-23下午5:47:12
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.service.exception;

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
public class DefaultServiceException extends GlobleDefaultException{

	/**
	 * serialVersionUID:TODO.
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 2678899844315428999L;

	/**
	 * Creates a new instance of DefaultServiceException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param id
	 * @param code
	 * @param message
	 */
	public DefaultServiceException(Exception exception) {
		// service层应该配置一个默认的错误id，错误编码
		// super(defalult_id, default_code, message);
		super("SERVICE_DATA_ERROR", exception.getMessage());
	}
	
	/**
	 * Creates a new instance of DefaultServiceException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public DefaultDAOException(String code, String detail) {
		super(code, detail);
	}
}
