/** 
 * Project Name : Architecture
 * Package Name : net.yuanmomo.business.exception
 * Created on   : 2014-1-23下午10:08:15
 * File Name    : DefaultBusinessException.java
 *
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */
/**
 * Project Name : Architecture
 * File Name    : DefaultBusinessException.java
 * Package Name : net.yuanmomo.business.exception
 * Created on   : 2014-1-23下午10:08:15
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.business.exception;

import net.yuanmomo.globle.exception.GlobleDefaultException;

/**
 * ClassName : DefaultBusinessException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午10:08:15 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class DefaultBusinessException extends GlobleDefaultException{

	/**
	 * serialVersionUID:TODO.
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 2678899844315428999L;

	/**
	 * Creates a new instance of DefaultBusinessException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param id
	 * @param code
	 * @param message
	 */
	public DefaultBusinessException(Exception exception,String detail) {
		// Business层应该配置一个默认的错误id，错误编码
		// super(code, detail);
		super("BUSINESS_ERROR", detail,);
	}

	/**
	 * Creates a new instance of DefaultBusinessException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public DefaultBusinessException(String code, String detail) {
		super(code, detail);
	}
}
