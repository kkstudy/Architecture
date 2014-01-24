
/**
 * Project Name : Architecture
 * File Name    : Rreturn.java
 * Package Name : net.yuanmomo.bean
 * Created on   : 2014-1-24下午1:48:23
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.bean;

import net.yuanmomo.resource.ResourceParam;
import net.yuanmomo.resource.ResourceUtil;

/**
 * ClassName : ResponseMessage 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-24 下午1:48:23 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
public class ResponseMessage {
	private String statusCode;
	private String message;
	private Object returnValue;
	
	/**
	 * Creates a new instance of ResponseMessage.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param statusCode
	 * @param message
	 */
	private ResponseMessage(String statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}

	/**
	 * Creates a new instance of ResponseMessage.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param statusCode
	 * @param message
	 * @param returnValue
	 */
	private ResponseMessage(String statusCode, String message, Object returnValue) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.returnValue = returnValue;
	}
	
	/**
	 * Creates a new instance of ResponseMessage.
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * @param returnValue
	 */
	public ResponseMessage(Object returnValue) {
		super();
		this.returnValue = returnValue;
	}

	/**
	 * getSuccessResponseMessage: 默认操作成功提示信息. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return
	 * @since JDK 1.6
	 */
	public static ResponseMessage getSuccessResponseMessage(){
		return new ResponseMessage(ResourceUtil.getString(ResourceParam.STATUS_CODE_SUCCESS),ResourceUtil.getString(ResourceParam.STATUS_CODE_SUCCESS_MESSAGE));
	}
	
	/**
	 * getSuccessResponseMessage: 操作成功，并显示自定义结果信息. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param message
	 * @return
	 * @since JDK 1.6
	 */
	public static ResponseMessage getSuccessResponseMessage(String message){
		return new ResponseMessage(ResourceUtil.getString(ResourceParam.STATUS_CODE_SUCCESS),message);
	}
	
	/**
	 * getSuccessResponseMessage: 操作成功，并返回结果数据. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param value
	 * @return
	 * @since JDK 1.6
	 */
	public static ResponseMessage getSuccessResponseMessage(Object value){
		return new ResponseMessage(ResourceUtil.getString(ResourceParam.STATUS_CODE_SUCCESS),ResourceUtil.getString(ResourceParam.STATUS_CODE_SUCCESS_MESSAGE),value);
	}
	
	/**
	 * getFailedResponseMessage: 默认操作失败提示信息. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return
	 * @since JDK 1.6
	 */
	public static ResponseMessage getFailedResponseMessage(){
		return new ResponseMessage(ResourceUtil.getString(ResourceParam.STATUS_CODE_FAILED),ResourceUtil.getString(ResourceParam.STATUS_CODE_FAILED_MESSAGE));
	}
	
	/**
	 * getFailedResponseMessage: 操作失败，并显示自定义错误描述. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param message
	 * @return
	 * @since JDK 1.6
	 */
	public static ResponseMessage getFailedResponseMessage(String message){
		return new ResponseMessage(ResourceUtil.getString(ResourceParam.STATUS_CODE_FAILED),message);
	}
	
	/**
	 * getTimeoutResponseMessage: 系统超时提示信息，针对ajax操作. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return
	 * @since JDK 1.6
	 */
	public static ResponseMessage getTimeoutResponseMessage(){
		return new ResponseMessage(ResourceUtil.getString(ResourceParam.STATUS_CODE_TIMEOUT),ResourceUtil.getString(ResourceParam.STATUS_CODE_TIMEOUT_MESSAGE));
	}
	
	/**
	 * getOptionUnauthorizedResponseMessage: 权限不足提示信息. <br/>
	 *
	 * @author Hongbin Yuan
	 * @return
	 * @since JDK 1.6
	 */
	public static ResponseMessage getOptionUnauthorizedResponseMessage(){
		return new ResponseMessage(ResourceUtil.getString(ResourceParam.STATUS_CODE_OPTION_UNAUTHORIZED),ResourceUtil.getString(ResourceParam.STATUS_CODE_OPTION_UNAUTHORIZED_MESSAGE));
	}
	/**
	 * statusCode.
	 *
	 * @return  the statusCode
	 * @since   JDK 1.6
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * message.
	 *
	 * @return  the message
	 * @since   JDK 1.6
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * returnValue.
	 *
	 * @return  the returnValue
	 * @since   JDK 1.6
	 */
	public Object getReturnValue() {
		return returnValue;
	}
}
