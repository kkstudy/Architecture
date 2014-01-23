
/**
 * Project Name : Architecture
 * File Name    : GlobleDefaultException.java
 * Package Name : net.yuanmomo.globle.exception
 * Created on   : 2014-1-23下午5:48:33
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.globle.exception;
/**
 * ClassName : GlobleDefaultException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:48:33 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class GlobleDefaultException extends Exception{

	/**
	 * serialVersionUID:TODO.
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 4637076834192093989L;
	
	/**
	 * code: 异常的错误编码.
	 * @since JDK 1.6
	 */
	private String code;
	
	/**
	 * info: 发生异常处的详细信息.
	 * @since JDK 1.6
	 */
	private String detail;
	
	/**
	 * message: 该异常的描述信息.
	 * @since JDK 1.6
	 */
	private String message;
	
	/**
	 * fixId: 该异常的解决方案编号.
	 * @since JDK 1.6
	 */
	private int fixId;
	
	/**
	 * fixInfo:该异常的解决方案详细信息.
	 * @since JDK 1.6
	 */
	private String fixInfo;
	
	/*
	 * 有其它的一些错误信息
	 * 
	 */
	/**
	 * Creates a new instance of GlobleDefaultException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public GlobleDefaultException(String code, String detail) {
		super();
		this.code = code;
		this.detail = detail;
	}
	
	/**
	 * Creates a new instance of GlobleDefaultException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param exception
	 * @param detail
	 */
	public GlobleDefaultException(Exception exception,String detail) {
		super();
		this.message = exception.getMessage();
		this.detail = detail;
	}

	/**
	 * detail.
	 *
	 * @return  the detail
	 * @since   JDK 1.6
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * detail.
	 *
	 * @param   detail    the detail to set
	 * @since   JDK 1.6
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	 * toString:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GlobleDefaultException [code=" + code
				+ ", detail=" + detail + ", message=" + message + ", fixId="
				+ fixId + ", fixInfo=" + fixInfo + "]";
	}
}
