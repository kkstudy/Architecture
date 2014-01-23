/** 
 * Project Name : Architecture
 * Package Name : net.yuanmomo.business.exception
 * Created on   : 2014-1-23下午10:12:44
 * File Name    : ObjectExistsException.java
 *
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */
/**
 * Project Name : Architecture
 * File Name    : ObjectExistsException.java
 * Package Name : net.yuanmomo.business.exception
 * Created on   : 2014-1-23下午10:12:44
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.business.exception;


/**
 * ClassName : ObjectExistsException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午10:12:44 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class ObjectExistsException extends DefaultBusinessException{

	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 6458805457305649109L;

	/**
	 * Creates a new instance of ObjectExistsException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 */
	public ObjectExistsException(String code,String detail) {
		super(code, detail);
	}
}
