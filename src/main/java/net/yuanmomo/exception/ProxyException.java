
/**
 * Project Name : Architecture
 * File Name    : ProxyException.java
 * Package Name : net.yuanmomo.dao.exception
 * Created on   : 2014-1-23下午5:47:12
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.exception;


/**
 * ClassName : ProxyException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:47:12 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class ProxyException extends GlobleException{

	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 2785330390054754514L;

	/**
	 * Creates a new instance of DefaultServiceException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public ProxyException(String code, String detail) {
		super(code, detail);
	}
}
