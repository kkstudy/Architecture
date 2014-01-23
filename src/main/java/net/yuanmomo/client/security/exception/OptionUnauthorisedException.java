/** 
 * Project Name : Architecture
 * Package Name : net.yuanmomo.client.security.exception
 * Created on   : 2014-1-23下午10:31:00
 * File Name    : OptionUnauthorisedException.java
 *
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */
/**
 * Project Name : Architecture
 * File Name    : OptionUnauthorisedException.java
 * Package Name : net.yuanmomo.client.security.exception
 * Created on   : 2014-1-23下午10:31:00
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.client.security.exception;

import net.yuanmomo.globle.exception.GlobleDefaultException;

/**
 * ClassName : OptionUnauthorisedException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午10:31:00 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class OptionUnauthorisedException extends GlobleDefaultException{
	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = -6398075339170968313L;
	
	/**
	 * Creates a new instance of OptionUnauthorisedException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public OptionUnauthorisedException(String code,String detail) {
		super(code, detail);
	}

}
