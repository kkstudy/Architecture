/**
 * Project Name : Architecture
 * File Name    : NestedException.java
 * Package Name : net.yuanmomo.exception
 * Created on   : 2014-2-7下午6:27:17
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.exception.base;


/**
 * ClassName : NestedUncheckedException Function : TODO ADD FUNCTION. Reason :
 * TODO ADD REASON. Date : 2014-2-7 下午6:27:17
 * 
 * @author : Hongbin Yuan
 * @version
 * @since JDK 1.6
 * @see
 */
public class NestedUncheckedException extends RuntimeException {

	/**
	 * serialVersionUID:TODO .
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = -4987032739518771509L;
	
	/**
	 * code: 异常的错误编码.
	 * @since JDK 1.6
	 */
	private String code;
	
	/**
	 * cause:TODO 被封装的异常.
	 * @since JDK 1.6
	 */
	private Throwable cause;
	
	public String getCode() {
		return code;
	}
	
	/**
	 * Creates a new instance of NestedUncheckedException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 */
	public NestedUncheckedException(String code,String message) {
		super(message);
		this.code = code;
	}

	/**
	 * Creates a new instance of NestedUncheckedException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param message
	 * @param cause
	 */
	public NestedUncheckedException(String code,String message, Throwable cause) {
		this(code, message);
		this.cause = cause;
	}

	@Override
	public void printStackTrace() {
		this.cause.printStackTrace();
	}
}
