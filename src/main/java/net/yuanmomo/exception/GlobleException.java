
/**
 * Project Name : Architecture
 * File Name    : GlobleException.java
 * Package Name : net.yuanmomo.globle.exception
 * Created on   : 2014-1-23下午5:48:33
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.exception;
/**
 * ClassName : GlobleException 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:48:33 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class GlobleException extends RuntimeException{

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
	 * fixId: 该异常的解决方案编号.
	 * @since JDK 1.6
	 */
	private int fixId;
	
	/**
	 * fixInfo:该异常的解决方案详细信息.
	 * @since JDK 1.6
	 */
	private String fixInfo;
	
	/**
	 * Creates a new instance of GlobleException.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param code
	 * @param detail
	 */
	public GlobleException(String code, String detail) {
		super();
		this.code = code;
		this.detail = detail;
	}
	
	/**
	 * code.
	 *
	 * @return  the code
	 * @since   JDK 1.6
	 */
	public String getCode() {
		return code;
	}

	/**
	 * code.
	 *
	 * @param   code    the code to set
	 * @since   JDK 1.6
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * fixId.
	 *
	 * @return  the fixId
	 * @since   JDK 1.6
	 */
	public int getFixId() {
		return fixId;
	}

	/**
	 * fixId.
	 *
	 * @param   fixId    the fixId to set
	 * @since   JDK 1.6
	 */
	public void setFixId(int fixId) {
		this.fixId = fixId;
	}

	/**
	 * fixInfo.
	 *
	 * @return  the fixInfo
	 * @since   JDK 1.6
	 */
	public String getFixInfo() {
		return fixInfo;
	}

	/**
	 * fixInfo.
	 *
	 * @param   fixInfo    the fixInfo to set
	 * @since   JDK 1.6
	 */
	public void setFixInfo(String fixInfo) {
		this.fixInfo = fixInfo;
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
		return "GlobleException [code=" + code +", detail=" + detail + ", fixId=" + fixId + ", fixInfo="
				+ fixInfo + "]";
	}
}
